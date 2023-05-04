
package system.view;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import system.beam.Categoria;
import system.beam.Imagen;
import system.controller.CategoriaController;
import system.controller.ListaDobleEnlazadaImagen;
import system.controller.ListaSimpleUsuario;
import system.controller.PanelController;

/**
 * @author matth
 */
public class Biblioteca extends javax.swing.JPanel {
    javax.swing.JPanel ventana;
    PanelController panelControl = new PanelController();
    ListaSimpleUsuario lsU = new ListaSimpleUsuario();
    CategoriaController cateControl = new CategoriaController();
    ListaDobleEnlazadaImagen ldI = new ListaDobleEnlazadaImagen();
    static ArrayList<Imagen> listaImagenes = new ArrayList<Imagen>();
    static int indiceImagenes = 0;
    
    public Biblioteca() {
        initComponents();
        indiceImagenes = 0;
        lbl_User.setText(lsU.getUserLoged());
        setDataCategory();
        setDataImages();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        lbl_User = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_Categoria = new javax.swing.JComboBox<>();
        btn_AgregarC = new javax.swing.JButton();
        btn_EliminarC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        cmb_Imagenes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_Anterior = new javax.swing.JButton();
        btn_Siguiente = new javax.swing.JButton();
        lbl_Imagenes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIBLIOTECA");

        btn_Salir.setBackground(new java.awt.Color(204, 51, 0));
        btn_Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        lbl_User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(0, 0, 0));
        lbl_User.setText("Usuario");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Categorias");

        cmb_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CategoriaActionPerformed(evt);
            }
        });

        btn_AgregarC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AgregarC.setText("Agregar");
        btn_AgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCActionPerformed(evt);
            }
        });

        btn_EliminarC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_EliminarC.setText("Eliminar");
        btn_EliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_AgregarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_EliminarC)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AgregarC)
                    .addComponent(btn_EliminarC))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setName(""); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Agregar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Eliminar.setText("Eliminar Imagen");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        cmb_Imagenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_Imagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ImagenesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Imagenes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Eliminar)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmb_Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(228, 228, 228))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_Eliminar))
                .addGap(22, 22, 22))
        );

        btn_Anterior.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Anterior.setText("<");
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });

        btn_Siguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Siguiente.setText(">");
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });

        lbl_Imagenes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_Anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Siguiente))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(267, 267, 267)
                .addComponent(lbl_User)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_User, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(btn_Salir)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(btn_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(69, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btn_Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        ventana = panelControl.getPanelLogin();
        panelControl.getMain().getVentanaBase().cambiarPaneles(ventana);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void cmb_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CategoriaActionPerformed
        setImageLabel("");
        indiceImagenes = 0;
        setDataImages();
    }//GEN-LAST:event_cmb_CategoriaActionPerformed

    private void btn_AgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCActionPerformed
        String nameUser = lsU.getUserLoged();
        String nombreCategoria = JOptionPane.showInputDialog(this, "Ingrese el nombre de la categoría:");
        if (nombreCategoria != null && !nombreCategoria.isEmpty()) {
            cateControl.crearCategoria(nameUser,nombreCategoria);
            cmb_Categoria.addItem(nombreCategoria);
            JOptionPane.showMessageDialog(null, "Se creo con exito");
        }
    }//GEN-LAST:event_btn_AgregarCActionPerformed

    private void btn_EliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarCActionPerformed
        String nombreCategoria = cmb_Categoria.getSelectedItem().toString();
        int i = cmb_Categoria.getSelectedIndex();
        String nameUser = lsU.getUserLoged();
        cateControl.eliminarCategoria(nameUser, nombreCategoria);
        try{
            cmb_Categoria.removeItemAt(i);            
        }catch(NullPointerException e){
            System.out.println("Se han elinado todas las categorias, categoria General creada pero vacia");
            setDataCategory();
        }        
        JOptionPane.showMessageDialog(null, "Se ha eliminado con exito");
    }//GEN-LAST:event_btn_EliminarCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setMultiSelectionEnabled(true);
        UIManager.put("FileChooser.background", Color.WHITE);
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("FileChooser.approveButtonBackground", Color.BLUE);
        UIManager.put("FileChooser.approveButtonForeground", Color.WHITE);
        if(jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            java.io.File[] selectedFiles = jf.getSelectedFiles();
            for (java.io.File selectedFile : selectedFiles) {                
                String ruta = selectedFile.getAbsolutePath();
                String nombre = selectedFile.getName();
                String categoria = cmb_Categoria.getSelectedItem().toString();
                Imagen guardarImagen = new Imagen(ruta,nombre);
                ldI.addImage(guardarImagen,categoria);
                setDataImages();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String nombreCategoria = cmb_Categoria.getSelectedItem().toString();
        String nombreImagen = cmb_Imagenes.getSelectedItem().toString();
        ArrayList<String> listaSimple = new ArrayList<String>();
        listaSimple.add(nombreCategoria);
        listaSimple.add(nombreImagen);
        ldI.delete(listaSimple);
        setImageLabel("src/image/blanco.jpg");
        setDataImages();        
        JOptionPane.showMessageDialog(null, "La imagen: " + nombreImagen +" se elimino correctamente." );
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void cmb_ImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ImagenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_ImagenesActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        if(listaImagenes == null || listaImagenes.size() != 0){
            String root;
            if(indiceImagenes == 0){
                indiceImagenes = listaImagenes.size() - 1;
                root = listaImagenes.get(indiceImagenes).getRuta();
            }else{
                indiceImagenes = indiceImagenes - 1;
                root = listaImagenes.get(indiceImagenes).getRuta();            
            }
            setImageLabel(root);
        }
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
        if(listaImagenes == null || listaImagenes.size() != 0){
            String root;
            if(indiceImagenes == listaImagenes.size()-1){
                indiceImagenes = 0;
                root = listaImagenes.get(indiceImagenes).getRuta();
            }else{
                indiceImagenes = indiceImagenes + 1;
                root = listaImagenes.get(indiceImagenes).getRuta();            
            }
            setImageLabel(root);
        }        
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void setDataCategory(){
        listaImagenes.removeAll(listaImagenes);
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        categorias = cateControl.obtenerCategorias();
        String nombreUsuario = lsU.getUserLoged();
        int entradas = 0;        
        if(categorias != null){
            for(int i = 0; i < categorias.size(); i++){
            String nombreCategoria = categorias.get(i).getNombreCategoria();
                if(categorias.get(i).getNameUser().equals(nombreUsuario)){
                    cmb_Categoria.addItem(nombreCategoria);
                    entradas = entradas + 1;
                }
            }
        }
        if(entradas == 0 ){
            cateControl.crearCategoria(nombreUsuario, "General");
            setDataCategory();
        }
    }
    
    private void setDataImages(){
        cmb_Imagenes.removeAllItems();
        listaImagenes.removeAll(listaImagenes);
        String categoriaSeleccionada = cmb_Categoria.getSelectedItem().toString();
        String nombreUsuario = lsU.getUserLoged();
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        categorias = cateControl.obtenerCategorias();
        listaImagenes = ldI.listarImagenes(categoriaSeleccionada, nombreUsuario);
        String primeraRuta;
        if(listaImagenes != null){
            for(int i = 0; i < listaImagenes.size(); i++){
                String nombreImagen = listaImagenes.get(i).getNombre();
                cmb_Imagenes.addItem(nombreImagen);    
                if(i == 0){
                    primeraRuta = listaImagenes.get(i).getRuta();
                    setImageLabel(primeraRuta);
                    indiceImagenes = 0;
                }
            }
        }
    }
    
    private void setImageLabel(String root){
        if(cmb_Imagenes.getItemCount() != 0){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(lbl_Imagenes.getWidth(), lbl_Imagenes.getHeight(), Image.SCALE_DEFAULT));
            lbl_Imagenes.setIcon(icon);
            this.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarC;
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_EliminarC;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JComboBox<String> cmb_Categoria;
    private javax.swing.JComboBox<String> cmb_Imagenes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Imagenes;
    private javax.swing.JLabel lbl_User;
    // End of variables declaration//GEN-END:variables
}
