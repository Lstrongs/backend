package com.xza.movie.mapper;

import com.xza.movie.model.movies;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */
@Mapper
public interface MovieMapper {
    public List<movies> selectAllMovies();
    public movies selectMovieBymovie_name(String movie_name);
    public int insertMovie(movies movies);
    public movies selectAuthor(String movie_name);
    public movies selectType(String movie_name);
    public movies selectPoster(String movie_name);
    public movies selectTime(String movie_name);
    public movies selectActor(String movie_name);
}
