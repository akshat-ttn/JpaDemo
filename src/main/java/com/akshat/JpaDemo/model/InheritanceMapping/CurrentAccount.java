package com.akshat.JpaDemo.model.InheritanceMapping;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
//@DiscriminatorValue("Current")
@PrimaryKeyJoinColumn(name = "id")
public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double balance, double overdraftLimit) {
        super(accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
}
