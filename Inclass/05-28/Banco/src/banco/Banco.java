
package banco;

import java.util.Scanner;

public class Banco {

 
    public static void main(String[] args) {
        int cuenta = 40000;
        String decision;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usted tiene $" + cuenta + ". Introduzca la accion: ");
        decision = scanner.next();
        while (decision.compareTo("salir") !=0){
            if (decision.compareTo("debito") == 0){
                System.out.println("Introduzca el monto a debitar");
                int monto = scanner.nextInt();
                int remanente = cuenta - monto;
                if (remanente >= 0){
                    cuenta = cuenta - monto;
                    System.out.println("Debito listo! Quedan: $" + cuenta);
                } else
                    System.out.println("No tiene suficientes fondos. Solo quedan $" + cuenta);
            } else if (decision.compareTo("credito") == 0){
                System.out.println("Introduzca el monto a acreditar: ");
                int monto = scanner.nextInt();
                cuenta = cuenta + monto;
                System.out.println("Credito listo! Quedan: $" + cuenta);
            }
            System.out.println("Usted tiene $" + cuenta + ". Introduzca la accion: ");
            decision = scanner.next();
        }
    }
    
}