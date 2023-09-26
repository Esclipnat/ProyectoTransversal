/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectotransversal.Vistas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectotransversal.AccesoAData.AlumnoData;
import proyectotransversal.AccesoAData.InscripcionData;
import proyectotransversal.Entidades.Alumno;
import proyectotransversal.Entidades.Materia;

/**
 *
 * @author crist
 */
public class ManipularNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    AlumnoData alumnoData = new AlumnoData();
    InscripcionData inscripcionData = new InscripcionData();

    /**
     * Creates new form ManipularNotas
     */
    public ManipularNotas() {
        initComponents();
        crearTabla();
        cargarcombobox();
        actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de notas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 180, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, 20));

        jcbAlumnos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbAlumnos.setBorder(null);
        jcbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnosItemStateChanged(evt);
            }
        });
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(jcbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 260, 30));

        jTableMaterias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMaterias.getTableHeader().setReorderingAllowed(false);
        jTableMaterias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableMateriasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMaterias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 400, 250));

        jButtonGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sync_alt_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jButtonGuardar.setText("Cambiar Nota");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 140, 30));

        jButtonAtras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.setBorder(null);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, 70, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        añadirNota();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jcbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnosItemStateChanged
        actualizar();
    }//GEN-LAST:event_jcbAlumnosItemStateChanged

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTableMateriasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableMateriasKeyPressed
        // TODO add your handling code here:
        /*jTableMaterias.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    añadirNota();
                }
            }
        });*/
    }//GEN-LAST:event_jTableMateriasKeyPressed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    // End of variables declaration//GEN-END:variables

    private void cargarcombobox() {
        for (Alumno alumno : alumnoData.listarAlumnos()) {
            jcbAlumnos.addItem(alumno);
        }
    }

    private void crearTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Año de cursada");
        modelo.addColumn("Nombre de la Materia");
        modelo.addColumn("Nota");
        jTableMaterias.setModel(modelo);
        jTableMaterias.setEnabled(true);
        jTableMaterias.setRowSelectionAllowed(true);

    }

    private void cargarTabla() {
        Alumno aux = (Alumno) jcbAlumnos.getSelectedItem();
        int id = aux.getIdAlumno();

        if (inscripcionData.obtenerMateriasCursadas(id) != null) {
            for (Materia materia : inscripcionData.obtenerMateriasCursadas(id)) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getAñoMateria(), materia.getNombre(), inscripcionData.buscarnota(id, materia.getIdMateria())});
            }
        } else {
            System.out.println("No hay datos en el array");
        }
    }

    private void borrarfila() {
        int f = jTableMaterias.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizar() {
        borrarfila();
        cargarTabla();
    }

    private void añadirNota() {
        int filas = jTableMaterias.getSelectedRow();
        if (filas != -1) {
            int idMateria = (int) jTableMaterias.getValueAt(filas, 0);
            Alumno aux = (Alumno) jcbAlumnos.getSelectedItem();
            int idAlumno = aux.getIdAlumno();
            try {
                int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota"));
                if (nota < 0 || nota > 100) {
                    JOptionPane.showMessageDialog(this, "La nota tiene que ser entre 0 y 100");
                } else {
                    inscripcionData.actualizarNota(idAlumno, idMateria, nota);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "La nota es numerica");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }
        actualizar();
    }
}
