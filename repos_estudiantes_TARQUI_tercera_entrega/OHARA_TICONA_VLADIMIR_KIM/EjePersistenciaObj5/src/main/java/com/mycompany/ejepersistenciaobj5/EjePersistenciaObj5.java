/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejepersistenciaobj5;
/**
 *
 * @author Vladmir Ohara
 */
public class EjePersistenciaObj5 {

    public static void main(String[] args) {
        ArchFarmacia archivo = new ArchFarmacia("farmacias.txt");

        Farmacia f1 = new Farmacia("Farmacia A", 101, "Av. Central");
        f1.agregarMedicamento(new Medicamento("Golpex", 1, "tos", 20.5));
        f1.agregarMedicamento(new Medicamento("Paracetamol", 2, "fiebre", 10.0));

        Farmacia f2 = new Farmacia("Farmacia B", 202, "Calle 10");
        f2.agregarMedicamento(new Medicamento("Antitusivo", 3, "tos", 15.0));

        archivo.adicionar(f1);
        archivo.adicionar(f2);

        archivo.listar();
        System.out.println("\nMedicamentos para la tos en sucursal 101:");
        archivo.mostrarMedicamentosTos(101);

        System.out.println("\nFarmacias con Golpex:");
        archivo.mostrarSucursalesConGolpex();
    }
}
