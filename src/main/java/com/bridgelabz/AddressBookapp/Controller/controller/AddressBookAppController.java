package com.bridgelabz.AddressBookapp.Controller.controller;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import com.bridgelabz.AddressBookapp.Controller.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AddressBookAppController setting up CRUD operations in application
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@RequestMapping("/Api")
@RestController
public class AddressBookAppController {
    // CRUD
    //read
    //creating
    //updating
    //deleting

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping(value = "/person")
    public List<AddressBookData> person(){
        return addressBookService.addressBookDataList();
    }

    @GetMapping(value = "/get-person-by-id")
    public AddressBookData getPersonById(@RequestParam int id){
        return addressBookService.getPersonById(id);
    }

    @GetMapping(value = "/get-person-by-Name")
    public AddressBookData getPersonByName(@RequestParam String name) {
        return addressBookService.getPersonByName(name);
    }

    @GetMapping(value = "/get-person-by-mobile")
    public AddressBookData getPersonByMobileNo(@RequestParam int mobileNo){
        return addressBookService.getPersonByMobileNo(mobileNo);
    }

    @GetMapping(value = "/get-person-by-State")
    public AddressBookData getPersonByState(@RequestParam String state) {
        return addressBookService.getPersonByState(state);
    }

    @GetMapping(value = "/get-person-by-City")
    public AddressBookData getPersonByCity(@RequestParam String city) {
        return addressBookService.getPersonByCity(city);
    }

    @GetMapping(value = "/get-person-by-Email")
    public AddressBookData getPersonByEmail(@RequestParam String email) {
        return addressBookService.getPersonByEmail(email);
    }

    @PostMapping(value = "/person")
    public AddressBookData addPerson(@RequestBody AddressBookData addressBookData) {
        return addressBookService.addPerson(addressBookData);
    }

    @PutMapping(value = "/person")
    public AddressBookData updatePerson(@PathVariable int id, @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updatePerson(id, addressBookDTO);
    }

    @DeleteMapping(value = "/person")
    public String deletePerson(@RequestParam int id) {
        return addressBookService.deletePerson(id);
    }

}
