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
public class Car {
    public String model, make;
    public double mpg;
    int weight, year;
   
    Car(String mod, String mak, double mp, int w, int y){
        mod = model;
        mak = make;
        mp = mpg;
        w = weight;
        y = year;
    }
    @Override
    public String toString(){
    return "Model: " + model + " Make: " + make + " mpg: " + mpg + " weight: " + weight + " year: " + year;
}
}
