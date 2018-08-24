
package tarea7;

import java.io.FileReader;

public class Tarea7 {


    public static void main(String[] args) {
        CSVWriter CSV = new CSVWriter("C:\\Users\\rodri\\Desktop\\Datos.csv");
        Personas Rodri = new Personas("Rodrigo", "Avendano", 19);
        Personas Batman  = new Personas("Bruce", "Wayne", 49);
        CSV.write(Rodri);
        CSV.write(Batman);
        Carro Batimovil = new Carro("Batimovil", "Rodrigo", 2050);
        CSV.write(Batimovil);
        
    }
    
}
