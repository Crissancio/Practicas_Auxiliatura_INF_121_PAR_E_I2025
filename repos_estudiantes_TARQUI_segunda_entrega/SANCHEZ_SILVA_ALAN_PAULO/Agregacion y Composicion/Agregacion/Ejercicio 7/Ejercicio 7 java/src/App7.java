public class App7{
    public static void main(String[] args) throws Exception {
        Universidad universidad = new Universidad("UMSS");
        universidad.agregarEstudiante("Juan", "Ingenieria de Sistemas", 5);
        universidad.agregarEstudiante("Pedro", "Derecho", 1);
        universidad.agregarEstudiante("Maria", "Ingenieria Civil", 3);
        universidad.agregarEstudiante("Jose", "Medicina", 2);
        universidad.agregarEstudiante("Ana", "Arquitectura", 4);

        System.out.println(universidad);
    }
}
