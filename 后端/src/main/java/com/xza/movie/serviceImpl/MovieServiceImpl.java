package com.xza.movie.serviceImpl;

import com.xza.movie.mapper.MovieMapper;
import com.xza.movie.model.movies;
import com.xza.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;
    @Override
    public List<movies> getMoviesList() {
        return movieMapper.selectAllMovies();
    }

    @Override
    public int addMovie(movies movies) {
        movies m1 = movieMapper.selectMovieBymovie_name(movies.getMovie_name());
        int i = -1;
        if (m1 == null){
            i = movieMapper.insertMovie(movies);
        }else {
            i = 2;
        }
        return i;
    }

    @Override
    public movies selectAuthor(movies movies) {
        movies m1 = movieMapper.selectAuthor(movies.getMovie_name());
        return m1;
    }

    @Override
    public movies selectType(movies movies) {
        movies result = movieMapper.selectType(movies.getMovie_type());
        return result;
    }

    @Override
    public movies selectPoster(movies movies) {
        movies result = movieMapper.selectPoster(movies.getMovie_poster());
        return result;
    }

    @Override
    public movies selectTime(movies movies) {
        movies result = movieMapper.selectTime(movies.getMovie_time());
        return result;
    }

    @Override
    public movies selectActor(movies movies) {
        movies result = movieMapper.selectActor(movies.getMovie_actor());
        return result;
    }


}
