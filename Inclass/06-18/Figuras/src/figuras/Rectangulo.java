
package figuras;


public class Rectangulo {
    
    private int Perimetro;
    private int Area;
    
    public int Perimetro(int base, int altura){
        Perimetro = (base*2)+(altura*2);
        return Perimetro;
    }
    
    public int Area(int base, int altura){
        Area = (base*altura)/2;
        return Area;
    }
    
    public Rectangulo(){
        
    }
}
