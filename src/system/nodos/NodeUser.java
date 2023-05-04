
package system.nodos;

import system.beam.Usuario;

/**
 * @author matth
 */
public class NodeUser {
    private Usuario user;
    private NodeUser nextUser;

    public NodeUser() {
    }    
    
    public NodeUser(Usuario user) {
        this.user = user;
        this.nextUser = null;
    }
    
    //Captura lo que hay en el siguiente nodo y me lo de vuelve Node1 ---> Node siguiente
    public NodeUser getSiguienteUsuario(){
        return nextUser;
    }
    
    public Usuario getUsuario(){
        return user;
    }
    
    public void setSiguiente(NodeUser nextUser){
        this.nextUser = nextUser;
    }
    
    public void setUsuario(Usuario user){
        this.user = user;
    }
}
