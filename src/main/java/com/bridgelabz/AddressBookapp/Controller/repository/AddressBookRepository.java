package com.bridgelabz.AddressBookapp.Controller.repository;

import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

    Optional<AddressBookData> findByName(String name);
    
    Optional<AddressBookData> findByMobileNo(int mobileNo);

    Optional<AddressBookData> findByState(String state);

    Optional<AddressBookData> findByCity(String city);

    Optional<AddressBookData> findByEmail(String email);
}
