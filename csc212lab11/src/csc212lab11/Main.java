/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

/**
 *
 * @author Justin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("players.txt");
        Scanner sc = new Scanner(f);
        Scanner kb = new Scanner(System.in);
        String command;
        Players p = new Players();
        p.load("players.txt");

        do {
            System.out.println("Enter id, name, or quit");
            command = kb.nextLine();
            if (command.equals("id")) {
                System.out.println("Enter the ID:");
                String id = kb.nextLine();
                String playerName = p.getPlayerById(id);
                if (playerName != null) {
                    System.out.println("Player: " + playerName);
                } else {
                    System.out.println("Player ID not found");
                }
            } else if (command.equals("name")) {
                System.out.println("Enter the players last name");
                String lastName = kb.nextLine();
                p.printIdsByName(lastName);
                
                }

             else if (command.equals("quit")) {
                System.out.println("Program Ending");
            } else {
                System.out.println("I don't understand your command");
            }
        } while (!command.equals("quit"));

        // while(sc.hasNextLine()){
        // System.out.println(sc.nextLine());
        //}
    }

}
