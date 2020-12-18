/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.myblog.models;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 * @author Jake Horner
 */
public class Customers {
    private int id;
    private String customerName;
    private String address;
    private String email;
    private List<Accounts> accounts = new ArrayList<>();
   
    public Customers(){
    
    }
    
    public Customers(int id, String customerName, String address, String email, List<Accounts> accounts){
        this.id = id;
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customer) {
        this.customerName = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }  
    
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
    
    
/*
    public void setAuthor(String author) {
        this.account = account;
    }*/

    
    
    public List<Accounts> getAccount() {
	return accounts;
    }

    public void setAccount(List<Accounts> accounts) {
	this.accounts = accounts;
    }
    
    public void addAccountsToCustomer(Accounts accounts) {
	(this.accounts).add(accounts);
        System.out.println("add  a new Account to Customer");
    }

    public String printCustomerNames() {
        String str = this.getId()+" "+this.getCustomerName()+" "+this.getAddress()+" "+this.getEmail();
        return str;
    }

    public String printAllAccounts() {
         String allcom = "";
         for ( int i=0; i<accounts.size(); i++)
             allcom=allcom+accounts.get(i).printAccounts()+" ";
	return allcom;
    }
}
