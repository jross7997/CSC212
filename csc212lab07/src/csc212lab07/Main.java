/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab07;

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
        PlayList p = new PlayList(5);
        Scanner sc = new Scanner(System.in);
        String command;
        String title;
        String artist;
        System.out.println("Enter a to add, r to remove,"
                + " d to display, or q to quit:");
        command = sc.nextLine();
        while (!command.equals("q")) {
            if (command.equals("a")) {
                System.out.println("Title:");
                title = sc.nextLine();
                System.out.println("Artist:");
                artist = sc.nextLine();
                p.add(title, artist);
                System.out.println("Enter a to add, r to remove,"
                        + " d to display, or q to quit:");
                command = sc.nextLine();
            } else if (command.equals("r")) {
                System.out.print("Title: ");
                title = sc.nextLine();
                p.remove(title);
                System.out.println("Enter a to add, r to remove,"
                        + " d to display, or q to quit:");
                command = sc.nextLine();
            } else if (command.equals("d")) {
                p.display();

                System.out.println("Enter a to add, r to remove,"
                        + " d to display, or q to quit:");
                command = sc.nextLine();
            }
        }
        System.out.println("Program Ended");
    }
}
