/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

/**
 *
 * @author Justin
 */
public class Award {
    private String title, league, iD;
    private int year;
  
    public Award(String t,int y,String l, String i){
        title = t;
        year = y;
        league = l;
        iD = i;
    }
    public String getId(){
        return iD;
    }
    public String toString(){
    return year + " " + league + " " + title;
}
}
