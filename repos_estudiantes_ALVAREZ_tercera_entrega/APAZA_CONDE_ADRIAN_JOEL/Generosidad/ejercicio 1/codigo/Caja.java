/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer1.gen;

/**
 *
 * @author Adrian
 */
class Caja<T> {
    private T x;
 // a ) creamos los metodos guardar() y obtener()
    public void guardar(T n) {
        this.x = n;
    }
    public T obtener() {
        return x;
    }
}
