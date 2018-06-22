
package figuras;


public class TrianguloEquilatero {
    
    private int Perimetro;
    private int Area;
    
    public int Perimetro(int lado){
        Perimetro = lado*3;
        return Perimetro;
    }
    
    public int Area(int lado){
        Area = (int)(Math.sqrt(3)/4)*(lado^2);
        return Area;
    }
}
