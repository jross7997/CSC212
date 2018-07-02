/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab03;

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
        String userString, line;
        int start, end;
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a character string");
        userString = kb.nextLine();
        System.out.println("You typed" + " " + userString);
        System.out.println("String Lengeth: " + userString.length());
        System.out.println("Lower Case: " + userString.toLowerCase());
        System.out.println("Upper Case: " + userString.toUpperCase());
        System.out.println("Enter a start position");
        line = kb.nextLine();
        start = Integer.parseInt(line);

        System.out.println("Enter an end position");
        line = kb.nextLine();
        end = Integer.parseInt(line);
        System.out.println("The character at the start position " + start + " is " + userString.charAt(start));
        System.out.println("The substring between positions " + start + " and " + end + " is " + userString.substring(start, end));
    }
}
