package com.spring.moviecatalogservice.model;

public class Ratings {

	private String movieId;
	private int ratings;
	
	public Ratings(String movieId, int i) {
		super();
		this.movieId = movieId;
		this.ratings = i;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	
	
}
