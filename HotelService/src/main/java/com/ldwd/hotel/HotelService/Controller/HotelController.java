package com.ldwd.hotel.HotelService.Controller;

import com.ldwd.hotel.HotelService.Entities.Hotel;
import com.ldwd.hotel.HotelService.HotelServiceApplication;
import com.ldwd.hotel.HotelService.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }
    @GetMapping("/{hotelid}")
    public ResponseEntity<Hotel> createHotel(@PathVariable int hotelid){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelid));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAll());

    }

}
