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
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner kb = new Scanner(System.in);
        String fileName = "songs.csv";
        File file = new File(fileName);
        Scanner sc;
        sc = new Scanner(file);
        Song[] db = new Song[4456];

        for (int i = 0; i < db.length; i++) {

            String line = sc.nextLine();
            String tokens[] = line.split(",");
            Song song1 = new Song(tokens[1], tokens[0], tokens[2]);
            db[i] = song1;
            //System.out.println(db[i]);
        }
        System.out.println("Welcome to the Music Database");
        System.out.println("Enter a search command (title, artist) or quit:");
        String command = kb.nextLine();

        while (!command.equals("quit")) {
            if (command.equals("title")) {
                System.out.println("Enter a word or phrase in the title:");
                String tit1 = kb.nextLine();
                for (int i = 0; i < db.length; i++) {

                    String k = db[i].getTitle();

                    if (k.contains(tit1)) {

                        System.out.println(db[i]);
                    }
                }
                //System.out.println("Enter a search command (title, artist) or quit:");
               // command = kb.nextLine();

            } else if (command.equals("artist")) {
                System.out.println("Enter part or all of the artist name:");
                String art1 = kb.nextLine();
                for (int i = 0; i < db.length; i++) {

                    String l = db[i].getArtist();

                    if (l.contains(art1)) {

                        System.out.println(db[i]);

                    }
                }
               // System.out.println("Enter a search command (title, artist) or quit:");
              //  command = kb.nextLine();

            } else if (!command.equals("title") && (!command.equals("artist"))) {
                System.out.println("Unknown command");

            }
            System.out.println("Enter a search command (title, artist) or quit:");
            command = kb.nextLine();

        }
        System.out.println("Closing the Music Database");
    }
}
