package examen1_josezuniga;

import java.util.ArrayList;
import java.util.Date;

public class Persona {
    private String nombreusuario, contraseña, correo, generoF;
    private Date nacimiento;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombreusuario, String contraseña, String correo, String generoF, Date nacimiento) {
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.generoF = generoF;
        this.nacimiento = nacimiento;
    }

    public Persona(String nombreusuario, String contraseña) {
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGeneroF() {
        return generoF;
    }

    public void setGeneroF(String generoF) {
        this.generoF = generoF;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public Libro getLibro(int pos) {
        return libros.get(pos);
    }

    public void setLibro(Libro libro) {
        this.libros.add(libro);
    }
    
    
}
