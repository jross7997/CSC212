/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab05;

/**
 *
 * @author Justin
 */
import java.util.Scanner;
import java.io.File;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String line;
        int lineNum = 0;
        File input = new File("myfile.txt");
        Scanner sc = new Scanner(input);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            lineNum++;
            System.out.println(lineNum + " : " + line.toUpperCase());
      
        }
        System.out.println("End of file reached");
    }

}
