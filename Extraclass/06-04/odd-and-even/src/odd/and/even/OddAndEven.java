
package odd.and.even;

import java.util.Scanner;
public class OddAndEven {

  
    public static void main(String[] args) {
        boolean EsPar;
        int Par=0, Impar=0;
        System.out.println("Introduzca un numero");
        Scanner scanner=new Scanner(System.in);
        int numero= scanner.nextInt();
        while(numero!=0){
            if(numero%2==0){
                EsPar=true;
                Par++;
                System.out.println(numero+(EsPar?" si":" no")+" es par");
                System.out.println("Introduzca un numero");
                numero=scanner.nextInt();
            }else{
                EsPar=false;
                Impar++;
                System.out.println(numero+(EsPar?" si":" no")+" es par");
                System.out.println("Introduzca un numero");
                numero=scanner.nextInt();
            }if(numero==0){
                System.out.println("Usted introdujo "+Par+" numeros pares y "+Impar+" impares");
            }
            
        }
    }
    
}
