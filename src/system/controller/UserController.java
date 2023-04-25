
package system.controller;

import java.util.ArrayList;
import system.beam.Usuario;

/**
 * @author matth
 */
public class UserController {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(); 
    
    public void createFirstUser(){
        listaUsuarios.add(new Usuario(0,"Matthew"));
    }
    
    public Usuario login(String nombre){
        Usuario findUser = new Usuario();
        for(int i = 0; i < listaUsuarios.size(); i++ ){
            if(listaUsuarios.get(i).getNombre().equals(nombre)){
                findUser = listaUsuarios.get(i);
                return findUser;
            }
        }
        return null;
    }
    
    public ArrayList<Usuario> getListUser(){
        return listaUsuarios;
    }
}
