package com.bridgelabz.AddressBookapp.Controller.service;

import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import com.bridgelabz.AddressBookapp.Controller.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressBookService {

    @Autowired
    private static AddressBookRepository addressBookRepository;

    public static List<AddressBookData> addressBookDataList(){
        return addressBookRepository.findAll();
    }

    public AddressBookData getPersonById(int id){
        Optional<AddressBookData> addressBookData = addressBookRepository.findById(id);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByName(String name){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByName(name);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByMobileNo(int mobileNo){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByMobileNo(mobileNo);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByState(String state){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByState(state);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByCity(String city){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByCity(city);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByEmail(String email){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByEmail(email);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData addPerson(AddressBookData addressBookData){
        return addressBookRepository.save(addressBookData);
    }

    public String deletePerson(int id){
        Optional<AddressBookData> addressBookData = addressBookRepository.findById(id);
        if(addressBookData.isPresent()){
            addressBookRepository.delete(addressBookData.get());
            return "Employee Record is deleted successfully.";
        }
        return "Record does not exists with this id : " + id;
    }

    public AddressBookData updatePerson(AddressBookData addressBookData){
        return addressBookRepository.save(addressBookData);
    }
}
