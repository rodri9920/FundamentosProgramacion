
package bancosemana5;


public class BancoSemana5 {


    public static void main(String[] args) {
        Cuenta BAC = new Cuenta();
        BAC.Acreditar(2000);
        System.out.println("Listo, le quedan " + BAC.getSaldo());
        BAC.Debitar(4000);
        
        Cuenta BCR = new Cuenta();
        BCR.Debitar(15000);
        BCR.Acreditar(6000);
        
    }
    
}
