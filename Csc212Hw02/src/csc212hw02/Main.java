/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw02;

/**
 *
 * @author Justin
 */
import java.util.Scanner;

public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String date;
        int windSpeed;
        int temperature;
        double windChill;
        Observation observation1;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the observation date:");
        date = kb.nextLine();
        System.out.println("Enter the wind speed in MPH:");
        windSpeed = kb.nextInt();
        System.out.println("Enter the temperature in degrees F:");
        temperature = kb.nextInt();
        observation1 = new Observation(date, windSpeed, temperature);
        System.out.println("Observation date: " + observation1.getDate());
        System.out.println("Wind chill: " + observation1.getWindChill());
    }
}
