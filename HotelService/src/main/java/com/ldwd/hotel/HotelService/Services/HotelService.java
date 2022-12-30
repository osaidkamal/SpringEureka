package com.ldwd.hotel.HotelService.Services;

import com.ldwd.hotel.HotelService.Entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(int id);
}
