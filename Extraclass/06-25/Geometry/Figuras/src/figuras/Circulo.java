
package figuras;


public class Circulo {
    
    private double Perimetro;
    private double Area;
    
    public double Perimetro(int radio){
        Perimetro = (2*3.14)*radio;
        return Perimetro;
    }
    
    public double Area(int radio){
        Area = 3.14*(radio*radio);
        return Area;
    }
    
    public Circulo(){
        
    }
}
