package io.movie.ratingsdataservice.api;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.movie.ratingsdataservice.model.MovieRating;
import io.movie.ratingsdataservice.response.MovieRatingResponse;

@RestController
@RequestMapping("/movie-ratings")
public class MovieRatingsApi {

	@GetMapping("/{userId}")
	public MovieRatingResponse getMovieRatings(@PathVariable("userId") String userId) {
		return new MovieRatingResponse(Arrays.asList(new MovieRating("123", 5), new MovieRating("456", 9)));
	}

}
