package com.nihanim.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();

    public Owner(long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}