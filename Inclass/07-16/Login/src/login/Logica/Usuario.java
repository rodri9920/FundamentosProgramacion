
package login.Logica;


public class Usuario {

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    
    public Usuario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }
    
    private String usuario;
    private String password;
}
