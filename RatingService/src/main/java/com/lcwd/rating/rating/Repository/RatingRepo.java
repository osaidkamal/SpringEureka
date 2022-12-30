package com.lcwd.rating.rating.Repository;

import com.lcwd.rating.rating.Entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,Integer> {
    //customerfindermethod
    List<Rating> findByUserId(int userid);
    List<Rating> findByHotelId(int hotelId);
}
