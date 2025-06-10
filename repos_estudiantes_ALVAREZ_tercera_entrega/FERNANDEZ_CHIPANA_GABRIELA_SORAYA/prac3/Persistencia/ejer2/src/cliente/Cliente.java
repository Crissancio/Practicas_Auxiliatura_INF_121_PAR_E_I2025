/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;
public class Cliente {
    int id;
    String nombre;
    int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Representación para guardar en el archivo
    public String toArchivo() {
        return id + "," + nombre + "," + telefono;
    }

    // Crear un Cliente desde una línea del archivo
    public static Cliente fromArchivo(String linea) {
        String[] partes = linea.split(",");
        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        int telefono = Integer.parseInt(partes[2]);
        return new Cliente(id, nombre, telefono);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}

