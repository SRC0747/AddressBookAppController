package com.bridgelabz.AddressBookapp.Controller.exception;

import com.bridgelabz.AddressBookapp.Controller.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.xml.bind.ValidationException;

/**
 * Address Book exception handler handles exception and shows HTTP Bad Requests or display if Internal servererror occurs.
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 15-10-2021
 */

@ControllerAdvice
public class CustomExceptionHandler {

   /* @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ResponseDTO> handleCustomException(CustomException customException){
        return new ResponseEntity<>(new ResponseDTO(customException.getMessage(), null), HttpStatus.BAD_REQUEST);
    }*/


   /* @ExceptionHandler(value = ValidationException.class)
    public ResponseEntity<ResponseDTO> handleValidationException(ValidationException validationException){
        return new ResponseEntity<>(new ResponseDTO(validationException.getMessage(), null), HttpStatus.NOT_FOUND);
    }*/

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> globalExceptionHandler(Exception ex) {
        return new ResponseEntity<>(new ResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), null),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseDTO> customExceptionHandler(Exception ex) {
        return new ResponseEntity<>(new ResponseDTO(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), null),
                HttpStatus.BAD_REQUEST);
    }
}
