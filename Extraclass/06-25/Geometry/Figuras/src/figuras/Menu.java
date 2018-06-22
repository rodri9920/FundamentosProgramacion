
package figuras;
import javax.swing.JOptionPane;

public class Menu {
    
    private Circulo circulo;
    private Cuadrado cuadrado;
    private Rectangulo rectangulo;
    private TrianguloEquilatero equilatero;
    private TrianguloIsoceles isoceles;
    private PentagonoRegular pentagono;
    
    public void Menu(){
        int decision = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 para Perimetro, 2 para Area, 3 para salir"));
        while(decision !=3){
            int figura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 para cuadrado, 2 para rectangulo, 3 para circulo, 4 para Triangulo Equilatero, 5 para Isoceles y 6 para Pentagono Regular"));
            if(decision == 1){
                if(figura == 1){
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado del cuadrado"));
                    JOptionPane.showMessageDialog(null, "El perimetro es ");
                    decision = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 para Perimetro, 2 para Area, 3 para salir"));
                }else{
                    if(figura == 2){
                        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
                        JOptionPane.showMessageDialog(null, "El perimetro es " + rectangulo.Perimetro(base, altura));
                        decision = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 para Perimetro, 2 para Area, 3 para salir"));
                    }
                }
            }else{
                if(decision == 2){
                    
                }
            }
        }
    }
    public Menu(){
        
    }
}
