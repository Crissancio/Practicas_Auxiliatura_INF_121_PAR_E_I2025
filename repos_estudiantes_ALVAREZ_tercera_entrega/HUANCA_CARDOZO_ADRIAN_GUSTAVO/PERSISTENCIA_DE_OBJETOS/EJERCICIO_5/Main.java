package PERSISTENCIA_DE_OBJETOS.EJERCICIO_5;

public class Main {
    public static void main(String[] args) {
        ArchFarmacia arch = new ArchFarmacia("farmacias.dat");

        arch.crearArchivo();

        Farmacia f1 = new Farmacia();
        f1.leer("Farmacia Central", 1, "Av. Siempre Viva 123");

        Medicamento m1 = new Medicamento();
        m1.leer("Paracetamol", 1001, "Resfrio", 15.5);

        Medicamento m2 = new Medicamento();
        m2.leer("Jarabe Tos", 1002, "Tos", 25.0);

        Medicamento m3 = new Medicamento();
        m3.leer("Golpex", 1003, "Tos", 30.0);

        f1.agregarMedicamento(m1);
        f1.agregarMedicamento(m2);
        f1.agregarMedicamento(m3);

        arch.adicionar(f1);

        arch.mostrarMedicamentosMenorTos(1);

        arch.mostrarSucursalesConMedicamento("Golpex");

        System.out.println("Precio total medicamentos para Tos: " + arch.precioMedicamentoTos());
    }
}

