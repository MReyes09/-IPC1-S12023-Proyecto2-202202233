
package system.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import system.beam.Categoria;
import system.beam.Imagen;
import system.nodos.NodoDobleImagen;

/**
 * @author matth
 */
public class ListaDobleEnlazadaImagen extends EstructuraDeDatos{
    private CategoriaController categoryControl = new CategoriaController();
    private ListaSimpleUsuario lsU = new ListaSimpleUsuario();

    @Override
    public void add(Object e) {
    }
    
    public void addImage(Object e, String categoria){
        Imagen imagenAGuardar = (Imagen)e;        
        ArrayList<Categoria> categorias = categoryControl.obtenerCategorias();
        String categoriaBuscar = categoria;
        String userLoged = lsU.getUserLoged();
        
        for(int i = 0; i < categorias.size(); i++){
            String categoriaRef = categorias.get(i).getNombreCategoria();
            String userRef = categorias.get(i).getNameUser();
            
            if(categoriaRef.equals(categoriaBuscar)){
                if(userRef.equals(userLoged)){
                    Categoria cateTemp = categorias.get(i);//OBTENGO LA CATEGORIA
                    NodoDobleImagen nuevaImagen = new NodoDobleImagen(imagenAGuardar);//CREO UN NODO AUN NO RELACIONADO
                    NodoDobleImagen inicio = categorias.get(i).getImagenes(); //CREO UNA COPIA DE LOS NODOS ANIDADOS DE LA CATEOGIRA
                    
                    if(inicio == null){
                        inicio = nuevaImagen; //Se crea el primer nodo
                        cateTemp.setImagenes(inicio); //Se agrega el primer nodo a categoria
                        categoryControl.actualizar(cateTemp); //Se actualiza la categoria
                        System.out.println(" ");
                        JOptionPane.showMessageDialog(null, "Se ha guardado todo correctamente");                        
                    }else{
                        NodoDobleImagen temporal = inicio; //Creo una copia de los nodos contenidos en la categoria
                        while(temporal.getSiguiente() != null){
                            temporal = temporal.getSiguiente(); //Se mueve hacia la derecha hasta encontrar un puntero nullo
                        }
                        nuevaImagen.setAnterior(temporal);
                        temporal.setSiguiete(nuevaImagen); //Se relacionaron los nodos
                        while(temporal.getAnterior() != null){
                            temporal = temporal.getAnterior();
                        }
                        cateTemp.setImagenes(temporal);
                        categoryControl.actualizar(cateTemp);
                        JOptionPane.showMessageDialog(null, "Se ha guardado la imágen: " + imagenAGuardar.getNombre());
                    }
                }
            }
        }
    };

    public ArrayList<Imagen> listarImagenes(String categoria, String nombreUser){
        ArrayList<Categoria> listaCategorias = categoryControl.obtenerCategorias();
        ArrayList<Imagen> listaImagenes = new ArrayList<Imagen>();
        for(int i = 0; i < listaCategorias.size(); i++){
            String nombreCategoria = listaCategorias.get(i).getNombreCategoria();
            String nombreUsuario = listaCategorias.get(i).getNameUser();
            
            if(nombreCategoria.equals(categoria)){
                if(nombreUsuario.equals(nombreUser)){
                    Categoria cateTemp = listaCategorias.get(i);
                    NodoDobleImagen temporal = cateTemp.getImagenes();
                    while(temporal != null){
                        listaImagenes.add(temporal.getImagen());
                        temporal = temporal.getSiguiente();                        
                    }
                }
            }
        }
        return listaImagenes;
    }
    
    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        ArrayList<String> listaOb = (ArrayList<String>)e;
        String categoriaABuscar = listaOb.get(0);
        String imagenABuscar = listaOb.get(1);
        String userLoged = lsU.getUserLoged();
        ArrayList<Categoria> categorias = categoryControl.obtenerCategorias();
        
        for(int i =0; i < categorias.size(); i++){
            String categoriaObtenida = categorias.get(i).getNombreCategoria();
            String usuarioPertenece = categorias.get(i).getNameUser();
            if(categoriaObtenida.equals(categoriaABuscar)){
                if(usuarioPertenece.equals(userLoged)){
                    NodoDobleImagen temporal = categorias.get(i).getImagenes();//Nodo inicial
                    boolean finded = false;
                    Categoria categoriaNueva = new Categoria();
                    while(finded == false){
                        String imagenEncontrada = temporal.getImagen().getNombre();
                        if(imagenEncontrada.equals(imagenABuscar)){
                            if(temporal.getAnterior() == null && temporal.getSiguiente() != null){
                                categoriaNueva.setNameUser(usuarioPertenece);
                                categoriaNueva.setNombreCategoria(categoriaObtenida);
                                NodoDobleImagen imagenNueva = temporal.getSiguiente();
                                imagenNueva.setAnterior(null);
                                categoriaNueva.setImagenes(imagenNueva);
                                categoryControl.actualizar(categoriaNueva);
                                finded = true;
                            }else if(temporal.getAnterior() == null && temporal.getSiguiente() == null){//Ultimo que queda
                                categoriaNueva.setNameUser(usuarioPertenece);
                                categoriaNueva.setNombreCategoria(categoriaObtenida);
                                categoriaNueva.setImagenes(null);
                                categoryControl.actualizar(categoriaNueva);
                                finded = true;
                            }else if(temporal.getSiguiente() == null ){//es el ultimo
                                categoriaNueva.setNameUser(usuarioPertenece);
                                categoriaNueva.setNombreCategoria(categoriaObtenida);
                                temporal = temporal.getAnterior();
                                temporal.setSiguiete(null);
                                
                                while(temporal.getAnterior() != null){
                                    temporal = temporal.getAnterior();
                                }
                                categoriaNueva.setImagenes(temporal);
                                categoryControl.actualizar(categoriaNueva);
                                finded = true;
                            }else if(temporal.getSiguiente() != null){
                                categoriaNueva.setNameUser(usuarioPertenece);
                                categoriaNueva.setNombreCategoria(categoriaObtenida);
                                NodoDobleImagen imagenSiguiente = temporal.getSiguiente();
                                temporal = temporal.getAnterior();
                                imagenSiguiente.setAnterior(temporal);
                                temporal.setSiguiete(imagenSiguiente);
                                while(temporal.getAnterior() != null){
                                    temporal = temporal.getAnterior();
                                }
                                categoriaNueva.setImagenes(temporal);
                                categoryControl.actualizar(categoriaNueva);
                                finded = true;
                            }
                        }else{
                            temporal = temporal.getSiguiente();
                        }
                    }
                }
            }
        }        
    }
    
}
