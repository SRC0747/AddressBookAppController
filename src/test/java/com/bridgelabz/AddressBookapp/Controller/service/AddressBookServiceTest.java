package com.bridgelabz.AddressBookapp.Controller.service;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.builder.AddressBuilder;
import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import com.bridgelabz.AddressBookapp.Controller.repository.AddressBookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import javax.annotation.security.RunAs;

import java.util.ArrayList;
import java.util.List;

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
    public void getAddressTest() {
        ArrayList<AddressBookData> addressBookDOList = new ArrayList<>();
        AddressBookData addressBookDO1 = new AddressBookData();
        addressBookDO1.setId(1);
        addressBookDO1.setName("Sanobar");
        AddressBookData addressBookDO2 = new AddressBookData();
        addressBookDO2.setId(2);
        addressBookDO2.setName("Divya");
        addressBookDOList.add(addressBookDO1);
        addressBookDOList.add(addressBookDO2);

        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setId(1);
        addressBookDTO.setName("Sanobar");
        AddressBookDTO addressBookDTO2 = new AddressBookDTO();
        addressBookDTO2.setId(2);
        addressBookDTO2.setName("Divya");

        when(addressBookRepository.findAll()).thenReturn(addressBookDOList);
        when(modelMapper.map(((ArrayList<?>) addressBookDOList).get(0), AddressBookDTO.class)).thenReturn(
                addressBookDTO);
        when(modelMapper.map(((ArrayList<?>) addressBookDOList).get(1), AddressBookDTO.class)).thenReturn(
                addressBookDTO2);

        List<AddressBookDTO> actualAddressesList = addressBookService.getAddresses();

        assertNotNull(actualAddressesList);
        for (int i = 0; i < ((ArrayList<?>) addressBookDOList).size(); i++) {
            assertEquals(i + 1, actualAddressesList.get(i).getId());
        }
        assertEquals("Sanobar", actualAddressesList.get(0).getName());
        assertEquals("Divya", actualAddressesList.get(1).getName());
    }

    @Test
    public void addAddressBookTest() {
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setName("Sampriti");
        addressBookDTO.setAddress("WB");

        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setName("Sampriti");
        addressBookData.setAddress("WB");
        addressBookData.setId(1);

        when(addressBuilder.buildDO(addressBookDTO)).thenReturn(addressBookData);
        when(addressBookRepository.save(addressBookData)).thenReturn(addressBookData);

        AddressBookDTO actualAddressBookDTO = addressBookService.addAddressBook(addressBookDTO);
        assertNotNull(actualAddressBookDTO);
        assertEquals(1, actualAddressBookDTO.getId());
    }

}