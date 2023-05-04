
package system.controller;

import system.main.Main;
import system.view.Biblioteca;
import system.view.Login;
import system.view.MenuInicio;

/**
 * @author matth
 */
public class PanelController {
    
    public Main getMain(){
        Main main = new Main();
        return main;
    }
    
    public Login getPanelLogin(){
        Login log = new Login();
        return log;        
    }
    
    public MenuInicio getPanelMenuInicio(){
        MenuInicio menuIn = new MenuInicio();
        return menuIn;
    }
    
    public Biblioteca getPanelBiblioteca(){
        Biblioteca biblioteca = new Biblioteca();
        return biblioteca;
    }
}
