package com.lcwd.rating.rating.Services;

import com.lcwd.rating.rating.Entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {
    Rating create(Rating rating);
    List<Rating> getAll();
    List<Rating> getRatingByUserId(int userId);
    List<Rating> getRatingByHotelId(int hotelId);

}
