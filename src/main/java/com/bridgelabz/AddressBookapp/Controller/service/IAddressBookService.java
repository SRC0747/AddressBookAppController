package com.bridgelabz.AddressBookapp.Controller.service;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookDTO> getAddresses();

    AddressBookDTO addAddressBook(AddressBookDTO addressBookDTO);

    AddressBookDTO updateAddressBook(int id, AddressBookDTO addressBookDTO);
}
