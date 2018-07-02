/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw03;

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
        String userString;
        int userStart;
        int userEnd;
        int split;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string:");
        userString = kb.nextLine();

        System.out.println("Enter a start index:");
        userStart = kb.nextInt();
        if ((userStart >= 0) && (userStart < userString.length())) {
        System.out.println("Enter an end index:");
        userEnd = kb.nextInt();
        if ((userEnd > userStart) && (userEnd <= userString.length())) {
            System.out.println("The substring between " + userStart + " and " + userEnd + " is " + userString.substring(userStart, userEnd));
        }else {
            System.out.println("End index is invalid for " + userString);}
        
          }else {
            System.out.println("Start index is invalid for " + userString);
        } 
        
        System.out.println("Enter a split index:");
        split = kb.nextInt();
        if ((split > 0) && (split < userString.length())) {
            System.out.println("Split strings: " + userString.substring(0, split) + " - " + userString.substring(split, userString.length()));
        } else {
            System.out.println("Split index is invalid for " + userString);

        }

    }
}
