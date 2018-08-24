
package tarea7;

public class Carro {
    String modelo;
    String dueño;
    int año;

    public Carro(String modelo, String dueño, int año) {
        this.modelo = modelo;
        this.dueño = dueño;
        this.año = año;
    }
    
    @Override
    public String toString(){
        return(this.modelo + ";" + this.dueño + ";" + this.año + "\n");
    }
}
