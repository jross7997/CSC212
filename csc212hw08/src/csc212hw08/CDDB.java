/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Justin
 */
public class CDDB {
    private HashMap<String,CompactDisc> database;
    
    public CDDB(){
        database = new HashMap<String,CompactDisc>();
    }
    public void load(String fn) throws FileNotFoundException{
        File f = new File(fn);
        Scanner sc = new Scanner(f);
        
    
    while (sc.hasNextLine()) {
        Scanner lineScanner = new Scanner(sc.nextLine());
        lineScanner.useDelimiter(",");
        CompactDisc cd = new CompactDisc(lineScanner.next(), lineScanner.nextDouble(), lineScanner.next(), lineScanner.next());
        database.put(cd.getUPC(), cd); 
    }
    
    }

public String getCD(String key){
        if(database.containsKey(key)){
            return database.get(key).toString();
        }else{
            return null;
        }
}
public void addCD(String u, double p, String a, String t){
    CompactDisc cd = new CompactDisc(u,p,a,t);
    database.put(cd.getUPC(),cd);
    System.out.println("Add complete.");
}
public void printByName(String n){
    int k = 0;
    for(Map.Entry<String, CompactDisc> entry: database.entrySet()){
        String name = entry.getValue().getArtist();
        if(name.indexOf(n) != -1){
        System.out.println(entry.getValue());
        k++;
    } 
        }if(k == 0){
            System.out.println("No CDs found for " + n);
    }  
    
}
public void printAll(){
    for(Map.Entry<String, CompactDisc> entry: database.entrySet()){
        System.out.println(entry.getValue());
    }

}
}