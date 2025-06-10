package Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArchFarmacia arch = new ArchFarmacia("farmacias.dat");

        arch.crearArchivo();

        // Crear medicamentos para farmacia 1
        Medicamento m1 = new Medicamento("Golpex", 1001, "tos", 15.50);
        Medicamento m2 = new Medicamento("Paracetamol", 1002, "fiebre", 5.00);
        Medicamento[] meds1 = { m1, m2 };
        Farmacia f1 = new Farmacia("Cruz Roja", 1, "Av. Libertad", meds1.length);
        f1.setMedicamentos(meds1);

        // Crear medicamentos para farmacia 2
        Medicamento m3 = new Medicamento("Bronquix", 2001, "tos", 12.00);
        Medicamento[] meds2 = { m3 };
        Farmacia f2 = new Farmacia("San Miguel", 2, "Calle 10", meds2.length);
        f2.setMedicamentos(meds2);

        // Guardar en archivo
        arch.adicionarFarmaciaDirectamente(f1);
        arch.adicionarFarmaciaDirectamente(f2);

        // Listar
        System.out.println("\n--- Todas las farmacias ---");
        arch.listar();

        // Medicamentos para la tos en sucursal 1
        System.out.println("\n--- Medicamentos para la tos en sucursal 1 ---");
        arch.mostrarMedicamentosResfrios(1);

        // Buscar medicamento Golpex
        System.out.println("\n--- Farmacia que contiene Golpex ---");
        arch.mostrarMedicamentosMenosTos("Golpex");

        // Precio minimo de medicamentos para la tos
        System.out.println("\n--- Precio mínimo de medicamentos para la tos ---");
        double precioMin = arch.precioMedicamentoTos();
        System.out.println("Precio mínimo: " + precioMin);
    }
}
