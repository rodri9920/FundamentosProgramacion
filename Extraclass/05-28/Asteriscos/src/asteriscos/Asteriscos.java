
package asteriscos;

import java.util.Scanner;


public class Asteriscos {
    
    public static void ImprimirLineaCompleta(int lado){
        for (int j=0; j<lado; j++){
                    System.out.print("*");
}
    }
    
    public static void ImprimirLineaVacia(int lado){
        System.out.print("*");
        for(int j=0; j<lado-2; j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el lado");
        int lado= scanner.nextInt();
        for(int i=0; i<lado; i++){
            if(i==0 || i==lado-1){
                ImprimirLineaCompleta(lado);
            }else{
                ImprimirLineaVacia(lado);
            }
            System.out.print("\n");
        }
        
            
            
        }
    }
    

