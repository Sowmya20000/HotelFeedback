package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capg.HotelFeedbackModel.HotelFeedback;
import com.capg.Service.HotelFeedbackService;

@Controller
@RequestMapping("/Hotelfeedback")
public class HotelFeedbackController {
	@Autowired
	HotelFeedbackService hotelFeedbackService;
	@PostMapping("/addHotelFeedback")
	public ResponseEntity<HotelFeedback>addHotelFeedbackDetails(@Validated @RequestBody HotelFeedback hotelFeedback){
		HotelFeedback hotelResponse = hotelFeedbackService.addHotelFeedback(hotelFeedback);
		return new ResponseEntity<HotelFeedback>(hotelResponse,HttpStatus.OK);
	}
	
}
