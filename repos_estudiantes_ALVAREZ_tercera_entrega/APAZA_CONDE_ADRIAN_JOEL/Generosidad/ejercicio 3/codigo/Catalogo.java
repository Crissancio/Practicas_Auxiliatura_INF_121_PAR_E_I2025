/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer3.gen;

/**
 *
 * @author Adrian
 */
import java.util.ArrayList;
import java.util.List;
class Catalogo<T> {
    private List<T> elem = new ArrayList<>();
// a) Agrega métodos para agregar y buscar elemento
    public void agregar(T x) {
        elem.add(x);
    }
// a) Agrega métodos para agregar y buscar elemento
    public T buscar(String x) {
        for (T e : elem) {
            if (e instanceof Libro) {
                Libro l1 = (Libro) e;
                if (l1.getTitulo().equalsIgnoreCase(x)) {
                    return e;
                }
            } else if (e instanceof Producto) {
                Producto p1 = (Producto) e;
                if (p1.getNombre().equalsIgnoreCase(x)) {
                    return e;
                }
            }
        }
        return null;
    }

    public Libro buscarPorTitulo(String t) {
        for (T e : elem) {
            if (e instanceof Libro) {
                Libro l1 = (Libro) e;
                if (l1.getTitulo().equalsIgnoreCase(t)) {
                    return l1;
                }
            }
        }
        return null;
    }

    public Producto buscarPorNombre(String n) {
        for (T e : elem) {
            if (e instanceof Producto) {
                Producto p1 = (Producto) e;
                if (p1.getNombre().equalsIgnoreCase(n)) {
                    return p1;
                }
            }
        }
        return null;
    }
}
