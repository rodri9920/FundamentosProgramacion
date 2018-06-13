
package bancosemana5;


public class Cuenta {
    
    private int saldo=50000;
    
    public int Debitar(int dinero){
        saldo=saldo-dinero;
        return saldo;
    }
    
    public int Acreditar(int dinero){
        saldo=saldo+dinero;
        return saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    
    public Cuenta(){
        
    }
    
}
