public class Main {
    public static void main(String[] args) {
        // a) Crear, leer y mostrar archivo de farmacias
        ArchFarmacia archivo = new ArchFarmacia("farmacias.dat");

        // Crear algunas farmacias de prueba
        Farmacia f1 = new Farmacia("Farmacia Central", 1, "Av. Principal 123", 3);
        f1.agregarMedicamento(new Medicamento("Golpex", 101, "tos", 15.50));
        f1.agregarMedicamento(new Medicamento("Jarabe", 102, "tos", 12.00));
        f1.agregarMedicamento(new Medicamento("Antigripal", 103, "resfriado", 18.75));

        Farmacia f2 = new Farmacia("Farmacia Norte", 2, "Calle Secundaria 456", 2);
        f2.agregarMedicamento(new Medicamento("Golpex", 101, "tos", 16.00));
        f2.agregarMedicamento(new Medicamento("Antihistamínico", 104, "alergia", 22.50));

        archivo.adicionar(f1);
        archivo.adicionar(f2);

        System.out.println("Listado de farmacias:");
        archivo.listar();

        // b) Mostrar medicamentos para la tos de sucursal 1
        System.out.println("\nMedicamentos para tos en sucursal 1:");
        archivo.mostrarMedicamentosTos(1);

        // c) Mostrar sucursales con Golpex
        System.out.println("\nSucursales con medicamento Golpex:");
        archivo.mostrarSucursalesConGolpex();
    }
}
