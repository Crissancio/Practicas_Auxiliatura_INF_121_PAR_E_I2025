
package mainpersistenciafarmacia;

public class MainPersistenciaFarmacia {
    public static void main(String[] args) {
        // Crear medicamentos
        Medicamento m1 = new Medicamento("Broncolin", 101, "Tos", 25.0);
        Medicamento m2 = new Medicamento("Dolofin", 102, "Dolor", 15.0);
        Medicamento m3 = new Medicamento("Golpex", 103, "Tos", 30.0);
        Medicamento m4 = new Medicamento("Paracetamol", 104, "Fiebre", 10.0);

        // Crear farmacias
        Farmacia f1 = new Farmacia("Farmacia Central", 1, "Av. Prado 123");
        Farmacia f2 = new Farmacia("Farmacia Sur", 2, "Calle Bolivar 456");

        // Agregar medicamentos
        f1.agregarMedicamento(m1);
        f1.agregarMedicamento(m2);
        f2.agregarMedicamento(m3);
        f2.agregarMedicamento(m4);

        // Crear archivo de farmacias
        ArchFarmacia arch = new ArchFarmacia("FarmaciasLPZ");
        arch.adicionar(f1);
        arch.adicionar(f2);

        // a) Mostrar archivo de farmacias
        arch.listar();

        // b) Mostrar medicamentos para la tos de la sucursal numero 2
        arch.mostrarMedicamentosTos(2);

        // c) Mostrar número de sucursal y dirección que tienen "Golpex"
        arch.mostrarFarmaciasConMedicamento("Golpex");
    }
}

