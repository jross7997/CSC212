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
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line;
        int request = 0;
        Scanner kb = new Scanner(System.in);
        Song[] playList = new Song[5];
        String userTitle, userArtist;

        for (int i = 0; i < playList.length; i++) {
            System.out.println("Enter Song " + i + " title");
            userTitle = kb.nextLine();
            System.out.println("Enter Song " + i + " artist");
            userArtist = kb.nextLine();
            Song song1 = new Song(userTitle, userArtist);
            playList[i] = song1;
        }
        System.out.println("Enter a Song number (0-4), or press q to quit");
        line = kb.nextLine();
        while (!line.equals("q")) {
            request = Integer.parseInt(line);
            System.out.println("Song " + request + " : " + playList[request]);
            System.out.println("Enter a Song number (0-4), or press q to quit");
            line = kb.nextLine();
        }
    }

}
