
package Ejercicio5;
/*
a) Crear, leer y mostrar un Archivo de Farmacias
b) Mostrar los medicamentos para la tos, de la Sucursal numero X
c) Mostrar el número de sucursal y su dirección que tienen el medicamento
“Golpex”
*/
public class Main {
    public static void main(String[] args) {
        // Crear medicamentos
        Medicamento med1 = new Medicamento();
        med1.leer("Golpex", 101, "Tos", 50.0);

        Medicamento med2 = new Medicamento();
        med2.leer("Resfalex", 102, "Resfriado", 30.0);

        Medicamento med3 = new Medicamento();
        med3.leer("Aspirina", 103, "Dolor", 20.0);

        // Crear farmacias
        Farmacia farmacia1 = new Farmacia();
        farmacia1.leer("Farmacia Salud", 1, "Chasquipampa");

        Farmacia farmacia2 = new Farmacia();
        farmacia2.leer("Farmacia Bienestar", 2, "Rosales");

        // Agregar medicamentos a las farmacias
        farmacia1.agregarMedicamento(med1);
        farmacia1.agregarMedicamento(med2);
        farmacia2.agregarMedicamento(med3);

        // Crear archivo de farmacias
        ArchFarmacia arch = new ArchFarmacia("Farmacias.txt");
        arch.adicionar(farmacia1);
        arch.adicionar(farmacia2);

        // Listar farmacias
        arch.listar();

        // Mostrar medicamentos para la tos
        System.out.println("\nMedicamentos para la tos:");
        arch.mostrarMedicamentosResfriados();

        // Mostrar el precio total de medicamentos para la tos
        System.out.println("\nPrecio total medicamentos para la tos: " + arch.precioMedicamentoTos());

        // Mostrar medicamento más barato para la tos
        System.out.println("\nMedicamento más barato para la tos:");
        arch.mostrarMedicamentoMenorTos();
    }
}
