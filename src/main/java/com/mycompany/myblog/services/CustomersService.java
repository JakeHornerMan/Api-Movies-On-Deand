/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Customers;
import com.mycompany.myblog.models.Accounts;
import com.mycompany.myblog.databases.Database;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jake Horner
 */
public class CustomersService {
    
    Database c = new Database();
    private List<Customers> customerslist = c.getCustomersDB();
    
    /*Database a = new Database();
    private List<Accounts> accountslist = a.getAccountsDB();*/
        
    public List<Customers> getAllCustomers() {
        return customerslist;
    }
    
     public Customers getCustomers(int id) {
        return customerslist.get(id-1);
    }  
     
    public List<Customers> getSearchCustomers(String customerName, String address) {
        List<Customers> matcheslist = new ArrayList<>();

        for (Customers q: getAllCustomers()) {
            if ((customerName == null || q.getCustomerName().equals(address)) 
                   && (customerName == null || q.getAddress().equals(address))) {
               matcheslist.add(q);
            }
        }
        return matcheslist;
    }
    
}
