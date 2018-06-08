
package palindrome;
import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una palabra para verificar si es un palindromo");
        String palabra = scanner.nextLine();
        int inicio=0; 
        int fin=palabra.length()-1;
        boolean palindromo=true;
        while(inicio<fin){
            if(palabra.charAt(inicio)==palabra.charAt(fin)){
                inicio++;
                fin--;
            }else{
                palindromo=false;
                break;
            }
        }System.out.println(palabra+(palindromo ?" si ":" no ")+"es un palindromo");
    }
    
    
}
