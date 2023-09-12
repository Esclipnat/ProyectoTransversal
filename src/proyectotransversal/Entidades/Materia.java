
package proyectotransversal.Entidades;


public class Materia {

    public static boolean eliminarMateria(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Materia buscarMateria(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param materia
     */
    public static void guardarMateria(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


 
    
    private int idMateria;
    private String nombre;
    private int añoMateria;
    private boolean activo;

    public Materia(String codigo, String nombre1, int año, java.lang.Boolean estado) {
    }
    
    public Materia(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.añoMateria = anioMateria;
        this.activo = activo;
    }
    
    public Materia(String nombre, int anioMateria, boolean activo){
        this.nombre = nombre;
        this.añoMateria = anioMateria;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoMateria() {
        return añoMateria;
    }

    public void setAñoMateria(int anioMateria) {
        this.añoMateria = añoMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
   
    @Override
    public String toString(){
        return "Materia " + idMateria + " nombre " + nombre + " año materia " + añoMateria + " activo " + activo;
    }

    public Object getaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
