package Generecidad.Ejer5.Codigo;


public class Pila<T> {
    private int max = 5;
    private int tope;
    private Object v[] = new Object[max + 1];

    public Pila() {
        this.tope = 0;
    }

    public void apilar(T elem) {
        if (tope == max) {
            System.out.println("Pila llena");
        } else {
            tope ++;
            v[tope] = elem;
        }
    }

    public T desapilar() {
        T elem = null;
        if (tope == 0) {
            System.out.println("Pila vacia");
        }else {
            elem = (T) v[tope];
            tope--;
        }
        return elem;
    }

    public boolean estaVacia() {
        return tope == 0;
    }

    public boolean estaLlena() {
        return tope == max;
    }
    public void mostrar() {
        System.out.println("Elementos de la pila:");
        for (int i = 1; i <= tope; i++) {
            System.out.println(v[i] + " ");
        }
        System.out.println();
    }
}
