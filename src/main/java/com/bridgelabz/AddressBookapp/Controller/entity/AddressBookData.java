package com.bridgelabz.AddressBookapp.Controller.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * AddressBookEntity setting up Entity Configuration related with database table in application
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Data
@Entity
public class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mobileNo;
    private String state;
    private String city;
    private String email;

    public void setAddress(String state) {
        this.state = state;
    }
}
