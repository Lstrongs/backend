package com.xza.movie.model;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */


public class movies {
    private int id;
    private String movie_name;
    private String movie_author;
    private String movie_type;
    private String movie_poster;
    private String movie_time;
    private String movie_actor;

    public String getMovie_actor() {
        return movie_actor;
    }

    public void setMovie_actor(String movie_actor) {
        this.movie_actor = movie_actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_author() {
        return movie_author;
    }

    public void setMovie_author(String movie_author) {
        this.movie_author = movie_author;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public String getMovie_poster() {
        return movie_poster;
    }

    public void setMovie_poster(String movie_poster) {
        this.movie_poster = movie_poster;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    @Override
    public String toString() {
        return "movies{" +
                "id=" + id +
                ", movie_name='" + movie_name + '\'' +
                ", movie_author='" + movie_author + '\'' +
                ", movie_type='" + movie_type + '\'' +
                ", movie_poster='" + movie_poster + '\'' +
                ", movie_time='" + movie_time + '\'' +
                ", movie_actor='" + movie_actor + '\'' +
                '}';
    }
}
