package Compo;

public class Main {

    public static void main(String[] args) {
        Universidad u1 = new Universidad();
        u1.setNombre("Universidad Técnica Nacional");

        u1.agregar_estudiante(new Estudiante("Daniela", "Informática", "Segundo"));
        u1.agregar_estudiante(new Estudiante("Jose", "Contaduría", "Tercero"));
        u1.agregar_estudiante(new Estudiante("Cristian", "Agronomía", "Primero"));
        u1.agregar_estudiante(new Estudiante("Brandon", "Física", "Quinto"));
        u1.agregar_estudiante(new Estudiante("Lucero", "Turismo", "Segundo"));
        u1.agregar_estudiante(new Estudiante("Marcial", "Turismo", "Cuarto"));
        u1.agregar_estudiante(new Estudiante("Eddy", "Medicina", "Tercero"));

        System.out.println("");
        System.out.println("Agregando estudiantes a la universidad...");

        u1.mostrar_universidad();
    }
}
