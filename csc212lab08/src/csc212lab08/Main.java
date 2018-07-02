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
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
       File f = new File("candy.txt");
       Scanner sc = new Scanner(f);

       String[] candyNames;
       int numNames = sc.nextInt();
       sc.nextLine();
       
       candyNames = new String[numNames];
       
       for(int i = 0; i < numNames; i++){
          String line = sc.nextLine();
          candyNames[i]= line;
           System.out.println("Adding " + candyNames[i]); 
       }
       Random r = new Random();
       
       Scanner kb = new Scanner(System.in);
       //System.out.println(candyNames[r.nextInt(numNames)]);
       
       System.out.println("Press ENTER for candy, or type 'quit'");
       String  command = kb.nextLine();
       while(!command.equals("quit")){
           Candy c = new Candy(candyNames[r.nextInt(numNames)],r.nextFloat(),r.nextInt(4)+1);
           System.out.println(c);
          
           System.out.println("Press ENTER for candy, or type 'quit'");
           command = kb.nextLine();
       }
       
    }
    
}
