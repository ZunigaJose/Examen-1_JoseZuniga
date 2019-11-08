package examen1_josezuniga;

import java.util.Date;

public class Libro {
    private String titulo, descripcion, genero, autor;
    private Date year;
    private int puntaje, copias, valor, edicion;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, String genero, String autor, Date year, int puntaje, int copias, int valor, int edicion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.autor = autor;
        this.year = year;
        this.puntaje = puntaje;
        this.copias = copias;
        this.valor = valor;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
