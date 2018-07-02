/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

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

    Scanner kb = new Scanner(System.in);
    String command;
    
    CDDB db = new CDDB();
    db.load("cds.txt");
    
    do{
        System.out.println("Enter search, or quit:");
        command = kb.nextLine();
        
        if(command.equals("search")){
            System.out.println("Enter the UPC: ");
            String upc = kb.nextLine();
            String cdInfo = db.getCD(upc);
            if(cdInfo != null){
                System.out.println(cdInfo);
            }else{
                System.out.println("CD not found");
            }
        }else if(command.equals("quit")){
            System.out.println("Program Ending");
        }else{
            System.out.println("I don't understand your command");
        }  
    }while(!command.equals("quit"));      
    }
    }
    

