
package system.beam;

import java.util.ArrayList;

/**
 * @author matth
 */

public class Categoria {
    private String nameUser;
    private String nombreCategoria;
    private ArrayList<Imagen> imagenes;

    public Categoria() {
    }

    public Categoria(String nameUser, String nombreCategoria) {
        this.nameUser = nameUser;
        this.nombreCategoria = nombreCategoria;
        this.imagenes = new ArrayList<Imagen>();
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }    

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
