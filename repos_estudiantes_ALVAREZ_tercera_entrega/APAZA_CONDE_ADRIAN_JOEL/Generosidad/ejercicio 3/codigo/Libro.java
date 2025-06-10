/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer3.gen;

/**
 *
 * @author Adrian
 */
class Libro {
    private String titulo;
    private String autor;

    public Libro(String t, String a) {
        this.titulo = t;
        this.autor = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}
