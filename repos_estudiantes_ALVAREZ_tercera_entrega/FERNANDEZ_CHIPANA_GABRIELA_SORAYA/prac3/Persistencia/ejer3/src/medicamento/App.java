/*
 a) Crear, leer y mostrar un Archivo de Farmacias
b) Mostrar los medicamentos para la tos, de la Sucursal numero X
c) Mostrar el número de sucursal y su dirección que tienen el medicamento
“Golpex”
 */
package medicamento;
public class App {
    public static void main(String[] args) {
        ArchivoFarmacia archivo = new ArchivoFarmacia("farmacias.txt");
        archivo.crearArchivo();

        // Crear farmacia y agregar medicamentos
        Farmacia f1 = new Farmacia("Farmacia Uno", 101, "Av. Central 123");
        f1.agregarMedicamento(new Medicamento("Golpex", 1, "tos", 12.5));
        f1.agregarMedicamento(new Medicamento("Ibuprofeno", 2, "dolor", 5.0));

        Farmacia f2 = new Farmacia("Farmacia Dos", 102, "Calle Norte 456");
        f2.agregarMedicamento(new Medicamento("Paracetamol", 3, "fiebre", 6.0));

        archivo.adicionar(f1);
        archivo.adicionar(f2);

        // a) Mostrar todas las farmacias
        System.out.println(" Lista de farmacias:");
        for (Farmacia f : archivo.listar()) {
            f.mostrar();
        }

        // b) Medicamentos para la tos de sucursal 101
        System.out.println("\n Medicamentos para la tos de sucursal 101:");
        archivo.mostrarMedicamentosTosSucursal(101);

        // c) Sucursales con medicamento "Golpex"
        System.out.println("\n Sucursales con medicamento 'Golpex':");
        archivo.mostrarSucursalesConMedicamento("Golpex");
    }
}
