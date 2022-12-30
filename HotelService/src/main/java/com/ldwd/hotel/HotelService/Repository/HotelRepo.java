package com.ldwd.hotel.HotelService.Repository;

import com.ldwd.hotel.HotelService.Entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,Integer>{
}
