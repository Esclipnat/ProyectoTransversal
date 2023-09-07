package proyectotransversal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectotransversal.AccesoAData.Conexion;

public class ProyectoTransversal {

    public static void main(String[] args) {
        // Aca va tu codigo master
   /*     Connection con;
        con = Conexion.getConexion();
         try {
            String sql = ("INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)");
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, 123);
            ps.setString(2, "Mokey");
            ps.setString(3, "Luffy");
            ps.setInt(4, 1990-03-05);
            ps.setBoolean(5, true);

            int registro = ps.executeUpdate(); //guardo en la base de datos

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se pudrio");
        }
    }*/

}
