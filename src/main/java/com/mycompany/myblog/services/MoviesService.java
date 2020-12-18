/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Movies;
import com.mycompany.myblog.databases.Database;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Horner
 */
public class MoviesService {
    
    Database d = new Database();
    private List<Movies> movieslist = d.getMoviesDB();
    
    public List<Movies> ViewMovies() {
        return movieslist;
    }
    
    public Movies getSpecificMovie(int id) {
        return movieslist.get(id-1);
    }
}
