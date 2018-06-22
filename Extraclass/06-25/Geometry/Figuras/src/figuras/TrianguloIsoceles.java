
package figuras;


public class TrianguloIsoceles {
    
    private int Perimetro;
    private int Area;
    
    public int Perimetro(int lados, int lado){
        Perimetro = (lados*2)+lado;
        return Perimetro;
    }
    
    public int Area(int lados, int lado){
        Area = (int)(lado*Math.sqrt((lados^2-((lado^2)/4))/2));
        return Area;
    }
}
