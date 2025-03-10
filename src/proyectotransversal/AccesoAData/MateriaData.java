package proyectotransversal.AccesoAData;

import proyectotransversal.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();
    }

    public void guardarmateria(Materia materia) {
        System.out.println(materia.getIdMateria());
            String sql = "INSERT INTO materia (nombre, año, estado, idMateria) VALUES (?, ?, ?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAñoMateria());
                ps.setBoolean(3, materia.isActivo()); // if reducido
                if (materia.getIdMateria()==0) {
                    ps.setNull(4, 0);
                }else{
                    ps.setInt(4, (int) materia.getIdMateria());
                }
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    materia.setIdMateria(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Materia añadido con exito. Con el Id ["+rs.getInt(1)+"]");
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia" + ex.getMessage());
            }
        
    }

    public Materia buscarmateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, año, estado FROM materia WHERE IdMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAñoMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
        return materia;
    }

    public List<Materia> listarmaterias() {
        List<Materia> ListaMaterias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("IdMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAñoMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                ListaMaterias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla materia " + ex.getMessage());
        }
        return ListaMaterias;
    }

    public void modificarmateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE idmateria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAñoMateria());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El materia no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
    }

    public void eliminarmateria(int id) { //"eliminar"
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idmateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla materia");
        }
    }
}
