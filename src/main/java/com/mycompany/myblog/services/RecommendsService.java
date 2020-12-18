/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Movies;
import com.mycompany.myblog.models.Recommends;
import com.mycompany.myblog.databases.Database;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Horner
 */
public class RecommendsService {
    
    Database a = new Database();
    private List<Recommends> reclist1 = a.getRecommendsDB1();
    private List<Recommends> reclist2 = a.getRecommendsDB2();
    private List<Movies> mlist = new Database().getMoviesDB();
    
    public List<Recommends> getSpecificAccountRecJSON() {
        return reclist1; //+ reclist2;
    }
    
    public List<Recommends> getRecommends(int id) {
        List<Recommends> x = new ArrayList<Recommends>();
        if(id ==1){
            x = reclist1;
        }
        else if (id==2){
            x = reclist2;
        }
        return x;
    }
    
    public List<String> ViewRecMovies(){
        List<String> recMlist = new ArrayList<String>();
        for(int i=0;i<=reclist1.size();i++){
            int x;
            x =reclist1.get(i).getrecID();
            for(int j =0;i<=mlist.size();j++){
                if(mlist.get(j).getMovieID()==x){
                    String m = mlist.get(j).getName();
                    recMlist.add(m);
                }
            }
        }   
        return recMlist;
    }
}
