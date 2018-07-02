/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Awards {

    private ArrayList<String> id;
    private ArrayList<Award> goals;

    public Awards() {
        id = new ArrayList<String>();
        goals = new ArrayList<Award>();
    }

    public void load(String f1) throws FileNotFoundException {
        File f = new File(f1);
        Scanner sc = new Scanner(f);
        int i = 0;
        while (sc.hasNextLine()) {
            Scanner lineScanner = new Scanner(sc.nextLine());
            lineScanner.useDelimiter(",");
            String iD = lineScanner.next();
            String title = lineScanner.next();
            int year = lineScanner.nextInt();
            String league = lineScanner.next();
            id.add(i, iD);
            Award a = new Award(title, year, league,iD);
            goals.add(a);
            i++;
        }
    }
    public void printAwards(String id){
        int j = 0;
        for(int i = 0; i < goals.size();i++){
          if(goals.get(i).getId().equals(id)){
              System.out.println(goals.get(i).toString());
              j++;
         }
       } if(j == 0){
           System.out.println("No awards for this player.");
       }
        
    }
    
    }
