package com.lcwd.rating.rating.Impl;

import com.lcwd.rating.rating.Entities.Rating;
import com.lcwd.rating.rating.Repository.RatingRepo;
import com.lcwd.rating.rating.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Rating create(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAll() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(int userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(int hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
