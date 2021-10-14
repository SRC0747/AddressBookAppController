package com.bridgelabz.AddressBookapp.Controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Creating AddressBook DTO for the remote call purpose in Designing Pattern
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {
    private int id;
    private String name;
    private String mobileNo;
    private String state;
    private String city;
    private String email;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
