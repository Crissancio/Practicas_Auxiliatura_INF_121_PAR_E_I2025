package com.mycompany.ejerciciogenerecidad1;

/**
 *
 * @author Vladimir Ohara
 */

class Caja<T> {

    private T contenido;
//El inciso A

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return contenido;
    }
}

public class EjercicioGenerecidad1 {

    public static void main(String[] args) {
        //Inciso B
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola Mundo");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123);
//EL inciso C
        System.out.println("Contenido de cajaTexto: " + cajaTexto.obtener());
        System.out.println("Contenido de cajaNumero: " + cajaNumero.obtener());
    }
}
