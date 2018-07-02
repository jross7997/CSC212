/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class CDDB {
    private HashMap<String,CompactDisc> database;
    
    public CDDB(){
        database = new HashMap();
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

}