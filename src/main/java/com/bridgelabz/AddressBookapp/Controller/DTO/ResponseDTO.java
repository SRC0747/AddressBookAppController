package com.bridgelabz.AddressBookapp.Controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response Dto transfers data to  response the http request
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private int statusCode;
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

}
