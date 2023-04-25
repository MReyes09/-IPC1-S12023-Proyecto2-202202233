
package system.main;

import system.view.VentanaBase;

/**
 * @author matth
 */

public class Main {
    static VentanaBase ventanaBase = new VentanaBase();
    
    public static void main(String[] args) {
        ventanaBase.setVisible(true);
        ventanaBase.setLocationRelativeTo(null);
    }
    
    public VentanaBase getVentanaBase(){
        return ventanaBase;
    }
}
