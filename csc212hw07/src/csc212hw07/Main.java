/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("players.txt");
        File f0 = new File("awards.txt");
        Scanner sc = new Scanner(f);
        Scanner ska = new Scanner(f0);
        Scanner kb = new Scanner(System.in);
        
        String command;
        Players p = new Players();
        p.load("players.txt");
        Awards a = new Awards();
        a.load("awards.txt");
         System.out.println("Welcome to the Baseball Database");
        do{
      
       System.out.println("Enter id, name, awards, or quit:");
       command = kb.nextLine();
       
       if (command.equals("id")) {
                System.out.println("Enter the id:");
                String id = kb.nextLine();
                String playerName = p.getPlayerById(id);
                if (playerName != null) {
                    System.out.println("Player: " + playerName);
                } else {
                    System.out.println("Player ID not found");
                }
            } else if (command.equals("name")) {
                System.out.println("Enter player's last name:");
                String lastName = kb.nextLine();
                p.printIdsByName(lastName);
            } else if (command.equals("awards")){
                System.out.println("Enter the id:");
                String id = kb.nextLine();
                a.printAwards(id);
            }
                    else if (command.equals("quit")) {
                System.out.println("Closing Baseball Database");
            } else {
                System.out.println("I don't understand your command.");
            }
       
        }while(!command.equals("quit"));
        
    }
    }
    

