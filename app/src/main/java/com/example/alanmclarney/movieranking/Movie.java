package com.example.alanmclarney.movieranking;

import java.util.ArrayList;

/**
 * Created by alanmclarney on 07/08/2017.
 */

public class Movie {

        private String title;
        private String genre;
        private int ranking;

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

//    public ArrayList<String> titles;
//
//    public Movie(){
//        titles = new ArrayList<String>();
//        setUpTitles();
//    }
//
//    public int getLength(){
//        return titles.size();
//    }
//
//    private void setUpTitles(){
//        String[] titleToAdd = {
//                "The Hulk - Superhero",
//                "The Godfather - Crime",
//                "The Departed - Crime",
//                "Dr StrangeLove - Alternative",
//                "The Gladiator - Historical Epic",
//                "Mr Nice - Welsh Stuff",
//                "In Bruge - Alternative"};
//        for (String title: titleToAdd){
//            titles.add(title);
//        }
//    }
//
//    public String getTitleAtIndex (int index){
//        return titles.get(index);
//    }
//
//    public String getTitle(){
//        return
//    }

}
