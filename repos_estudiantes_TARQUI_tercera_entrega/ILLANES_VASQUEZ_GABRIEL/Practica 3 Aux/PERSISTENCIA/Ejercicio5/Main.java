package Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Farmacia> lista = new ArrayList<>();

        Farmacia f1 = new Farmacia();
        f1.leer();
        lista.add(f1);

        Farmacia f2 = new Farmacia();
        f2.leer();
        lista.add(f2);

        ArchFarmacia af = new ArchFarmacia("farmacias_guardadas");

        af.crearArchivo(lista);
        System.out.println("\nContenido del archivo:");
        af.leerYMostrar();

        System.out.println("\nMedicamentos para la tos en sucursal 101:");
        af.mostrarMedicamentosTosSucursal(101);

        System.out.println("\nFarmacias con medicamento 'Golpex':");
        af.mostrarSucursalesConMedicamento("Golpex");
    }
}
