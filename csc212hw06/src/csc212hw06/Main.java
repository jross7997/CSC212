/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

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
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Oswego Airlines");
        System.out.println("Enter a flight number:");
        String flight = kb.nextLine();
        System.out.println("Enter the number of rows:");
        int rows = kb.nextInt();
        kb.nextLine();
        System.out.println("Enter the number of seats per row:");
        int seatsPerRow = kb.nextInt();
        kb.nextLine();

        Plane plane = new Plane(flight, rows, seatsPerRow);

        System.out.println("Enter add, remove, seats, list, or quit:");
        String command = kb.nextLine();
        while (!command.equals("quit")) {
            if (command.equals("seats")) {
                plane.showSeats();
            } else if (command.equals("add")) {
                System.out.println("Enter passenger name, row, and seat:");
                String line = kb.next();
                int row = kb.nextInt();
                int seat = kb.nextInt();
                kb.nextLine();
                plane.addPassenger(line, row, seat);
            } else if (command.equals("remove")) {
                System.out.println("Enter row and seat:");
                int row = kb.nextInt();
                int seat = kb.nextInt();
                kb.nextLine();
                plane.removePassenger(row, seat);
            } else if (command.equals("list")) {
                plane.passengerList();
            } else {
                System.out.println("Unknown command -- please try again.");
            }
            System.out.println("Enter add, remove, seats, list, or quit:");
            command = kb.nextLine();
        }
        System.out.println("Closing Oswego Airlines");
    }

}
