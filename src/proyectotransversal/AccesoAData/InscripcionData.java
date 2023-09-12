package proyectotransversal.AccesoAData;

import proyectotransversal.Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private AlumnoData alumnoData = new AlumnoData();
    private MateriaData materiaData = new MateriaData();

    public InscripcionData() {

        con = Conexion.getConexion();
    }

    public void guardarinscripcion(Inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion (IdAlumno, IdMateria , nota) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setObject(1, inscripcion.getAlumno());
            ps.setObject(2, inscripcion.getMateria());
            ps.setInt(3, inscripcion.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt("idinscripcion"));
                JOptionPane.showMessageDialog(null, "inscripcion añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }
    }

    public Inscripcion buscarinscripcion(int id) {
        Inscripcion inscripcion = null;
        String sql = "SELECT nombre, año FROM inscripcion WHERE IdInscripto = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(id);
                inscripcion.setAlumno(alumnoData.buscarAlumno(rs.getInt("IdAlumno")));
                inscripcion.setMateria(materiaData.buscarmateria(rs.getInt("IdMateria")));
                inscripcion.setNota(rs.getInt("nota"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el inscripcion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return inscripcion;
    }

    public List<Inscripcion> listarinscripcions() {
        List<Inscripcion> ListaInscripcions = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("IdInscripcion"));
                inscripcion.setAlumno(alumnoData.buscarAlumno(rs.getInt("IdAlumno")));
                inscripcion.setMateria(materiaData.buscarmateria(rs.getInt("IdMateria")));
                inscripcion.setNota(rs.getInt("nota"));
                ListaInscripcions.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return ListaInscripcions;
    }

    public List<Inscripcion> listarinscripcionsPorALumno(int id) {
        List<Inscripcion> ListaInscripcions = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE estado = 1 AND IdAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("IdInscripcion"));
                inscripcion.setAlumno(alumnoData.buscarAlumno(rs.getInt("IdAlumno")));
                inscripcion.setMateria(materiaData.buscarmateria(rs.getInt("IdMateria")));
                inscripcion.setNota(rs.getInt("nota"));
                ListaInscripcions.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return ListaInscripcions;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> ListaMaterias = new ArrayList<Materia>();
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON(inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();                                        //por que no directamente---> Materia materia = new Materia();    
                materia.setIdMateria(rs.getInt("IdMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                ListaMaterias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListaMaterias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> listaMaterias = new ArrayList<Materia>();

        // Copiar la lista original
        listaMaterias.addAll(materiaData.listarmaterias());

        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idMateria = rs.getInt("idMateria");

                // Usar una lambda expression para eliminar la materia de la lista
                listaMaterias.removeIf(materia -> materia.getIdMateria() == idMateria);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaMaterias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el inscripcion.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, int nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE IdAlumno = ? AND IdMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El inscripcion no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
    }

    public void modificarinscripcion(Inscripcion inscripcion) {
        String sql = "UPDATE inscripcion SET IdAlumno = ?,IdMateria = ?,  nota = ? WHERE IdInscripto = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, inscripcion.getAlumno());
            ps.setObject(2, inscripcion.getMateria());
            ps.setInt(3, inscripcion.getNota());
            ps.setInt(4, inscripcion.getIdInscripcion());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El inscripcion no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
    }     

    public void eliminarinscripcion(int id) { // eliminar  de verdad
        try {
            String sql = "DELETE FROM inscripcion WHERE IdInscripto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el inscripcion.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripcion");
        }
    }                      

}
