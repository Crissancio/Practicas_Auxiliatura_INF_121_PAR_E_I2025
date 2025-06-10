/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERSISTENCIA_DE_OBJETOS.EJER_5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArchFarmacia arch = new ArchFarmacia("farmacias.bin");

        // a) Crear y guardar archivo de farmacias
        Medicamento m1 = new Medicamento("Golpex", 1, "tos", 10.5);
        Medicamento m2 = new Medicamento("Paracetol", 2, "fiebre", 5.0);
        Medicamento m3 = new Medicamento("Tosol", 3, "tos", 7.5);

        Farmacia f1 = new Farmacia("Farmacia Central", 101, "Av. Siempre Viva 742");
        f1.agregarMedicamento(m1);
        f1.agregarMedicamento(m2);

        Farmacia f2 = new Farmacia("Farmacia Sur", 102, "Calle Falsa 123");
        f2.agregarMedicamento(m3);

        ArrayList<Farmacia> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);

        arch.guardarFarmacias(lista);

        // b) Mostrar medicamentos para la tos, sucursal 102
        System.out.println("Medicamentos para la tos - Sucursal 102:");
        arch.mostrarTosSucursal(102);

        // c) Mostrar sucursal y dirección donde haya “Golpex”
        System.out.println("\nFarmacias con Golpeex:");
        arch.mostrarFarmaciasConGolpex();
    }
}

