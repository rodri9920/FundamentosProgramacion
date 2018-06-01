
package promedio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Promedio {


    public static void main(String[] args) {
        String salida;
        float numero;
        float Suma = 0;
        float Cantidad = 0;
        System.out.println("Introduzca un numero");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        while (numero != 1){
            Suma = Suma + numero;
            Cantidad = Cantidad + 1;
            System.out.println("Introduzca un numero");
            numero = scanner.nextInt();
            }
        float promedio = Suma/Cantidad;
        System.out.println("El promedio es " + promedio);
            
        }
    
    }