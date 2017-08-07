package com.example.alanmclarney.movieranking;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by alanmclarney on 07/08/2017.
 */

public class MovieTest {

    @Test
    public void movieCanAddName() {
        assertEquals("The Hulk", movie.getName())
    }
}
