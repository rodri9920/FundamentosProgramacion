
package oo;


public class Carro {
    private boolean EstaEncendido;
    
    public Carro(){
        System.out.println("creando nuevo carro");
        EstaEncendido=false;
    }
    public void Encender(){
        if(EstaEncendido){
            System.out.println("Ya esta encendido");
        }else{
            EstaEncendido=true;
            System.out.println("El carro se ha encendido");
        }
    }
    public void Apagar(){
        if(EstaEncendido){
            EstaEncendido=false;
            System.out.println("El carro se ha apagado");
        }else{
            System.out.println("Ya esta apagado");
        }
    }
}
