package com.bridgelabz.AddressBookapp.Controller.service;

import com.bridgelabz.AddressBookapp.Controller.DTO.AddressBookDTO;
import com.bridgelabz.AddressBookapp.Controller.entity.AddressBookData;
import com.bridgelabz.AddressBookapp.Controller.exception.CustomException;
import com.bridgelabz.AddressBookapp.Controller.repository.AddressBookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Class for the business logic for AddressBook App Controller service
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 11-10-2021
 */

@Service
public class AddressBookService {

    @Autowired
    private static AddressBookRepository addressBookRepository;
    @Autowired
    private ModelMapper modelMapper;

    /**
     * Method for getting all the students from database
     * @return list of {@link AddressBookData Entity}
     */

    public static List<AddressBookData> addressBookDataList(){
        return addressBookRepository.findAll();
    }

    /**
     * Method for getting person by its id
     * @param id unique identifier for record
     * @return singular {@link AddressBookData Entity}
     */

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

    /**
     *
     * @param AddressBookDTO
     * @return
     */

    public AddressBookData addPerson(AddressBookData addressBookData){
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        modelMapper.map(addressBookDTO, addressBookData);
        return addressBookRepository.save(addressBookData);
        //return addressBookRepository.save(addressBookData);
    }

    public String deletePerson(int id){
        Optional<AddressBookData> addressBookData = addressBookRepository.findById(id);
        if(addressBookData.isPresent()){
            addressBookRepository.delete(addressBookData.get());
            return "Employee Record is deleted successfully.";
        }
        //return "Record does not exists with this id : " + id;
        throw new CustomException("Record does not exists with this id : " + id);
    }

    public AddressBookData updatePerson(int id, AddressBookDTO addressBookDTO){
        Optional<AddressBookData> optionalAddressBookEntity = addressBookRepository.findById(id);
        if(optionalAddressBookEntity.isPresent()) {
            AddressBookData addressBookData = optionalAddressBookEntity.get();
            addressBookData.setId(addressBookDTO.getId());
            addressBookData.setName(addressBookDTO.getName());
            addressBookData.setState(addressBookData.getState());
            addressBookData.setCity(addressBookData.getCity());
            addressBookData.setMobileNo(addressBookData.getMobileNo());
            addressBookData.setEmail(addressBookData.getEmail());
            return addressBookRepository.save(addressBookData);
        }
        //return addressBookRepository.save(addressBookData);
        return null;
    }
    List<AddressBookDTO> addresses;
    public List<AddressBookDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressBookDTO> addresses) {
        this.addresses = addresses;
    }

    public AddressBookDTO addAddressBook(AddressBookDTO addressBookDTO) {
        return addressBookDTO;
    }
}
