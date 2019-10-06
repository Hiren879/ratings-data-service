package io.movie.ratingsdataservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.movie.ratingsdataservice.model.MovieRating;

@RestController
@RequestMapping("/movie-ratings")
public class MovieRatingsApi {

	@GetMapping("/{movieId}")
	public MovieRating getMovieRating(@PathVariable String movieId) {
		return new MovieRating("1", 4);
	}

}
