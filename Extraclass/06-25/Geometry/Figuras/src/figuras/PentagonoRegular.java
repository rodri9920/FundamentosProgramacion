
package figuras;


public class PentagonoRegular {
    
    private int Perimetro;
    private int Area;
    
    public int Perimetro(int lado){
        Perimetro = lado*5;
        return Perimetro;
    }
    
    public int Area(int lado, int apotema){
        Area = (lado*5*apotema)/2;
        return Area;
    }
}
