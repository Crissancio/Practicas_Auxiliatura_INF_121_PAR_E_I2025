public class Main {
    public static void main(String[] args) {
        ArchivoFarmacia archivo = new ArchivoFarmacia("farmacias.dat");
        // Crear farmacias y medicamentos
        Farmacia farmacia1 = new Farmacia("Farmacia Central", 1, "Av. Principal 123");
        Farmacia farmacia2 = new Farmacia("Farmacia Norte", 2, "Calle Secundaria 456");

        Medicamento med1 = new Medicamento("Golpex", 101, "Tos", 15.50);
        Medicamento med2 = new Medicamento("Paracetamol", 102, "Fiebre", 12.00);
        // Agregar medicamentos a las farmacias
        farmacia1.agregarMedicamento(med1);
        farmacia2.agregarMedicamento(med2);
        // Guardar farmacias en archivo
        archivo.guardarFarmacia(farmacia1);
        archivo.guardarFarmacia(farmacia2);
        // Mostrar medicamentos 
        archivo.mostrarMedicamentosTos(1);
        // Buscar farmacia que tiene "Golpex"
        archivo.buscarFarmaciaMedicamento("Golpex");
    }
}
