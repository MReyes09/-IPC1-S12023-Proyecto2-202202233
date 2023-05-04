
package system.main;

import system.beam.Usuario;
import system.nodos.NodeUser;
import system.view.VentanaBase;
import system.controller.ListaSimpleUsuario;

/**
 * @author matth
 */

public class Main {
    static VentanaBase ventanaBase = new VentanaBase();
    
    public static void main(String[] args) {
        ListaSimpleUsuario lsu = new ListaSimpleUsuario();
        Usuario addUser = new Usuario("Matthew");
        lsu.add(addUser);
        ventanaBase.setVisible(true);
        ventanaBase.setLocationRelativeTo(null);
    }
    
    public VentanaBase getVentanaBase(){
        return ventanaBase;
    }
}
