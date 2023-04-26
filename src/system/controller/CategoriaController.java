
package system.controller;

import java.util.ArrayList;
import system.beam.Categoria;

/**
 * @author matth
 */
public class CategoriaController {
    private static ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
    
    public ArrayList<Categoria> obtenerCategorias(){
        return listaCategorias;
    }
    
    public void crearCategoria(String nameUser, String nombreCategoria){
        listaCategorias.add(new Categoria(nameUser,nombreCategoria));
    }
    
    public void eliminarCategoria(String nameUser, String nombreCategoria){
        for(int i = 0; i <= listaCategorias.size(); i++ ){
            if(listaCategorias.get(i).getNameUser().equals(nameUser) && 
                    listaCategorias.get(i).getNombreCategoria().equals(nombreCategoria)){
                listaCategorias.remove(i);
                i = listaCategorias.size();
            }
        }
    }
}
