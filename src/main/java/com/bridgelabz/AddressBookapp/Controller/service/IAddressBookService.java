package com.bridgelabz.AddressBookapp.Controller.service;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;

import java.util.List;

/**
 * IAddressBookService to access all the entries in AddressBookDTO to get,add and update addresses.
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

public interface IAddressBookService {
    List<AddressBookDTO> getAddresses();

    AddressBookDTO addAddressBook(AddressBookDTO addressBookDTO);

    AddressBookDTO updateAddressBook(int id, AddressBookDTO addressBookDTO);
}
