
package race;


public class Wheels {
    
    private int wheels_size;

    public Wheels(int size){
        wheels_size = size;
    }
    
    public float getfactor(){
        float factor = wheels_size/20f;
        return factor;
    }
}
