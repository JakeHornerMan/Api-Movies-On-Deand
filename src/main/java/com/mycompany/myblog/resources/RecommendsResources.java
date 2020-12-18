/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Recommends;
import com.mycompany.myblog.models.Movies;
import com.mycompany.myblog.services.RecommendsService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
/**
 *
 * @author Horner
 */
@Path("/recommends")
public class RecommendsResources {
    RecommendsService recommendsService = new RecommendsService();
    
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public List<Recommends> getAllRecommends() 
    { 
       return recommendsService.getSpecificAccountRecJSON();    
    }  
   
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Recommends> getSpecificAccountRecJSON(@PathParam("id") int id) {
        return recommendsService.getRecommends(id);
    }
    
    @GET
    @Path("/movies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getRecMovies() 
    { 
       return recommendsService.ViewRecMovies();    
    }
}
