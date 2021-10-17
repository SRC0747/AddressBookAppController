package com.bridgelabz.AddressBookapp.Controller.service;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.builder.AddressBuilder;
import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import com.bridgelabz.AddressBookapp.Controller.exception.CustomException;
import com.bridgelabz.AddressBookapp.Controller.repository.AddressBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import javax.annotation.security.RunAs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * Test class to check AddressBookService using @InjectMocks and @Mock building connection with HTTP request.
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */


class AddressBookServiceTest {

    @InjectMocks
    private AddressBookService addressBookService;
    @Mock
    private AddressBookRepository addressBookRepository;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private AddressBuilder addressBuilder;

    @Test
    public void getPersonByID_WhenIdIsGiven() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        Assertions.assertEquals(1, addressBookData.getId());
    }

    @Test
    public void getPersonByName_WhenNameIsGiven() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setName("Sam");
        Assertions.assertEquals("Sam", addressBookData.getName());
    }

    @Test
    public void addPersonDetails_WhenDetailingIsAdded() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        addressBookData.setName("Sam");
        addressBookData.setMobileNo("0747");
        addressBookData.setCity("Kolkata");
        addressBookData.setState("WB");
        addressBookData.setEmail("src@gmail.com");
        Assertions.assertEquals(1, addressBookData.getId());
        assertThat(addressBookData.getName()).isEqualTo("Sam");
        assertThat(addressBookData.getMobileNo()).isEqualTo("0747");
        assertThat(addressBookData.getCity()).isEqualTo("Kolkata");
        assertThat(addressBookData.getState()).isEqualTo("WB");
        assertThat(addressBookData.getEmail()).isEqualTo("src@gmail.com");
    }
}