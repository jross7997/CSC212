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
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("candy.txt");
        Scanner sc = new Scanner(f);

        String[] candyNames;
        int numNames = sc.nextInt();
        sc.nextLine();

        candyNames = new String[numNames];

        for (int i = 0; i < numNames; i++) {
            String line = sc.nextLine();
            candyNames[i] = line;
            System.out.println("Adding " + candyNames[i]);
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many shelves are in the vending machine?");
        int shelves = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How many slots on each shelf?");
        int slotsPerShelf = keyboard.nextInt();
        keyboard.nextLine();

        VendingMachine vm = new VendingMachine(shelves, slotsPerShelf);
        vm.load(candyNames);
        vm.display();

        System.out.println("What shelf do you want?");
        int shelfSelection = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("What slot do you want?");
        int slotSelection = keyboard.nextInt();
        keyboard.nextLine();

        vm.purchase(shelfSelection, slotSelection);
        vm.display();
    }
}
