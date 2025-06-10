/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenericidad2;

/**
 *
 * @author Administrador
 */
public class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  titulo + " " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro otro = (Libro) obj;
            return this.titulo.equals(otro.titulo) && this.autor.equals(otro.autor);
        }
        return false;
    }
}

