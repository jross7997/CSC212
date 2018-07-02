/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw04;

/**
 *
 * @author Justin
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to the Car Database");
        System.out.println("Enter the size of the array:");
        String taco = kb.nextLine();
        int usersize = Integer.parseInt(taco);

        CarDatabase d = new CarDatabase(usersize);

        System.out.println("Enter the name of the input file:");
       String userfile = kb.nextLine();
        d.readFile(userfile);

        System.out.println("Enter make, mpg, weight, all, or quit:");
        String command = kb.nextLine();
        while ((!command.equals("quit"))) {

            if (command.equals("make")) {
                System.out.println("Enter the make:");
                String userMake = kb.nextLine();
                d.displayMake(userMake);
            } else {
                if (command.equals("mpg")) {
                    System.out.println("Enter the mpg range:");
                    double usermpg1 = kb.nextDouble();
                    double usermpg2 = kb.nextDouble();
                    d.mpgRange(usermpg1, usermpg2);
                } else {
                    if (command.equals("weight")) {
                        System.out.println("Enter the weight range:");
                        int userw1 = kb.nextInt();
                        int userw2 = kb.nextInt();
                        d.weightRange(userw1, userw2);
                    } else {
                        if (command.equals("all")) {
                            d.displayAll();
                        } else {
                            if (!command.equals("quit") && (!command.equals("make")) && (!command.equals("mpg"))
                                    && (!command.equals("weight")) && (!command.equals("all"))) {
                                System.out.println("Unknown command -- please try again.");
                            }
                        }
                    }
                }
            }
            System.out.println("Enter make, mpg, weight, all, or quit:");
            command = kb.nextLine();

        }
        System.out.println("Closing Car Database");
    }
}
