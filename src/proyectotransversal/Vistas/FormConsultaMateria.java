/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectotransversal.Vistas;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import proyectotransversal.AccesoAData.AlumnoData;
import proyectotransversal.AccesoAData.InscripcionData;
import proyectotransversal.AccesoAData.MateriaData;
import proyectotransversal.Entidades.Alumno;
import proyectotransversal.Entidades.Inscripcion;
import proyectotransversal.Entidades.Materia;

public class FormConsultaMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    MateriaData materiaData = new MateriaData();
    AlumnoData alumnoData = new AlumnoData();
    InscripcionData inscripcionData = new InscripcionData();

    public FormConsultaMateria() {
        initComponents();
        crearTabla();
        cargarcombobox();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlum = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de alumnos por materia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 370, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione una materia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 150, -1));

        jcbMateria.setToolTipText("");
        jcbMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMateriaItemStateChanged(evt);
            }
        });
        jcbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 300, -1));

        jTableAlum.setBackground(new java.awt.Color(208, 204, 204));
        jTableAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlum.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableAlum);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 390, 340));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1849, 286, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMateriaActionPerformed

    private void jcbMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMateriaItemStateChanged
        // TODO add your handling code here:      
        actualizar();
    }//GEN-LAST:event_jcbMateriaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlum;
    private javax.swing.JComboBox<Materia> jcbMateria;
    // End of variables declaration//GEN-END:variables
private void crearTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");

        jTableAlum.setModel(modelo);
                                   

        jTableAlum.setEnabled(true);

        jTableAlum.setRowSelectionAllowed(true);

    }

    private void cargarTabla() {
        Materia aux = (Materia) jcbMateria.getSelectedItem();
        int idMateria = aux.getIdMateria();
        
        if (alumnoData.listarAlumnos() != null) {
            for (Alumno alumno : alumnoData.listarAlumnos()) {
                if (inscripcionData.listarinscripcionsPorALumno(alumno.getIdAlumno())!=null) {
                    for (Inscripcion inscripcion : inscripcionData.listarinscripcionsPorALumno(alumno.getIdAlumno())) {
                        if (inscripcion.getMateria().getIdMateria()==idMateria) {
                           modelo.addRow(new Object[]{alumno.getIdAlumno(),alumno.getDni(),alumno.getApellido(),alumno.getNombre()}); 
                        }
                    }
                }
                
            }
        } else {
            System.out.println("No hay datos en el array");
        }

    }

    private void cargarcombobox() {
        for (Materia materia : materiaData.listarmaterias()) {
            jcbMateria.addItem(materia);
        }
    }

    private void borrarfila() {
        int f = jTableAlum.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizar() {
        borrarfila();
        cargarTabla();
    }
    
}
