
package tarea7;

public class Personas {
    String name;
    String lastname;
    int age;
    
    public Personas(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    
 @Override
    public String toString(){
        return(this.name + ";" + this.lastname + ";" + this.age + "\n");
    }
    
}
