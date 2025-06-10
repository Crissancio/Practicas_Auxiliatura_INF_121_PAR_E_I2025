/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer3.per;

/**
 *
 * @author Adrian
 */
// a) Implementar el diagrama de clases.
public class Cliente {
    public int id;
    public String nombre;
    public int telefono;

    public Cliente(int id, String n, int t) {
        this.id = id;
        this.nombre = n;
        this.telefono = t;
    }

    public String toString() {
        return id + "," + nombre + "," + telefono;
    }

    public static Cliente desdeCadena(String x) {
        String[] b = x.split(",");
        int id = Integer.parseInt(b[0]);
        String nombre = b[1];
        int telefono = Integer.parseInt(b[2]);
        return new Cliente(id, nombre, telefono);
    }
}
