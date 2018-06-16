
package car.race;

public class Carro {
    
    private int metros_avanzados;
    private int Fuerza;
    private int año;
    
    public Carro(int Fuerza){
        this.Fuerza = Fuerza;
    }
    
    public int metros_avanzados(){
        return metros_avanzados;
    }
    
    private void SetMetrosAvanzados(int metros_avanzados){
        this.metros_avanzados = metros_avanzados;
    }
    
    public void moverse(){
        metros_avanzados = metros_avanzados + (((int)(Math.random()*10)+1)*Fuerza);
    }
}