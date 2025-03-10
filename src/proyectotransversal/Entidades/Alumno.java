package proyectotransversal.Entidades;

import java.time.LocalDate;
import java.util.Date;

public class Alumno {

    private int idAlumno;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int idAlumno, int dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    public Alumno(int dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idAlumno + " - " + nombre + " " + apellido +" [" + fechaNacimiento + "]";
    }
}
