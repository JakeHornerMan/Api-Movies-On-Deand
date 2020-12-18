/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Customers;
import com.mycompany.myblog.services.CustomersService;
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
 * @author Jake Horner
 */

@Path("/customers")

public class CustomersResource {
    
    CustomersService customersService = new CustomersService();
 
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
    public List<Customers> getFilteredMessages(@QueryParam("customerName") String customerName, @QueryParam("address") String address) 
    { 
      if ((customerName != null) || (address != null)) 
         {        
             return customersService.getSearchCustomers(customerName, address); 
         } 
       return customersService.getAllCustomers();    
    }  
   
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customers getMessageJSON(@PathParam("id") int id) {
        return customersService.getCustomers(id);
    }
    
}
