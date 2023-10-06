package com.spring.moviecatalogservice.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.moviecatalogservice.model.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItems> getCatalog(@PathVariable("userId") String userId) {
	
		//get all rated movies IDs
		List<Ratings> ratings = Arrays.asList(
				new Ratings("1234",5),
				new Ratings("5678",3)
				);
		
		return ratings.stream().map(rating -> { 
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItems(movie.getName(),"Test Desc",rating.getRatings());
		
		}) 
		.collect(Collectors.toList());
		
		//For each movie ID, call movie info service and get details
		
		// Put them all together
		
		
		
		
	}

}
