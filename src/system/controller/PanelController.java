
package system.controller;

import system.main.Main;
import system.view.Login;

/**
 * @author matth
 */
public class PanelController {
    
    public Main getMain(){
        Main main = new Main();
        return main;
    }
    
    public Login getLogin(){
        Login log = new Login();
        return log;        
    }
}
