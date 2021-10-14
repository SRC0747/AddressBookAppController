package com.bridgelabz.AddressBookapp.Controller.exception;

/**
 * Address book exceptions throws RunTime Exceptions
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }
}
