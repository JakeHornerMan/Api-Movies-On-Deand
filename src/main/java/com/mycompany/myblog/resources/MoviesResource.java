/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Movies;
import com.mycompany.myblog.services.MoviesService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

@Path("/movies")
public class MoviesResource {
    
    MoviesService moviesService = new MoviesService();
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movies> getAllMovies() 
    { 
       return moviesService.ViewMovies();    
    }  
    /*
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Customers getMessageXML(@PathParam("id") int id) {
        return customersService.getCustomers(id);
    }*/
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movies getMovieByID(@PathParam("id") int id) {
        return moviesService.getSpecificMovie(id);
    }
}
