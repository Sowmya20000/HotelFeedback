package com.capg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.HotelFeedbackModel.HotelFeedback;
import com.capg.Repo.HotelFeedbackRepo;

@Service
public class HotelFeedbackService {
	@Autowired
	HotelFeedbackRepo hotelFeedbackRepo;

	public HotelFeedback addHotelFeedback(HotelFeedback hotelFeedback) {
		return hotelFeedbackRepo.save(hotelFeedback);
	}
	
}
