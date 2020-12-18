/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Customers;
import com.mycompany.myblog.models.Accounts;
import com.mycompany.myblog.models.Recommends;
import com.mycompany.myblog.databases.Database;
import java.util.ArrayList;
import java.util.List;

public class AccountsService {
    
    Database a = new Database();
    private List<Accounts> accountslist = a.getAccountsDB();
    private List<Customers> cuslist = new Database().getCustomersDB();
    
   
    
    /*Database r = new Database();
    private List<Recommends> reccomendslist = r.getRecommendsDB1();*/
    
    public List<Accounts> getAllAccounts() {
        return accountslist;
    }
    
     public Accounts getAccounts(int id) {
        return accountslist.get(id-1);
    }
    
    public void createAccount(String accName){
        
        a.toAccounts(accName);
        /*
        Customers cus = cuslist.get(customer_id-1);
        ArrayList<Recommends> recList = new ArrayList<Recommends>();
        Accounts a = new Accounts(cus.getAccount().size() + 1,accName,recList); 
        accountslist.add(a);
        
        
                accName.setaccID(cus.getAccount().size() + 1);
	cus.addAccountsToCustomer(acc);
        toAccounts(customer_id,accName);
        
	System.out.println("201 - resource created with path: /messages/" + String.valueOf(cus.getId())+"/comments/"+String.valueOf(acc.getaccID()));
        System.out.println("Updated Message:"+acc.printAccounts());
	return acc;*/
        //return a;
    }
}
