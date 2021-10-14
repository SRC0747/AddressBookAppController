package com.bridgelabz.AddressBookapp.Controller.repository;

import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Creating AddressBook Repository to make a connection with JPA and handling http requests
 *
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

    Optional<AddressBookData> findByName(String name);
    
    Optional<AddressBookData> findByMobileNo(int mobileNo);

    Optional<AddressBookData> findByState(String state);

    Optional<AddressBookData> findByCity(String city);

    Optional<AddressBookData> findByEmail(String email);
}
