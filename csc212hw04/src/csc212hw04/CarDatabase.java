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
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CarDatabase {

    private Car[] cars;
    int size;
    int filled = 0;

    CarDatabase(int s) {
        s = size;
        cars = new Car[s];

    }

    public boolean isFull() {
        return (filled >= cars.length);
    }

    public void readFile(String f) throws FileNotFoundException {

        String line;

        File input = new File(f);
        Scanner sc = new Scanner(input);

        for (int i = 0; i < cars.length; i++) {

            line = sc.nextLine();
            String tokens[] = line.split(",");

            Car car1 = new Car(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
            filled++;
            cars[i] = car1;

        }
    }

    public void displayMake(String mak) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].make.equals(mak)) {
                System.out.println(cars[i].toString());
            }

        }
    }

    public void mpgRange(double mp1, double mp2) {
        for (int i = 0; i < cars.length; i++) {

            if ((cars[i].mpg > mp1) && (cars[i].mpg >= mp2)) {
                System.out.println(cars[i].toString());
            }

        }
    }

    public void weightRange(int w1, int w2) {
        for (int i = 0; i < cars.length; i++) {

            if ((cars[i].weight > w1) && (cars[i].weight >= w2)) {
                System.out.println(cars[i].toString());
            }

        }
    }

    public void displayAll() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

}
