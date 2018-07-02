/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab09;

/**
 *
 * @author Justin
 */
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class VendingMachine {

    private int shelves;
    private int slotsPerShelf;
    private Candy[][] slots;
    public VendingMachine(int sh, int sl){
       
        shelves = sh;
        slotsPerShelf = sl;
        slots = new Candy[shelves][slotsPerShelf];
    }

    public void load(String[] names) {
        Random r = new Random();

        for (int i = 0; i < shelves; i++) {
            for (int j = 0; j < slotsPerShelf; j++) {
                slots[i][j] = new Candy(names[r.nextInt(names.length)],r.nextFloat(),r.nextInt(4)+1);
            }
        }
    }

    public void display() {
        System.out.println(" ");
        for (int j = 0; j < slots[0].length; j++) {
            System.out.printf("|%25d|", j);
        }
        System.out.println();

        for (int i = 0; i < slots.length; i++) {
            System.out.printf("%2d", i);
            for (int j = 0; j < slots[i].length; j++) {
                if (slots[i][j] == null) {
                    System.out.printf("|%25s|", "");
                } else {
                    System.out.printf("|%25s|", slots[i][j].getName());
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void purchase(int r, int s){
        if(slots[r][s] != null){
            System.out.println("You purchased:" + slots[r][s]);
            slots[r][s] = null;
        }else{
            System.out.println("Invalid Selection");
        }
    }
    
}
