
package ejercicio7;

public class Ejercicio7 {


    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana Lopez", "Ingenieria de Sistemas", 3);
        Estudiante e2 = new Estudiante("Juan Perez", "Derecho", 5);
        Estudiante e3 = new Estudiante("Maria Gomez", "Medicina", 2);

        Univercidad uni = new Univercidad("Universidad Nacional");
        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);

        uni.mostrarUnivercidad();
    }
    
}
