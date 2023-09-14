/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectotransversal.Vistas;

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

        jLabel1.setText("Listado de alumnos por  materia");

        jLabel2.setText("Seleccione una materia");

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

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
