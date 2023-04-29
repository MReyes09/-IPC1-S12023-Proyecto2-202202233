
package system.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import system.beam.Categoria;
import system.beam.Imagen;
import system.controller.CategoriaController;
import system.controller.ListaDobleEnlazadaImagen;
import system.controller.ListaSimpleUsuario;
import system.controller.PanelController;
import system.nodos.NodoDobleImagen;

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
    
    public Biblioteca() {
        initComponents();
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
        jButton2 = new javax.swing.JButton();
        cmb_Imagenes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

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
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_AgregarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_EliminarC)))
                .addGap(31, 31, 31))
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

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Eliminar Imagen");

        cmb_Imagenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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
                .addComponent(jButton2)
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
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(267, 267, 267)
                .addComponent(lbl_User)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_User, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        ventana = panelControl.getPanelLogin();
        panelControl.getMain().getVentanaBase().cambiarPaneles(ventana);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void cmb_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CategoriaActionPerformed
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
            if(cmb_Categoria.getItemCount() == 0){
                setDataCategory();
            }
        }catch(NullPointerException e){
            System.out.println("Se han elinado todas las categorias, categoria General creada pero vacia");
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
            cmb_Categoria.addItem("General");
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
        if(listaImagenes != null){
            for(int i = 0; i < listaImagenes.size(); i++){
                String nombreImagen = listaImagenes.get(i).getNombre();
                cmb_Imagenes.addItem(nombreImagen);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarC;
    private javax.swing.JButton btn_EliminarC;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox<String> cmb_Categoria;
    private javax.swing.JComboBox<String> cmb_Imagenes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_User;
    // End of variables declaration//GEN-END:variables
}
