package Generecidad.ejercicio3.java;


class Libro {
        String titulo;
        public Libro(String titulo) { this.titulo = titulo; }
        public String toString() { return "Libro: " + titulo; }
        public boolean equals(Object o) {
            if (o instanceof Libro) return this.titulo.equals(((Libro) o).titulo);
            return false;
        }
    }
