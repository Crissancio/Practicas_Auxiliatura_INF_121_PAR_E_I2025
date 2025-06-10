package Generecidad.ejercicio3.java;

class Producto {
        String nombre;
        public Producto(String nombre) { this.nombre = nombre; }
        public String toString() { return "Producto: " + nombre; }
        public boolean equals(Object o) {
            if (o instanceof Producto) return this.nombre.equals(((Producto) o).nombre);
            return false;
        }
    }
