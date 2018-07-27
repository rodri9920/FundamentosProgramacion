
package login.Logica;

import javax.swing.JOptionPane;


public class Validez {
    private boolean isValid;
    String correo = "@gmail.com";
    public boolean isValid(String user, String pass){
        return user.endsWith(correo);
    }
    
}
