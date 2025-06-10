package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        ArchFarmacia archivo = new ArchFarmacia("datos.txt");
        archivo.crearArchivo();

        Farmacia f1 = new Farmacia();
        f1.leer("Farmacia Central", 101, "Calle 1");
        Medicamento m1 = new Medicamento();
        m1.leer("Golpex", 111, "tos", 12.5);
        Medicamento m2 = new Medicamento();
        m2.leer("Panadol", 222, "resfrio", 7.0);
        f1.adicionarMedicamento(m1);
        f1.adicionarMedicamento(m2);

        archivo.adicionar(f1);

        archivo.listar();

        System.out.println("\nMedicamentos para la tos en sucursal 101:");
        archivo.mostrarMedicamentosTosSucursal(101);

        System.out.println("\nSucursal y dirección con 'Golpex':");
        archivo.mostrarSucursalYDireccionConGolpex();
    }
}