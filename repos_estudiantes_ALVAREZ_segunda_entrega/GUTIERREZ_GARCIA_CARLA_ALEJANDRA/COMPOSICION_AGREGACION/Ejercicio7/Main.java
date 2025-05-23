package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Luis", "Informatica", 5);
        Estudiante e2 = new Estudiante("Maria", "Sistemas", 3);
        Estudiante e3 = new Estudiante("Pedro", "Redes", 7);

        Universidad umsa = new Universidad("UMSA");

        umsa.agregar_estudiante(e1);
        umsa.agregar_estudiante(e2);
        umsa.agregar_estudiante(e3);

        umsa.mostrar_universidad();
    }
}
