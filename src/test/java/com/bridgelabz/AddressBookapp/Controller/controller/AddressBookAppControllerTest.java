package com.bridgelabz.AddressBookapp.Controller.controller;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.service.IAddressBookService;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.annotation.security.RunAs;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * Test class to check AddressBookAppController using @InjectMocks and @Mock building connection with HTTP request.
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */


class AddressBookAppControllerTest {

    @InjectMocks
    private AddressBookAppController addressBookAppController;

    @Mock
    private IAddressBookService iAddressBookService;

    @Test
    public void getAddressTest() {
        when(iAddressBookService.getAddresses()).thenReturn(Lists.newArrayList(new AddressBookDTO()));
        IAddressBookService addressBookController;
        ResponseEntity<List<AddressBookDTO>> responseEntity = null;
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(1, responseEntity.getBody().size());
    }
}