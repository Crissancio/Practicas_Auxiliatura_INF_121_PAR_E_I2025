package Ejercicio9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        for (int i = 1; i <= 12; i++) {
            Producto p = new Producto("Producto" + i, i * 10);
            carrito.agregar_producto(p);
        }

        carrito.mostrar_carrito();
    }
}
