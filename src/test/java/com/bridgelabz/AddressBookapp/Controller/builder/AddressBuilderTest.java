package com.bridgelabz.AddressBookapp.Controller.builder;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for the business logic for AddressBook App Builder service
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 11-10-2021
 */


class AddressBuilderTest {

    @InjectMocks
    private AddressBuilder addressBuilder;

    @Test
    public void buildDOTest() {
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setName("Sampriti");
        addressBookDTO.setState("WB");
        AddressBookData addressBookDO = addressBuilder.buildDO(addressBookDTO);
        assertEquals("Sampriti", addressBookDO.getName());
        assertEquals("WB", addressBookDO.getState());
    }
}