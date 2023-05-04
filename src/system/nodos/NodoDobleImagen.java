
package system.nodos;

import system.beam.Imagen;

/**
 * @author matth
 */

public class NodoDobleImagen {
    private Imagen imagen;
    private NodoDobleImagen siguiete;
    private NodoDobleImagen anterior;
    
    public NodoDobleImagen(){        
    }
    
    public NodoDobleImagen(Imagen imagen){
        this.imagen = imagen;
        this.siguiete = null;
        this.anterior = null;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public NodoDobleImagen getSiguiente() {
        return siguiete;
    }

    public NodoDobleImagen getAnterior() {
        return anterior;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public void setSiguiete(NodoDobleImagen siguiete) {
        this.siguiete = siguiete;
    }

    public void setAnterior(NodoDobleImagen anterior) {
        this.anterior = anterior;
    }
}
