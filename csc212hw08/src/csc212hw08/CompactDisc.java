/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw08;

/**
 *
 * @author Justin
 */
public class CompactDisc {
    private String upc;
    private double price;
    private String artist;
    private String title;
    
    public CompactDisc(String u, double p, String a, String t){
        upc = u;
        price = p;
        artist = a;
        title = t;
    }
    public String getUPC(){
        return upc;
    }
    public String getArtist(){
        return artist;
    }
    public String toString(){
        return "Artist:" + artist + " Title:" + title +" price:" + price;
    }
}
