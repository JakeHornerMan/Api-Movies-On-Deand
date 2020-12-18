/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.myblog.models;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jake Horner
 */
@XmlRootElement
public class Accounts {
    
    public int accID;
    public String name; 
    private List<Recommends> recommends = new ArrayList<>();

    public Accounts(){
    }
   
    public Accounts(int accID, String name ,List<Recommends> recommends) {
        this.accID = accID;
        this.name = name;
        this.recommends = recommends;
    }

    public int getaccID(){
        return accID;
    }
    
    public void setaccID(int accID){
        this.accID=accID;
    }
            
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public List<Recommends> getRecommends() {
	return recommends;
    }
    
    public void setRecommends(List<Recommends> recommends) {
	this.recommends = recommends;
    }
    
    public String printAccounts() {
        String str = this.getaccID()+" "+this.getName();//+" "+this.getMovies();
        return str;
    }    
}
