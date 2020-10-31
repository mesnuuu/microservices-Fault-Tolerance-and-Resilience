package com.mesnuuu.movieinfoservice.models;

public class Movie {

	private String movieId;
	private String name;
	private String description;

	public Movie() {
		super();
	}

	public Movie(String movieId, String name, String description) {
		super();
		this.name = name;
		this.movieId = movieId;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
