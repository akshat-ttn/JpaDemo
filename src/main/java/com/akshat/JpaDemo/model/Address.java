package com.akshat.JpaDemo.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Embeddable
public class Address {
    private int streetNumber;
    private String location;
    private String state;
}
