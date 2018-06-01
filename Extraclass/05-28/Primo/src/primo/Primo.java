
package primo;

import java.util.Scanner;


public class Primo {


    public static void main(String[] args) {
        int numero;
        int divisor = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero al cual desea saber si es primo o no");
        numero = scanner.nextInt();
        int i = numero - 1;
        while (divisor <= i){
            int resultado = numero%divisor;
            if (resultado != 0){
                System.out.println(numero + " es primo");
            } else
                System.out.println(numero + " no es primo");
            divisor++;
        }
        
    }
    
}