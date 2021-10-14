package com.bridgelabz.AddressBookapp.Controller.builder;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * AddressBuilder builds the AddressBookData Entity Configuration with HTTP request response in application
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Component
public class AddressBuilder {
    public AddressBookData buildDO(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookDO = new AddressBookData();
        BeanUtils.copyProperties(addressBookDTO, addressBookDO);
        return addressBookDO;
    }
}
