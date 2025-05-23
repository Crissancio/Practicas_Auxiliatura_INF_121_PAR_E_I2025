public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Persona> personas = new java.util.ArrayList<>();
        personas.add(new Estudiante("1234", "Armando", "Pando", "7211234", "2004-02-15", "20001", "2021-02-01", 5));
        personas.add(new Estudiante("2312", "Selena", "Pasas", "7715678", "2001-01-22", "20002", "2019-06-12", 3));
        personas.add(new Estudiante("4567", "Angel", "Pasas", "7938412", "1999-12-10", "20003", "2020-08-23", 7));
        personas.add(new Docente("4561", "Carla", "Garcia", "7948236", "1989-01-20", "20004", "Ingeniero", "Sistemas", "M"));
        personas.add(new Docente("2387", "Leandro", "Garcia", "79032389", "1985-01-11", "20005", "Ingeniero", "Civil", "F"));
        personas.add(new Docente("6790", "Leon", "Lacios", "73456523", "1995-04-21", "20006", "Medico", "Cirugia", "M"));

        Estudiante.estudiantes_mayores_25(personas);
        Docente.docente_ingeniero_masculino_mayor(personas);
        Persona.mismos_apellidos(personas);
    }
}