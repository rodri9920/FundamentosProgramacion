
package wordscounter;
import java.util.Scanner;

public class WordsCounter {


    public static void main(String[] args) {
        System.out.println("Introduzca un texto");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        int palabras = 1;
        
         for(int i=0; i<texto.length();i++){
            if(texto.charAt(i)==' '){
                palabras++;
            }
        }System.out.println("Usted introdujo "+palabras+" palabras");
    }
    
}
