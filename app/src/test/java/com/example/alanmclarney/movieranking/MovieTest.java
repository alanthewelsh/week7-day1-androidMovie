package com.example.alanmclarney.movieranking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by alanmclarney on 07/08/2017.
 */

public class MovieTest {


    Movie movie;

    @Before
    public void before() {
        movie = new Movie("The Hulk", "SuperHero", 1);
    }

    @Test
    public void movieHasName(){
        assertEquals("The Hulk", movie.getTitle());
    }

    @Test
    public void movieHasGenre(){
        assertEquals("SuperHero", movie.getGenre());
    }

    @Test
    public void movieHasRanking(){
        assertEquals(1, movie.getRanking());
    }
}
