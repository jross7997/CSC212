/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Justin
 */
public class Passenger {

    private String name;
    private double fare;
    private DecimalFormat df = new DecimalFormat("0.00");

    public Passenger(String n) {
        Random r = new Random();
        name = n;
        fare = r.nextInt(401) + r.nextFloat() + 100;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name:" + name + " fare:" + df.format(fare);
    }

}
