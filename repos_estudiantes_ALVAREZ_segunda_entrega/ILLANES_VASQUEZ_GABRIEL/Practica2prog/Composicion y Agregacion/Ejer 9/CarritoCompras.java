package Agr9;

public class CarritoCompras {
    private int nroProd;
    private Producto productos[] = new Producto[10];

    public CarritoCompras() {
        nroProd = 0;
    }

    public void mostrar_carrito() {
        System.out.println("Cantidad de productos: " + nroProd);
        for (int i = 0; i < nroProd; i++) {
            productos[i].mostrar_info();
        }
    }

    public void agregar_producto(Producto x) {
        if (nroProd < 10) {
            productos[nroProd] = x;
            nroProd++;
        } else {
            System.out.println("Ya tiene 10 Productos en su carrito :c, ese es el límite");
            System.out.println("No se agregará");
            x.mostrar_info();
        }
    }
}
