public class Main {
    public static void main(String[] args) {
        // b) Crea una universidad y agrega varios estudiantes.
        Universidad uni = new Universidad("Universidad Mayor de San Andres");
        uni.agregar_estudainte(new Estudiante("Crisver", "Informatica", 3));
        uni.agregar_estudainte(new Estudiante("Crismar", "Economia", 1));
        uni.agregar_estudainte(new Estudiante("Samuel", "Gastronomia", 1));
        uni.agregar_estudainte(new Estudiante("Erick", "Administracion de empresas", 3));
        uni.agregar_estudainte(new Estudiante("David", "Medicina", 4));
        uni.agregar_estudainte(new Estudiante("Hugo", "Agropecuaria", 5));
        uni.agregar_estudainte(new Estudiante("Estiben", "Diseño grafico", 2));
        uni.agregar_estudainte(new Estudiante("Fabian", "Bioquimica", 1));
        System.out.println("c) Muestra la información de la universidad y sus estudiantes.");
        uni.mostrar_universidad();
    }
}
