
package semana5;
import java.util.Scanner;

public class Semana5 {


    public static void main(String[] args) {
        int random =(int)(Math.random()*100);
        System.out.println("Adivine el numero");
        Scanner scanner = new Scanner(System.in);
        int numero= scanner.nextInt();
        while(numero != random){
            if(numero < random){
                System.out.println("El numero que usted introdujo es menor que el numero correcto, ingrese otro numero");
                numero = scanner.nextInt();
            }if(numero > random){
                System.out.println("El numero que usted introdujo es mayor que el numero correcto, ingrese otro numero");
                numero = scanner.nextInt();
            }
        }if(numero == random){
            System.out.println("Felicidades, usted ha ganado");
        }
    }
    
}
        