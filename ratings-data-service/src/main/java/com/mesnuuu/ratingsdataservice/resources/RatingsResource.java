package com.mesnuuu.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mesnuuu.ratingsdataservice.model.Rating;
import com.mesnuuu.ratingsdataservice.model.UserRating;

@RestController
@EnableEurekaClient
public class RatingsResource {

	@GetMapping("/ratingsdata/movies/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@GetMapping("/ratingsdata/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {

		UserRating userRating = new UserRating();
		userRating.initData(userId);
		return userRating;
	}

}
