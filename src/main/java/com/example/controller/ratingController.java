package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Rating;
import com.example.entity.UserRating;

@RestController
@RequestMapping("/rating")
public class ratingController {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String id) {
		return new Rating(id, 4);
	}
	@RequestMapping("/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String id) {
		
		List<Rating> ratings=Arrays.asList(new Rating("123", 4),
				new Rating("400", 3));
		UserRating ur=new UserRating(ratings);
		return ur;
		
	}

}
