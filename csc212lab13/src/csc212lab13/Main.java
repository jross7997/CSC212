/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab13;

/**
 *
 * @author Justin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        try {
            System.out.println("Enter a integer, a Boolean, and a String:");
            System.out.println("Integer: " + kb.nextInt());
            System.out.println("Boolean: " + kb.nextBoolean());
            System.out.println("String : " + kb.nextLine());
           
            
        } catch (InputMismatchException e) {
            System.out.println("Line Exception: " + e.toString());
        } 

        try {
            Scanner kb2 = new Scanner(System.in);
            System.out.println("Enter a file name:");
            String filename = kb2.nextLine();
            File f = new File(filename);
            Scanner fs = new Scanner(f);
            System.out.println("Scanner created");
            System.out.println("Here are the contents");
            while (fs.hasNextLine()) {
            System.out.println(fs.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Exception: " + e.toString());
        }
    }

}
