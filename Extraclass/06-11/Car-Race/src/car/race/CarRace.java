
package car.race;


public class CarRace {


    public static void main(String[] args) {
        Carro ferrari = new Carro(145);
        Carro bugatti = new Carro(150);
        Carro Yitan = new Carro(195);
        while((ferrari.metros_avanzados()<10000) && (bugatti.metros_avanzados()<10000) && Yitan.metros_avanzados()
                <10000){
            ferrari.moverse();
            bugatti.moverse();
            Yitan.moverse();
        }
        if(10000 <= ferrari.metros_avanzados()){
            System.out.println("El carro Ferrari ha ganado");
        }else{
            if(10000 <= Yitan.metros_avanzados()){
                System.out.println("El chofer Yitan ha ganado");
            }else{
                if(10000 <= bugatti.metros_avanzados()){
                    System.out.println("El carro Bugatti ha ganado");
                }
            }
        }
            
    }
}
