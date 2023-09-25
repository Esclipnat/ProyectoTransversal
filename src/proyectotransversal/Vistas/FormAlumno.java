/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectotransversal.Vistas;

import java.sql.Connection;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import proyectotransversal.AccesoAData.AlumnoData;
import proyectotransversal.Entidades.Alumno;

/**
 *
 * @author crist
 */
public class FormAlumno extends javax.swing.JInternalFrame {

    private AlumnoData adata = new AlumnoData();

    /**
     * Creates new form FormAlumno
     */
    public FormAlumno() {
        initComponents();
        nuevo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDocumento = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jRadioButtonActivo = new javax.swing.JRadioButton();
        jRadioButtonInactivo = new javax.swing.JRadioButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Busqueda por documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));
        getContentPane().add(jTextDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 330, 30));
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 360, -1));
        getContentPane().add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 360, -1));

        buttonGroup1.add(jRadioButtonActivo);
        jRadioButtonActivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButtonActivo.setText("Activo");
        getContentPane().add(jRadioButtonActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        buttonGroup1.add(jRadioButtonInactivo);
        jRadioButtonInactivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButtonInactivo.setText("Inactivo");
        getContentPane().add(jRadioButtonInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/person_search_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 30, 30));

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        jButtonSalir.setText("Atras");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 210, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            Alumno alumno = new Alumno();

            alumno.setDni(Integer.parseInt(jTextDocumento.getText()));
            alumno.setApellido(jTextApellido.getText());
            alumno.setNombre(jTextNombre.getText());

            if (jRadioButtonActivo.isSelected()) {
                alumno.setActivo(true);
            }
            if (jRadioButtonInactivo.isSelected()) {
                alumno.setActivo(false);
            }
            alumno.setFechaNacimiento(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            if (adata.buscarAlumnoPorDni(Integer.parseInt(jTextDocumento.getText())) == null) {
                adata.guardarAlumno(alumno);
                vaciar();
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un alumno con este DNI");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "En el campo dni solo deben ingresarse numeros");

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No debe haber campos vacios");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            int dni = Integer.parseInt(jTextDocumento.getText());

            Alumno alumno = adata.buscarAlumnoPorDni(dni);
            if (alumno != null) {
                String nom = alumno.getNombre();
                String ape = alumno.getApellido();

                jTextApellido.setText(ape + "");
                jTextNombre.setText(nom + "");
                if (alumno.isActivo()) {
                    jRadioButtonActivo.setSelected(true);
                } else {
                    jRadioButtonInactivo.setSelected(true);
                }
                jDateChooser1.setDate(java.sql.Date.valueOf(alumno.getFechaNacimiento()));
                buscar();
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros de un alumno con este DNI");
                nuevo();
                vaciar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: campos vacios ");
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
        vaciar();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            int dni = Integer.parseInt(jTextDocumento.getText());
            Alumno alumno = adata.buscarAlumnoPorDni(dni);
            adata.eliminarAlumno(alumno.getIdAlumno());
            nuevo();
            vaciar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: campos vacios ");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonActivo;
    private javax.swing.JRadioButton jRadioButtonInactivo;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDocumento;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

    public void vaciar() {
        jTextDocumento.setText("");
        jTextApellido.setText("");
        jTextNombre.setText("");
        jRadioButtonActivo.setSelected(true);
        //jRadioButtonInactivo.setSelected(false);
        jDateChooser1.setDate(null);
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
