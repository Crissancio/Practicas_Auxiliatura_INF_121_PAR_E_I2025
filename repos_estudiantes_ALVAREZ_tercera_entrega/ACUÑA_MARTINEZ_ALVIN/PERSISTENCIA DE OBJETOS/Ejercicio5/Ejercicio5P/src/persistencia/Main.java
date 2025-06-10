package persistencia;

public class Main {
    public static void main(String[] args) {
        // Crear medicamentos
        Medicamento m1 = new Medicamento("Golpex", 1, "Tos", 10.5);
        Medicamento m2 = new Medicamento("Paracetamol", 2, "Fiebre", 5.0);
        Medicamento m3 = new Medicamento("Broncolin", 3, "Tos", 8.0);

        // Crear farmacias
        Farmacia f1 = new Farmacia("Farmacia Central", 101, "Calle 1");
        f1.agregarMedicamento(m1);
        f1.agregarMedicamento(m2);

        Farmacia f2 = new Farmacia("Farmacia Sur", 102, "Avenida 9");
        f2.agregarMedicamento(m3);

        // Crear archivo de farmacias
        ArchFarmacia arch = new ArchFarmacia();
        arch.adicionar(f1);
        arch.adicionar(f2);

        arch.crearArchivo(); // a)
        arch.mostrarMedicamentosTos(101); // b)
        arch.buscarMedicamento("Golpex"); // c)
    }
}
