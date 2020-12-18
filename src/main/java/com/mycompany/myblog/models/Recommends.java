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
 * @author Horner
 */
public class Recommends {
    
    public int recID;
    
    public Recommends(){
    }
    
    public Recommends(int recID) {
        this.recID = recID;
    }
    
    public int getrecID(){
        return recID;
    }
    
    public void setrecID(int recID){
        this.recID=recID;
    }
    
    public int printRecommends() {
        int id = this.getrecID();
        return id;
    }
}
