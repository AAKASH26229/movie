package com.spring.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ratingsdataservice.Model.Ratings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Ratings getRatings(@PathVariable("movieId") String movieId)
	{
		return new Ratings(movieId, 4);
	}

}
