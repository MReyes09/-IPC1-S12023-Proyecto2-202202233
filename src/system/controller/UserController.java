
package system.controller;

import java.util.ArrayList;
import system.beam.Usuario;

/**
 * @author matth
 */
public class UserController {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private static int indexUserLoged;
    
    public void createFirstUser(){
        listaUsuarios.add(new Usuario(0,"Matthew"));
    }
    
    public Usuario login(String nombre){
        Usuario findUser = new Usuario();
        for(int i = 0; i < listaUsuarios.size(); i++ ){
            if(listaUsuarios.get(i).getNombre().equals(nombre)){
                findUser = listaUsuarios.get(i);
                indexUserLoged = i;
                return findUser;
            }
        }
        return null;
    }
    
    public void createUsers(String nombre){
        listaUsuarios.add(new Usuario(listaUsuarios.size()+1,nombre));
        indexUserLoged = listaUsuarios.size()-1;        
    }
    
    public Usuario getUserLoged(){
        Usuario userFind = new Usuario();
        userFind = listaUsuarios.get(indexUserLoged);
        return userFind;
    }
    
    public ArrayList<Usuario> getListUser(){
        return listaUsuarios;
    }
}
