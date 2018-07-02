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
public class Observation {

    private String date;
    private double windChill;

    public Observation(String date1, int windSpeed, int temperature){ 
        date = date1; 
        windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
    public double getWindChill() {
        return windChill;
    }
    public String getDate(){
        return date;
    }
}

