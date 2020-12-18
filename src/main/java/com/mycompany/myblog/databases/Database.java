/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.databases;

import com.mycompany.myblog.models.Customers;
import com.mycompany.myblog.models.Accounts;
import com.mycompany.myblog.models.Movies;
import com.mycompany.myblog.models.Recommends;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cmuntean
 */
public class Database {
    public static List<Customers> customersDB = new ArrayList<>();

    public static List<Accounts> accountsDB = new ArrayList<>();
    
    public static List<Movies> moviesDB = new ArrayList<>();
    
    public static List<Recommends> recExample1 = new ArrayList<>();
    public static List<Recommends> recExample2 = new ArrayList<>();
   
    public static boolean init = true;
     
    // Create a constructor for the class
    public Database () {
        if (init) {
            
            Recommends re1 = new  Recommends(6);
            Recommends re2 = new  Recommends(4);
            Recommends re3 = new  Recommends(9);
            Recommends re4 = new  Recommends(10);
            Recommends re5 = new  Recommends(11);
            Recommends re6 = new  Recommends(1);
            recExample1.add(re1);
            recExample1.add(re2);
            recExample1.add(re3);
            recExample2.add(re4);
            recExample2.add(re5);
            recExample2.add(re6);
            
            


            // Adding those Profiles to each of the Accounts. 
            //Jakes Account adding associated profiles (TEST THIS ACCOUNT!)
            Accounts a1 = new Accounts(1, "Jake",recExample1);
            Accounts a2 = new Accounts(2, "Conor",recExample2);
            
            accountsDB.add(a1);
            accountsDB.add(a2);
            
            // Create some Accounts (WE DONT NEED TO BE ABLE TO MAKE MORE OF THESE!!!)
            Customers c1 = new Customers (1, "Customer1","9 Sutton Grove, Dublin Ireland","jake@nci.com",accountsDB);
            Customers c2 = new Customers (1, "Customer2","17 Bayside Grove, Dublin, Ireland", "keith@nci.com",accountsDB); 
            customersDB.add(c1);
            customersDB.add(c2);
            
            Movies m1 = new Movies(1,"Superman", "Man that is SUPER");
            Movies m2 = new Movies (2,"Harry Potter", "The Boy who lived");
            Movies m3 = new Movies (3,"Mean Girls", "Girls that are not nice");
            Movies m4 = new Movies (4,"Peter Rabbit", "Talking Rabit during easter");
            Movies m5 = new Movies (5,"Black Hawkdown", "War is bad in the Vietnam");
            Movies m6 = new Movies (6,"Spiderman", "Half Man, Half Spider");
            Movies m7 = new Movies (7,"The Help", "Somehing about Helping");
            Movies m8 = new Movies (8,"The Wind that shakes the Barly", "Yup the Ra, United Ireland");
            Movies m9 = new Movies (9,"The Boy in the Stripy pajamas", "Ramifications of World War 2 on teh Jewish People");
            Movies m10 = new Movies (10,"Contagion", "Warnings about a Pandemic");
            Movies m11 = new Movies (11,"Toy Story", "Toys are Alive");
            
            moviesDB.add(m1);
            moviesDB.add(m2);
            moviesDB.add(m3);
            moviesDB.add(m4);
            moviesDB.add(m5);
            moviesDB.add(m6);
            moviesDB.add(m7);
            moviesDB.add(m8);
            moviesDB.add(m9);
            moviesDB.add(m10);
            moviesDB.add(m11);
                        
            init = false;
        }
    }

    public static List<Movies> getMoviesDB() {
        return moviesDB;
    }

    public static List<Customers> getCustomersDB() {
        return customersDB;
    }
    
    public static List<Accounts> getAccountsDB() {
        return accountsDB;
    }
    
    public static List<Recommends> getRecommendsDB1() {
        //ccountsDB.indexOf(rowId);
        /*for(int i=0;i<=accountsDB.size();i++){
            if(accountsDB.contains(id)){
                recommendsDB = accountsDB.get(i);
            }
        }*/
        return recExample1;
    }
    public static List<Recommends> getRecommendsDB2() {
        return recExample2;
    }
    
    public void toAccounts(String a){
        ArrayList<Recommends> recList = new ArrayList<Recommends>();
        Accounts adda = new Accounts(accountsDB.size()+1,a,recList);
        accountsDB.add(adda);

    }
}