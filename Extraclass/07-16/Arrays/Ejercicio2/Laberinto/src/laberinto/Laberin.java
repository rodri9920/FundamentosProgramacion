
package laberinto;
import java.util.Scanner;
public class Laberin {

    /*
    0 = lugar seguro
    1 = pared
    2 = inicio
    3 = final
    */
    Scanner scanner = new Scanner(System.in);
    
    public void Imprimir(String [][] matrix){
        System.out.println();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    public void Moverse(String [][] matrix){
        int i=6; int j=1;
        String posicion = matrix[i][j];
        posicion = "@";
        String decision = scanner.nextLine();
        for(int f=0; i<matrix.length; f++){
            for(int c=0; j<matrix[f].length; c++){               
                if(decision == "N"){
                    i--;
                    posicion = matrix[i][j];
                }else if(decision == "S"){
                    i++;
                    posicion = matrix[i][j];
                }else if(decision == "E"){
                    i++;
                    posicion = matrix[i][j];
                }else if(decision == "O"){
                    j--;
                    posicion = matrix[i][j];
                }
                System.out.print(" " + matrix[f][c] + " ");
            }
            System.out.println();
        }
    }
    
}

