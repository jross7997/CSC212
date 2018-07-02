/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

/**
 *
 * @author Justin
 */
public class Song {

    private String title;
    private String artist;
    private String year;

    Song(String t, String a, String y) {
        title = t;
        artist = a;
        year = y;
    }
    public String getTitle(){
        return title;
    }
    
    public String getArtist() {
    return artist;
}

    @Override
    public String toString() {
        return artist + ":" + title + ":" + year;
    }
}
