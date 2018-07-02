/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw08;

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
     Scanner kb = new Scanner(System.in);
    String command;
    
    CDDB db = new CDDB();
    db.load("cds.txt");
    System.out.println("Welcome to the CD Database");
    do{
        System.out.println("Enter search, add, name, list, or quit:");
        command = kb.nextLine();
        
        if(command.equals("search")){
            System.out.println("Enter the UPC:");
            String upc = kb.nextLine();
            String cdInfo = db.getCD(upc);
            if(cdInfo != null){
                System.out.println(cdInfo);
            }else{
                System.out.println("CD not found");
            }
        }else if(command.equals("add")){
            System.out.println("Enter the UPC:");
            String upc = kb.nextLine();
            System.out.println("Enter the price:");
            double price = kb.nextDouble();
            kb.nextLine();
            System.out.println("Enter the Artist:");
            String artist = kb.nextLine();
            System.out.println("Enter the Title:");
            String title = kb.nextLine();
            db.addCD(upc,price,artist,title);
        }else if(command.equals("name")){
            System.out.println("Enter the full or partial name:");
            String name = kb.nextLine();
            db.printByName(name);            
        }else if(command.equals("list")){
            db.printAll();
        }
        else if(command.equals("quit")){
            System.out.println("Program ending.");
        }else{
            System.out.println("I don't understand your command. Please try again.");
        }  
    }while(!command.equals("quit"));      
    }
    }
    
    

