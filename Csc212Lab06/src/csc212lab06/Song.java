/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab06;

/**
 *
 * @author Justin
 */
public class Song {

    String title;
    String artist;

    Song(String t, String a) {
        title = t;
        artist = a;
    }

    @Override
    public String toString() {
        return title + " " + artist;
    }
}
