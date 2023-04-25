
package system.beam;

/**
 * @author matth
 */
public class Usuario {
    private int id_User;
    private String nombre;
    
    public Usuario(){
    }

    public Usuario(int id_User, String nombre) {
        this.id_User = id_User;
        this.nombre = nombre;
    }

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
