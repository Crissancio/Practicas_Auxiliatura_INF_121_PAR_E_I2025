/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericidad1;

/**
 *
 * @author USUARIO
 */
// Clase Caja
public class Genericidad1 {
    private Object contenido;

    // Constructor: inicializa la caja vacía
    public Genericidad1() {
        this.contenido = null;
    }

    // Método para guardar un objeto en la caja
    public void guardar(Object objeto) {
        this.contenido = objeto;
    }

    // Método para obtener el objeto guardado en la caja
    public Object obtener() {
        return this.contenido;
    }

    public static void main(String[] args) {
        // Crear dos instancias y almacenar datos de diferente tipo
        Genericidad1 cajaDeEntero = new Genericidad1();
        cajaDeEntero.guardar(42);

        Genericidad1 cajaDeTexto = new Genericidad1();
        cajaDeTexto.guardar("Hola Java");

        // Mostrar el contenido de las cajas
        System.out.println("📦 Contenido de la primera caja: " + cajaDeEntero.obtener());
        System.out.println("📦 Contenido de la segunda caja: " + cajaDeTexto.obtener());

        // Mostrar el tipo de dato almacenado
        System.out.println("Tipo de dato en la primera caja: " + cajaDeEntero.obtener().getClass().getSimpleName());
        System.out.println("Tipo de dato en la segunda caja: " + cajaDeTexto.obtener().getClass().getSimpleName());
    }
}

