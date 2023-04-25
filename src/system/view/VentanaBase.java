
package system.view;

import java.awt.BorderLayout;
import system.controller.PanelController;

/**
 * @author matth
 */
public class VentanaBase extends javax.swing.JFrame {
    javax.swing.JPanel ventana;
    PanelController panelControl = new PanelController();
    
    public VentanaBase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Editor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ PRINCIPAL");

        btn_Editor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Editor.setText("Ingresar a Editor");
        btn_Editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditorActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Ingresar a Convertidor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(368, 368, 368))
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btn_Editor)
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Editor)
                    .addComponent(jButton2))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditorActionPerformed
        ventana = panelControl.getLogin();
        panelControl.getMain().getVentanaBase().cambiarPaneles(ventana);
    }//GEN-LAST:event_btn_EditorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cambiarPaneles(javax.swing.JPanel miPanel){
        miPanel.setSize(911, 628); //Ancho y alto de los paneles colocados en la ventana
        miPanel.setLocation(0, 0); //Colocado en la posicion superior izquierda de la ventana        
        panelBase.removeAll();
        panelBase.add(miPanel, BorderLayout.CENTER);
        panelBase.revalidate();
        panelBase.revalidate();
        panelBase.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBase;
    // End of variables declaration//GEN-END:variables
}
