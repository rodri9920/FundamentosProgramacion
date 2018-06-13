
package oo;


public class Cuadrado {
    
    
    private void LineaLlena(int lado){
        for(int i=0; i<lado; i++){
            System.out.print("*");
        }
    }
    
    private void LineaVacia(int lado){
        for(int i=0; i<lado-2; i++){
            System.out.print("*");
            for(int j=0; j<lado-2; j++){
                System.out.print(" ");
            }
        }
        
    }
    
    public void dibujar(int lado){
        for(int i=0; i<lado; i++){
            if(i==0 || i==lado-1){
                LineaLlena(lado);
            }else{
                LineaVacia(lado);
            }
            System.out.print("\n");
        }
    }
    public Cuadrado(){
        System.out.println("Creando cuadrado");
    }
}
