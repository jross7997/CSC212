/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab08;

/**
 *
 * @author Justin
 */
import java.text.DecimalFormat;
public class Candy {
    private String name;
    private float price;
    private int ounces;
    
    private DecimalFormat df = new DecimalFormat("0.00");
    
    public Candy(String n, float p, int o){
        name = n;
        price = p;
        ounces = o;
    }
    public String toString(){
    return "Name: " + name + "\nPrice: " + df.format(price) +"\nOunces: " + ounces;
}
    
}
