package com.bridgelabz.AddressBookapp.Controller.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class AddressBookData {

    @Id
    private int id;
    private String name;
    private int mobileNo;
    private String state;
    private String city;
    private String email;
}
