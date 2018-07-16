
package laberinto;
import java.util.Scanner;
public class Laberinto {

    public static void main(String[] args) {
        String [][] juego = {
        {"1","1","1","1","1","1","1"},
        {"1","0","0","0","0","0","3"},
        {"1","0","1","0","1","0","1"},
        {"0","0","1","0","0","0","1"},       
        {"1","0","1","0","1","0","1"},
        {"1","0","0","0","0","0","1"},
        {"1","2","1","0","1","0","1"},
    };
        
        Laberin laberin = new Laberin();
        laberin.Imprimir(juego);
        System.out.println("Digite 1 para iniciar, P sera su posicion. Para salir presione 2" );        
        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();
        String norte="N", sur="S", este="E", oeste="O", iniciar="Vamos";
        String player = "P";
        int fila = 6;
        int columna = 1;
        
        boolean salio = false;
        if(decision.equals("1")){
            while(salio == false){
                juego[fila][columna]=player;
                laberin.Imprimir(juego);
                System.out.println("Hacia donde se quiere mover? Use N, S, E u O");
                String direccion = scanner.nextLine();
                if(direccion.equals(norte)){
                    juego[fila][columna]="0";
                    fila--;
                    juego[fila][columna]=player;
                }else if(direccion.equals(sur)){
                    juego[fila][columna]="0";
                    fila++;
                    juego[fila][columna]=player;
                }else if(direccion.equals(este)){
                    juego[fila][columna]="0";
                    columna++;
                    juego[fila][columna]=player;
                }else if(direccion.equals(oeste)){
                    juego[fila][columna]="0";
                    columna--;
                    juego[fila][columna]=player;
                }
                if(juego[1][6].equals(player)){
                    System.out.println("Felicidades, usted ha salido del laberinto");
                    salio=true;
                }
            }
        }else if(decision.equals("2")){
            System.exit(0);
        }
        
    }
    
}
