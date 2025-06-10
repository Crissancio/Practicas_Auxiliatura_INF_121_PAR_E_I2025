/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3genericidad;

/**
 *
 * @author CINTHIA
 */
public class Libro {
    private String titulo,autor;
    public Libro(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    @Override
    public String toString() {
        return "Libro: " + titulo + "   -Autor: " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;  
        if (obj == null || getClass() != obj.getClass()) 
            return false; 

        Libro otro = (Libro) obj; 
        return titulo.equals(otro.titulo) && autor.equals(otro.autor);  
    }
}
