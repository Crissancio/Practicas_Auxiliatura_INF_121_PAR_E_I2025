/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer5.gen;

/**
 *
 * @author Adrian
 */
class Pila<T> {
    private Object[] d;  
    private int tope;
    private int n;

    public Pila(int n) {
        this.n = n;
        this.d = new Object[n];
        this.tope = -1;
    }
// a) Implementa un método para apilar
    public void apilar(T x) {
        if (tope == n - 1) {
            System.out.println("Pila llena. No se puede apilar " + x);
            return;
        }
        d[++tope] = x;
    }

    @SuppressWarnings("unchecked")
    // b) Implementa un método para des apilar
    public T desapilar() {
        if (esVacia()) {
            System.out.println("pila vacía");
            return null;
        }
        return (T) d[tope--];  
    }

    public boolean esVacia() {
        return tope == -1;
    }

    public boolean esLlena() {
        return tope == n - 1;
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("pila vacía");
            return;
        }
        
        System.out.println("contenido de la pila primer dato:");
        for (int i = tope; i >= 0; i--) {
            System.out.println(" " + d[i] + " ");
            System.out.println("-----");
        }
        System.out.println("capacidad de la pila: " + n + ", elementos de la pila: " + (tope + 1));
    }
}