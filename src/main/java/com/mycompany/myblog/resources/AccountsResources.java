/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Accounts;
import com.mycompany.myblog.services.AccountsService;
import com.mycompany.myblog.databases.Database;
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
@Path("/accounts")

public class AccountsResources {
    
    Database data = new Database();
    AccountsService accountsService = new AccountsService();
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public List<Accounts> getAllAccounts() 
    { 
       return accountsService.getAllAccounts();    
    }  
   
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Accounts getMessageJSON(@PathParam("id") int id) {
        return accountsService.getAccounts(id);
    }
    
    @POST
    @Path("/{accountName}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void postAccount(@PathParam("accountName") String a) {
	//accountsService.createAccount(a);
        data.toAccounts(a);
        //accountsService.createAccount(a);
    }
}
