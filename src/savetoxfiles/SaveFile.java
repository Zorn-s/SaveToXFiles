/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetoxfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Adm
 */

// git test

public class SaveFile implements Save{

    String data;
    String path;

    @Override
    public String data() {
        return data;
    }

    @Override
    public String path() {
        return path;
    }
    
public void SaveFiles(String data,String path){
        
        this.data = data;
        this.path = path;
        
 //System.out.println("Пишем в файл!" + data+" - "+path);
 

    try {
            System.out.println("Пишем в файл!"); 
            Files.write(Paths.get(path), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


     
    }
    
    
}
