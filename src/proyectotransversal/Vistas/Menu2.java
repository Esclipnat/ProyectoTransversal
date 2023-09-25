/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectotransversal.Vistas;

import javax.swing.JInternalFrame;

/**
 *
 * @author crist
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuFormAlum = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuFormMate = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuManejoInscrip = new javax.swing.JMenuItem();
        jMenuManipuNota = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AlumxMate = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setText("PROYECTO TRANSVERSAL");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg3.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperflare.com_wallpaper.jpg"))); // NOI18N

        Escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel3)
                .addContainerGap(555, Short.MAX_VALUE))
            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(372, 372, 372)))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel3)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)))
        );

        jMenu1.setText("Alumno");

        jMenuFormAlum.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jMenuFormAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GestionAlumno.png"))); // NOI18N
        jMenuFormAlum.setText("Formulario de Alumno");
        jMenuFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormAlumActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFormAlum);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jMenuFormMate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jMenuFormMate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GestionMateria.png"))); // NOI18N
        jMenuFormMate.setText("Formulario de Materia");
        jMenuFormMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormMateActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuFormMate);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jMenuManejoInscrip.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jMenuManejoInscrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ManejoInscripcion.png"))); // NOI18N
        jMenuManejoInscrip.setText("Manejo de Inscripciones");
        jMenuManejoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManejoInscripActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuManejoInscrip);

        jMenuManipuNota.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jMenuManipuNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ManejoNotas.png"))); // NOI18N
        jMenuManipuNota.setText("Manipulacion de Notas");
        jMenuManipuNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManipuNotaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuManipuNota);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        AlumxMate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        AlumxMate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsularNota.png"))); // NOI18N
        AlumxMate.setText("Alumnos por Materia");
        AlumxMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumxMateActionPerformed(evt);
            }
        });
        jMenu4.add(AlumxMate);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormAlumActionPerformed
        FormAlumno formAlumno = new FormAlumno();
        llamarSubMenu2(formAlumno);
    }//GEN-LAST:event_jMenuFormAlumActionPerformed

    private void jMenuFormMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormMateActionPerformed
        FormMateria formMateria = new FormMateria();
        llamarSubMenu2(formMateria);
    }//GEN-LAST:event_jMenuFormMateActionPerformed

    private void jMenuManejoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManejoInscripActionPerformed
        ManejoInscripcion manejoInscripcion = new ManejoInscripcion();
        llamarSubMenu2(manejoInscripcion);

    }//GEN-LAST:event_jMenuManejoInscripActionPerformed

    private void jMenuManipuNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManipuNotaActionPerformed
        ManipularNotas manipularNotas = new ManipularNotas();
        llamarSubMenu2(manipularNotas);
    }//GEN-LAST:event_jMenuManipuNotaActionPerformed

    private void AlumxMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumxMateActionPerformed
        FormConsultaMateria consulta = new FormConsultaMateria();
        llamarSubMenu2(consulta);
    }//GEN-LAST:event_AlumxMateActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        System.exit( 0 );
        System.out.println("Saliendo..");
    }//GEN-LAST:event_jMenu5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumxMate;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuFormAlum;
    private javax.swing.JMenuItem jMenuFormMate;
    private javax.swing.JMenuItem jMenuManejoInscrip;
    private javax.swing.JMenuItem jMenuManipuNota;
    // End of variables declaration//GEN-END:variables
    public void llamarSubMenu2(JInternalFrame aux) {
        Escritorio.removeAll();
        Escritorio.repaint();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
    }
}
