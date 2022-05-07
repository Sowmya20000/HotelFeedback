package com.capg.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.HotelFeedbackModel.HotelFeedback;

@Repository
public interface HotelFeedbackRepo extends JpaRepository<HotelFeedback, Integer>{

}
