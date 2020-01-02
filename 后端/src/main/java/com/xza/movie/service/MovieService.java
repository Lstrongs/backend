package com.xza.movie.service;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */

import com.xza.movie.model.movies;

import java.util.List;

public interface MovieService {
    public List<movies> getMoviesList();
    public  int addMovie(movies movies);
    public movies selectAuthor(movies movies);
    public movies selectType(movies movies);
    public movies selectPoster(movies movies);
    public movies selectTime(movies movies);
    public movies selectActor(movies movies);
}
