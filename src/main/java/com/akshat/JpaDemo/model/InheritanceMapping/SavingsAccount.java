package com.akshat.JpaDemo.model.InheritanceMapping;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
//@DiscriminatorValue("Savings")
@PrimaryKeyJoinColumn(name = "id")
public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, double interestRate) {
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }
}
