package com.ldwd.hotel.HotelService.Exceptions;

public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException(String s) {
        super(s);

    }
    public ResourceNotFoundException(){
        super("Resource Not Found");
    }
}
