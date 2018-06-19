
package figuras;

import java.util.Scanner;

public class Figuras {


    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
                       
        System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
        Scanner scanner = new Scanner(System.in);
        int Decision = scanner.nextInt();
        while(Decision != 3){
            System.out.println("Introduzca 1 para cuadrado, 2 para rectangulo y 3 para circulo");
            int Figura = scanner.nextInt();
            if(Decision == 1){
                if(Figura == 1){
                    System.out.println("Introduzca el lado del cuadrado");
                    int lado = scanner.nextInt();
                    System.out.println("El perimetro es " + cuadrado.Perimetro(lado));
                    System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
                    Decision = scanner.nextInt();
                }else{
                    if(Figura == 2){
                        System.out.println("Introduzca la base y la altura del rectangulo, por separado");
                        int base = scanner.nextInt();
                        int altura = scanner.nextInt();
                        System.out.println("El perimetro es " + rectangulo.Perimetro(base, altura));
                        System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
                        Decision = scanner.nextInt();
                    }else{
                        if(Figura == 3){
                            System.out.println("Introduzca el radio del circulo");
                            int radio = scanner.nextInt();
                            System.out.println("El perimetro es " + circulo.Perimetro(radio));
                            System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
                            Decision = scanner.nextInt();
                        }
                    }
                }
            }else{
                if(Decision == 2){
                    if(Figura == 1){
                        System.out.println("Introduzca el lado del cuadrado");
                        int lado = scanner.nextInt();
                        System.out.println("El area es " + cuadrado.Area(lado));
                        System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
                        Decision = scanner.nextInt();
                    }else{
                        if(Figura == 2){
                            System.out.println("Introduzca la base y la altura del rectangulo, por separado");
                            int base = scanner.nextInt();
                            int altura = scanner.nextInt();
                            System.out.println("El area es " + rectangulo.Area(base, altura));
                            System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
                            Decision = scanner.nextInt();
                        }else{
                            if(Figura == 3){
                                System.out.println("Introduzca el radio del circulo");
                                int radio = scanner.nextInt();
                                System.out.println("El area del circulo es " + circulo.Area(radio));
                                System.out.println("Introduzca 1 para Perimetro, 2 para Area, 3 para salir");
                                Decision = scanner.nextInt();
                            }
                        }
                    }
                }
            }
            
        }
    }
    
}
