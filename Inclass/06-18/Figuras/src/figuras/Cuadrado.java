
package figuras;


public class Cuadrado {
    
    private int Perimetro;
    private int Area;
    
    
    public int Perimetro(int lado){
        Perimetro = lado*4;
        return Perimetro;
    }
    
    public int Area(int lado){
        Area = lado*lado;
        return Area;
    }
    
    public Cuadrado(){
        
    }
}


