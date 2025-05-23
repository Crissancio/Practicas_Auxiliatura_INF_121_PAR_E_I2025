package Herencia;

public class AppPersona {

    static class Persona {
        String ci;
        String nombre;
        String apellido;
        String celular;
        int edad;
        String sexo;

        public Persona(String ci, String nombre, String apellido, String celular, int edad, String sexo) {
            this.ci = ci;
            this.nombre = nombre;
            this.apellido = apellido;
            this.celular = celular;
            this.edad = edad;
            this.sexo = sexo;
        }

        public void mostrar() {
            System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido + ", Celular: " + celular + ", Edad: " + edad + ", Sexo: " + sexo);
        }
    }

    static class Estudiante extends Persona {
        String ru;
        String fechaIngreso;
        int semestre;

        public Estudiante(String ci, String nombre, String apellido, String celular, int edad, String sexo,
                          String ru, String fechaIngreso, int semestre) {
            super(ci, nombre, apellido, celular, edad, sexo);
            this.ru = ru;
            this.fechaIngreso = fechaIngreso;
            this.semestre = semestre;
        }

        @Override
        public void mostrar() {
            super.mostrar();
            System.out.println("RU: " + ru + ", Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
        }
    }

    static class Docente extends Persona {
        String nit;
        String profesion;
        String especialidad;

        public Docente(String ci, String nombre, String apellido, String celular, int edad, String sexo,
                       String nit, String profesion, String especialidad) {
            super(ci, nombre, apellido, celular, edad, sexo);
            this.nit = nit;
            this.profesion = profesion;
            this.especialidad = especialidad;
        }

        @Override
        public void mostrar() {
            super.mostrar();
            System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad);
        }
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[3];
        Docente[] docentes = new Docente[3];

        // Datos fijos con edad ya calculada
        estudiantes[0] = new Estudiante("123", "Carlos", "López", "777123", 27, "M", "RU001", "2020", 7);
        estudiantes[1] = new Estudiante("456", "Ana", "Pérez", "777456", 19, "F", "RU002", "2022", 3);
        estudiantes[2] = new Estudiante("789", "Lucía", "López", "777789", 28, "F", "RU003", "2019", 8);

        docentes[0] = new Docente("321", "Mario", "Gómez", "700123", 44, "M", "NIT001", "Ingeniero", "Sistemas");
        docentes[1] = new Docente("654", "Elena", "Pérez", "700456", 49, "F", "NIT002", "Arquitecta", "Diseño");
        docentes[2] = new Docente("987", "Luis", "López", "700789", 55, "M", "NIT003", "Ingeniero", "Electrónica");

        System.out.println("\n=== Estudiantes mayores de 25 años ===");
        for (Estudiante e : estudiantes) {
            if (e.edad > 25) {
                e.mostrar();
                System.out.println();
            }
        }

        System.out.println("\n=== Docente masculino, Ingeniero y el mayor ===");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.profesion.equalsIgnoreCase("Ingeniero") && d.sexo.equalsIgnoreCase("M")) {
                if (mayor == null || d.edad > mayor.edad) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            mayor.mostrar();
        }

        System.out.println("\n=== Estudiantes y docentes con el mismo apellido ===");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.apellido.equalsIgnoreCase(d.apellido)) {
                    System.out.println("\nCoincidencia de apellido: " + e.apellido);
                    e.mostrar();
                    d.mostrar();
                    System.out.println();
                }
            }
        }
    }
}
