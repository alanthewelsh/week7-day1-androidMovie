package com.example.alanmclarney.movieranking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alanmclarney on 07/08/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;
    private ArrayList<String> movies;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void getMovieDetails(){
        return "Title: " + this.title + "Genre:" + this.genre + "Ranking: " + this.ranking;
    }

    public String getAnswerAtIndex(int index) {
        return movies.get(index);
    }
}

