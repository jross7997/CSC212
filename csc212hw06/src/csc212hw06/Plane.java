/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

import java.util.Random;

/**
 *
 * @author Justin
 */
public class Plane {

    private Passenger[][] pass;

    public Plane(String flightNumber, int numberOfRows, int seatsPerRow) {
        pass = new Passenger[numberOfRows][seatsPerRow];
    }

    public void addPassenger(String name, int row, int seat) {

        if (row >= 0 && row < pass.length  && seat >= 0 && seat < pass[0].length && pass[row][seat] == null) {
            Passenger pass1 = new Passenger(name);
            pass[row][seat] = pass1;
            System.out.println("Passenger " + name + " was added.");   
        }else{
            System.out.println("Invalid seat -- please try again.");  
        }
    }

    public void removePassenger(int row, int seat) {
        if (0 <= row && row < pass.length && 0 <= seat && seat < pass[0].length && pass[row][seat] != null) {
            pass[row][seat] = null;
            System.out.println("Passenger was removed.");
        } else {
            System.out.println("Invalid seat -- please try again.");
        }
    }

    public void showSeats() {
        System.out.printf("%2s" , "");
        for (int j = 0; j < pass[0].length; j++) {
            System.out.printf("|%10d|", j);
        }
        System.out.println();
        for (int i = 0; i < pass.length; i++) {
            System.out.printf("%2d", i);
            for (int j = 0; j < pass[i].length; j++) {
                if (pass[i][j] == null) {
                    System.out.printf("|%10s|", "");
                } else {
                    System.out.printf("|%10s|", pass[i][j].getName());
                }
            }
            System.out.println();
        }
    }

    public void passengerList() {
        for (int i = 0; i < pass.length; i++) {
            for (int j = 0; j < pass[i].length; j++) {
                if (pass[i][j] != null) {
                    System.out.println(pass[i][j].toString());
                }
            }
        }
    }
}
