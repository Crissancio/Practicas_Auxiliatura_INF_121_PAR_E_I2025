/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;
import java.util.Stack;
class Pila<T> {
    private Stack<T> pila = new Stack<>();

    public void apilar(T elemento) {
        pila.push(elemento);
    }

    public T desapilar() {
        return pila.isEmpty() ? null : pila.pop();
    }

    public void mostrar() {
        for (T elem : pila) {
            System.out.println(elem);
        }
    }
}
