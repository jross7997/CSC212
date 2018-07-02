/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Players {
    private ArrayList<Player> list;
    private ArrayList<String> ids;
    public Players(){
        ids = new ArrayList<String>();
        list = new ArrayList<Player>();
}
    public void load(String fn) throws FileNotFoundException{
        File f = new File(fn);
        Scanner sc = new Scanner(f);
        
        int i = 0;
        while(sc.hasNextLine()){
            Scanner lineScanner = new Scanner(sc.nextLine());
            lineScanner.useDelimiter(",");
            ids.add(i,lineScanner.next());
            Player p = new Player(lineScanner.next(), lineScanner.next());
            list.add(p);
            i++;
        } 
    }
    public String getPlayerById(String id){
    int index = ids.indexOf(id);
    if(index > -1){
        return list.get(index).toString();
    }else{
        return null;
    }
}
    public void printIdsByName(String l) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getLastName().equals(l)){
                System.out.println(ids.get(i) + ": " + list.get(i));
            }
        }
    }
    
}
