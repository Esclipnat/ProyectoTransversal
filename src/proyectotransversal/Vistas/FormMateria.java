/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectotransversal.Vistas;

import javax.swing.JOptionPane;
import proyectotransversal.AccesoAData.MateriaData;
import proyectotransversal.Entidades.Materia;

/**
 *
 * @author crist
 */
public class FormMateria extends javax.swing.JInternalFrame {

    MateriaData materiaData = new MateriaData();

    /**
     * Creates new form FormMateria
     */
    public FormMateria() {
        initComponents();
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAño = new javax.swing.JTextPane();
        jButtonSalir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Busqueda de materia por codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 240, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 330, 30));
        txtCodigo.getAccessibleContext().setAccessibleName("");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manage_search_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 30, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 360, -1));
        txtNombre.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 162, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 70, 22));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Año");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jScrollPane1.setViewportView(txtAño);
        txtAño.getAccessibleContext().setAccessibleName("txtAño");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 360, -1));

        jButtonSalir.setText("Atras");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, -1, -1));

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 20, 30));
        jRadioButton1.getAccessibleContext().setAccessibleName("txtEstado");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            Materia materia;
            String nombre = txtNombre.getText();
            int año = Integer.parseInt(txtAño.getText());
            Boolean estado = jRadioButton1.isSelected();
            if (txtCodigo.getText().isEmpty()) {
                materia = new Materia(nombre, año, estado);
            } else {
                int codigo = Integer.parseInt(txtCodigo.getText());
                materia = new Materia(codigo, nombre, año, estado);
            }
            // Llama al método guardarMateria de tu clase MateriaData
            materiaData.guardarmateria(materia);
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: campos vacios o mal ingresados" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        // Código para limpiar los campos y crear una nueva materia
        limpiar();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // Código para eliminar una materia
        int codigo = Integer.parseInt(txtCodigo.getText());
        // Llama al método eliminarMateria de tu clase MateriaData
        materiaData.eliminarmateria(codigo);
        limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        // Código para buscar una materia
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Materia materia = materiaData.buscarmateria(codigo);
            // Actualiza los campos de texto con los datos de la materia encontrada
            if (materia != null) {
                txtNombre.setText(materia.getNombre());
                txtAño.setText(String.valueOf(materia.getAñoMateria()));
                jRadioButton1.setSelected(materia.isActivo());
                buscar();
            } else {
                limpiar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: campos vacios " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtAño;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
   private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtAño.setText("");
        jRadioButton1.setSelected(true);
        nuevo();
    }

    private void nuevo() {
        jButtonEliminar.setEnabled(false);
        jButtonGuardar.setEnabled(true);
    }

    private void buscar() {
        jButtonEliminar.setEnabled(true);
        jButtonGuardar.setEnabled(false);
    }
}
