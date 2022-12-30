package com.ldwd.hotel.HotelService.Impl;

import com.ldwd.hotel.HotelService.Exceptions.ResourceNotFoundException;
import com.ldwd.hotel.HotelService.Entities.Hotel;
import com.ldwd.hotel.HotelService.Repository.HotelRepo;
import com.ldwd.hotel.HotelService.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepo.save(hotel);

    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel get(int id) {
        return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with this id doesnt exist"));
    }
}
