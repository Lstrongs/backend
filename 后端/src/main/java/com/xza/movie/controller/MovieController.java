package com.xza.movie.controller;

import com.xza.movie.model.movies;
import com.xza.movie.service.MovieService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;
    @RequestMapping("/getList")
    public List<movies> getList(){
        return movieService.getMoviesList();
    }

    @RequestMapping("/addMovie")
    public JSONObject addMovie(@RequestBody movies movies){
        JSONObject result = new JSONObject();
        int i = movieService.addMovie(movies);
        result.put("state",1);
        return result;
    }

    @RequestMapping("/selectAuthor")
    public JSONObject selectAuthor(movies movies){
        JSONObject result = new JSONObject();
        movies i = movieService.selectAuthor(movies);
        result.put("state",1);
        return result;
    }

    @RequestMapping("/selectType")
    public JSONObject selectType(movies movies){
        JSONObject result = new JSONObject();
        movies i = movieService.selectType(movies);
        result.put("state",1);
        return result;
    }

    @RequestMapping("/selectPoster")
    public JSONObject selectPoster(movies movies){
        JSONObject result = new JSONObject();
        movies i = movieService.selectTime(movies);
        result.put("state",1);
        return result;
    }

    @RequestMapping("/selectTime")
    public JSONObject selectTime(movies movies){
        JSONObject result = new JSONObject();
        movies i = movieService.selectTime(movies);
        result.put("state",1);
        return result;
    }

    @RequestMapping("/selectActor")
    public JSONObject selectActor(movies movies){
        JSONObject result = new JSONObject();
        movies i = movieService.selectTime(movies);
        result.put("state",1);
        return result;
    }
}
