
package tarea7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CSVWriter<T> {
    String archCSV = "C:\\Users\\rodri\\Desktop\\Datos.csv";

    public <T> boolean write(T t){
        try{
            FileWriter writer = new FileWriter(archCSV, true);
            writer.write(t.toString());
            writer.close();
            return true;
        }catch(IOException e){
            System.out.println("Malo");
            return false;
        }
    }
    
    public CSVWriter(String archCSV) {
        
    }
    
    
}
