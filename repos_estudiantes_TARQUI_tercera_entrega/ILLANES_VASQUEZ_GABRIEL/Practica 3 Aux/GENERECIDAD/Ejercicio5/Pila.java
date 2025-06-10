package Generesidad3;

public class Pila<T> {
    private Object[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.top = 0;
        this.n = n;
        arreglo = new Object[n + 1];
    }

 
    public void apilar(T e) {
        if (this.top == n) {
            System.out.println("Pila llena");
        } else {
            this.top++;
            arreglo[this.top] = e;
        }
    }
    public T desapilar() {
        if (this.top == 0) {
            System.out.println("Pila vacía");
            return null;
        } else {
            T dato = (T) arreglo[this.top];
            this.top--;
            return dato;
        }
    }

    public T verTope() {
        if (this.top == 0) {
            System.out.println("Pila vacía");
            return null;
        }
        return (T) arreglo[this.top];
    }

    public boolean estaVacia() {
        return this.top == 0;
    }

    public boolean estaLlena() {
        return this.top == n;
    }
    public void mostrarTodo() {
    if (this.top == 0) {
        System.out.println("Pila vacía");
    } else {
        System.out.println("Contenido de la pila:");
        for (int i = top; i >= 1; i--) {
            System.out.println("- " + (T) arreglo[i]);
        }
    }
}

}
