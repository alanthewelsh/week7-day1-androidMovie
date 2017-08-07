package com.example.alanmclarney.movieranking;

import java.util.ArrayList;

/**
 * Created by alanmclarney on 07/08/2017.
 */

public class Ranking {

    private ArrayList<String> movies ;
    //
    public Ranking(){
        movies = new ArrayList<String>();
    }

    public Ranking(ArrayList<String> newMovies){
        movies = newMovies;
    }

    public int getLength() {
        return movies.size();
    }


    public void add(String newMovie) {
        movies.add(newMovie);
    }


    public String getTitleAtIndex(int index) {
        return movies.get(index);
    }
}

