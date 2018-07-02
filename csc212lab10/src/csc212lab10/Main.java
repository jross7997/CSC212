/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

/**
 *
 * @author Justin
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StringStack ss = new StringStack(4);
       String command;
       String word = "";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter push, pop, peek, combine, or quit:");
       command = sc.next();
       while(!command.equals("quit")){
           if(command.equals("push")){
               word = sc.next();;
               ss.push(word);
           }else{
               if(command.equals("peek")){
                   word = ss.peek();
                   if(word != null){
                       System.out.println("Top: " + word);
                   }else{
                       System.out.println("Stack is empty");
                   }
               }else{
                   if(command.equals("pop")){
                       word = ss.pop();
                   if(word != null){
                       System.out.println("Pop: " + word);
                   }else{
                       System.out.println("Stack is empty");
                   }
                   }else{
                       if(command.equals("combine")){
                           String line1 = ss.pop();
                           String line2 = ss.pop();
                           word = line1 + line2;
                           ss.push(word);
                       }
                   }
               }
           }
            System.out.println("Enter push, pop, peek, combine, or quit:");
            command = sc.next();   
       }
       System.out.println("Program Ending");
    }
    
}
