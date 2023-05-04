
package system.beam;

import system.nodos.NodoDobleImagen;

/**
 * @author matth
 */

public class Categoria {
    private String nameUser;
    private String nombreCategoria;
    private NodoDobleImagen imagenes;

    public Categoria() {
    }

    public Categoria(String nameUser, String nombreCategoria, NodoDobleImagen imagen) {
        this.nameUser = nameUser;
        this.nombreCategoria = nombreCategoria;
        this.imagenes = imagen;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public NodoDobleImagen getImagenes() {
        return imagenes;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setImagenes(NodoDobleImagen imagenes) {
        this.imagenes = imagenes;
    }
}
