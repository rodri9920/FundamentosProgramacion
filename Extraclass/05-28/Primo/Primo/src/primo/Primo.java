
package primo;

import java.util.Scanner;

public class Primo {


    public static void main(String[] args) {
        int numero;
        boolean Primo=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero que desea saber si es primo o no");
        numero = scanner.nextInt();
        for(int divisor=2;divisor<numero;divisor++){
            if(numero%divisor==0){
                Primo=false;
                break;
            }else{
                Primo=true;
            }
        }if(Primo==true){
            System.out.println(numero + " es primo");
        }else{
            System.out.println(numero + " no es primo");
        }
    }
    
}
