/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab04;

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

        String testSchool = "Oswego State";
        String testMovie = "Best in Show";
        int testYear = 2019;
        int matchCount = 0;
        String userMovie, userSchool, line;
        int userYear;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your school:");
        userSchool = kb.nextLine();
        if (testSchool.equals(userSchool)) {
            System.out.println("Me too!");
            matchCount = matchCount + 1;
        } else {
            System.out.println("I hear " + userSchool + " is nice.");
        }
        System.out.println("Enter your grad year:");
        line = kb.nextLine();
        userYear = Integer.parseInt(line);
        if (testYear == userYear) {
            System.out.println("Me too!");
            matchCount = matchCount + 1;
        } else {
            System.out.println("I graduate in " + testYear);
        }
        System.out.println("Enter your favorite movie:");
        userMovie = kb.nextLine();
        if (testMovie.equals(userMovie)) {
            System.out.println("Me too!");
            matchCount = matchCount + 1;
        } else {
            System.out.println("My favorite movie is " + testMovie);
        }
        System.out.println("Our match count is " + matchCount);
        if (matchCount == 3) {
            System.out.println("OMG! We're soulmates!");
        }
        if (matchCount == 2) {
            System.out.println("We have a lot in common");
        }
        if (matchCount <= 1) {
            System.out.println("We should get to know each other better");
        }

    }
}
