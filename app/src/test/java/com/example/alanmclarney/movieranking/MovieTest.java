package com.example.alanmclarney.movieranking;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by alanmclarney on 07/08/2017.
 */

public class MovieTest {


    Movie movie;


    @Before
    public void before() {

        movie = new Movie("The Hulk", "SuperHero", 1);
        movie = new Movie("The Man with the Golden Gun", "Spy Drama", 2);
        movie = new Movie("In Bruge", "Alternative", 3);
        movie = new Movie("Mr Nice", "Alternative", 4);
        movie = new Movie("Skyfall", "Spy Drama", 5);
        movie = new Movie("Gladiator", "Historical Epic", 6);
        movie = new Movie("Austin Powers - The Spy who Shagged Me", "Comedy", 7);
        movie = new Movie("Mission Impossible", "Action", 8);
        movie = new Movie("District 9", "Sci-Fi", 9);
        movie = new Movie("10th Movie", "Action", 10);
    }

    @Test
    public void movieHasName(){
        assertEquals("10th Movie", movie.getTitle());
    }

    @Test
    public void movieHasGenre(){
        assertEquals("Action", movie.getGenre());
    }

    @Test
    public void movieHasRanking(){
        assertEquals(10, movie.getRanking());
    }

    @Test
    public void canGetMovieInfo(){
        assertEquals("a", movie.getMovieDetails());
    }

    @Test
    public void testGetMovieAtIndex(){
        Movie movie = null;
        movie = new Movie(movie);
        String result = movie.getAnswerAtIndex(1);
        assertEquals(("Mr Nice", "Alternative", 4), result);
    }



}
