
package system.controller;

import system.beam.Usuario;
import system.nodos.NodeUser;

/**
 * @author matth
 */

public class ListaSimpleUsuario extends EstructuraDeDatos{
    private static NodeUser inicio;
    private static String userLoged;
    
//    public ListaSimpleUsuario() {
//        this.inicio = null;
//    }

    @Override
    public void add(Object e) {
        Usuario userAdd = (Usuario)e;
        NodeUser nuevoNodo = new NodeUser(userAdd);
        userLoged = userAdd.getNombre();
        if(inicio == null){
            inicio = nuevoNodo;
        }else{
            NodeUser temporal = inicio;
            //Recorre todos los nodos hasta hallar un puntero que tenga null Node1 -> Node2 -> Null
            while(temporal.getSiguienteUsuario() != null){
                temporal = temporal.getSiguienteUsuario();
            }
            //Al ultimo puntero que contiene referencia a un Node2 -> null
            //Intercambia el dato null por un nuevoNodo (agregar un usuario)
            temporal.setSiguiente(nuevoNodo);
        }
    }
    
    public void mostrarTOdo(){
        NodeUser temporal = inicio;
        while(temporal != null){
            Usuario userTemp = temporal.getUsuario();
            System.out.println("El usuario contenido en el nodo es: " + userTemp.getNombre());
            temporal = temporal.getSiguienteUsuario();
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        Usuario userFind = (Usuario) e;
        NodeUser temporal = inicio;
        while(temporal != null){
            Usuario userTemp = temporal.getUsuario();
            if(userTemp.getNombre().equals(userFind.getNombre())){
                Object obj = (Object)temporal.getUsuario();
                return obj; 
            }else{
                temporal = temporal.getSiguienteUsuario();
            }
        }
        return null;
    }
    
    public Object logedUser(Object e) {
        Usuario userFind = (Usuario) e;
        NodeUser temporal = inicio;
        while(temporal != null){
            Usuario userTemp = temporal.getUsuario();
            if(userTemp.getNombre().equals(userFind.getNombre())){
                Object obj = (Object)temporal.getUsuario();
                userLoged = userTemp.getNombre();
                return obj; 
            }else{
                temporal = temporal.getSiguienteUsuario();
            }
        }
        return null;
    }
    
    public String getUserLoged(){
        return userLoged;
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
