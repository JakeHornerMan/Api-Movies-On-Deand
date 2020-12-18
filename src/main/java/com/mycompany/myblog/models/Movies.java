/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.myblog.models;

import java.util.List;

/**
 *
 * @author Jake Horner
 */
public class Movies {
    private int movieID;    
    private String Name;
    private String Summary;

    public Movies(){
    }

    public Movies(int movieID, String Name, String Summary) {
        this.movieID = movieID;
        this.Name = Name;
        this.Summary = Summary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        this.Summary = summary;
    }

    public int getMovieID(){
        return movieID;
    }

    public void setMovieID(int movieID){
        this.movieID = movieID;
    }
}
