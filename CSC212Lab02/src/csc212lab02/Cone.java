/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab02;

/**
 *
 * @author Justin
 */
public class Cone {
    //Declare Variables
   int radius; // Radius of the base    
   int height; // Height of the cone
   public double volume;
   
   public Cone(int r, int h) {
       //Contructor -- accepts two integer paremeters
    radius = r;
    height = h;
    volume = Math.PI * r * r * h / 3;
   }
   public double getVolume () {
       //return the current volume -- takes no parameters
   return volume;
   }
       
      
   } 
    
 