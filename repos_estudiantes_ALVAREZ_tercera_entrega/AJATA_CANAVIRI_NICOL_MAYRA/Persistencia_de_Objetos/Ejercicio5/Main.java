package Persistencia_de_Objetos.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        String nombreBaseArchivos = "farmacia_ejercicio5";
        ArchFarmacia archFarmacia = new ArchFarmacia(nombreBaseArchivos);

        archFarmacia.limpiarArchivos();

        System.out.println("\n--- Adicionando Farmacias ---");
        Farmacia farmacia1 = new Farmacia("Farmacia Central", 1, "Av. Siempre Viva 742", 50);
        Farmacia farmacia2 = new Farmacia("Farmacia Norte", 2, "Calle Falsa 123", 30);
        Farmacia farmacia3 = new Farmacia("Farmacia Sur", 3, "Blvd. Los Sueños 456", 60);

        archFarmacia.adicionarFarmacia(farmacia1);
        archFarmacia.adicionarFarmacia(farmacia2);
        archFarmacia.adicionarFarmacia(farmacia3);

        System.out.println("\n--- Adicionando Medicamentos ---");
        Medicamento med1 = new Medicamento("Paracetamol", 1001, "Analgesico", 8.50);
        Medicamento med2 = new Medicamento("Jarabe Golpex", 1002, "Tos", 12.00);
        Medicamento med3 = new Medicamento("Amoxicilina", 1003, "Antibiotico", 25.75);
        Medicamento med4 = new Medicamento("Vick Vaporub", 1004, "Resfrio", 9.90);
        Medicamento med5 = new Medicamento("Broncoxin", 1005, "Tos", 15.20);
        Medicamento med6 = new Medicamento("Aspirina", 1006, "Analgesico", 5.00);
        Medicamento med7 = new Medicamento("Jarabe Toux", 1007, "Tos", 10.50);


        archFarmacia.adicionarMedicamento(med1);
        archFarmacia.adicionarMedicamento(med2);
        archFarmacia.adicionarMedicamento(med3);
        archFarmacia.adicionarMedicamento(med4);
        archFarmacia.adicionarMedicamento(med5);
        archFarmacia.adicionarMedicamento(med6);
        archFarmacia.adicionarMedicamento(med7);

        // a) 
        archFarmacia.mostrarArchivoFarmacias();

        // b) 
        archFarmacia.mostrarMedicamentosTos(1);

        archFarmacia.mostrarMedicamentosResfrios();

        // c) 
        archFarmacia.mostrarSucursalesConMedicamento("Jarabe Golpex");
        archFarmacia.mostrarSucursalesConMedicamento("Jarabe Golpex"); 
    }
}