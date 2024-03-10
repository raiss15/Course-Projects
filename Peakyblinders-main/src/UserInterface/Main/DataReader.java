/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class DataReader {
    
    private BufferedReader reader;
    private String[] header;
     File file;
    
    public DataReader(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        System.out.println(fileName);
        if(!file.exists())
            throw new FileNotFoundException("File not found at the path specified: "+fileName);
        reader = new BufferedReader(new FileReader(file));
    }

    public List<String[]> getData() throws IOException { 
    int count = 0;
    List<String[]> content = new ArrayList<>();
        String line = "";
        while ((line = reader.readLine()) != null) {
            
            content.add(line.split(","));
        }
    return content;
}
    public void appendStringToFile(String line) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(line);
            writer.newLine();
        }
    }
}

