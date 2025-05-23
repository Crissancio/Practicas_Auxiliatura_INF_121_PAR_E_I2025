package Ejercicio2;


import java.util.ArrayList;

public class Persona1 {

    static class Persona {
        protected String ci, nombre, apellido, celular, fechaNac, sexo;

        public Persona(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo) {
            this.ci = ci;
            this.nombre = nombre;
            this.apellido = apellido;
            this.celular = celular;
            this.fechaNac = fechaNac; 
            this.sexo = sexo;
        }

        public int getEdad() {
            int anioNacimiento = Integer.parseInt(fechaNac.substring(0, 4));
            int anioActual = 2025; 
            return anioActual - anioNacimiento;
        }

        public String getApellido() {
            return apellido;
        }

        public String getSexo() {
            return sexo;
        }

        public String mostrar() {
            return nombre + " " + apellido + " - CI: " + ci + " - Edad: " + getEdad();
        }
    }

    static class Estudiante extends Persona {
        private String ru;
        private String fechaIngreso;
        private int semestre;

        public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo,
                          String ru, String fechaIngreso, int semestre) {
            super(ci, nombre, apellido, celular, fechaNac, sexo);
            this.ru = ru;
            this.fechaIngreso = fechaIngreso;
            this.semestre = semestre;
        }

        @Override
        public String mostrar() {
            return super.mostrar() + " | Estudiante RU: " + ru + ", Semestre: " + semestre;
        }
    }

    static class Docente extends Persona {
        private String nit;
        private String profesion;
        private String especialidad;

        public Docente(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo,
                       String nit, String profesion, String especialidad) {
            super(ci, nombre, apellido, celular, fechaNac, sexo);
            this.nit = nit;
            this.profesion = profesion;
            this.especialidad = especialidad;
        }

        public String getProfesion() {
            return profesion;
        }

        @Override
        public String mostrar() {
            return super.mostrar() + " | Docente NIT: " + nit + ", Profesión: " + profesion;
        }
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Estudiante("123", "Yamil", "Vilca", "777123", "1767-05-10", "M", "RU001", "2020-02-10", 8));
        personas.add(new Estudiante("456", "Maria", "Luna", "777456", "2004-01-15", "F", "RU002", "2023-01-20", 3));
        personas.add(new Docente("789", "Cal", "Pérez", "777789", "1977-03-08", "M", "NIT001", "Ingeniero", "Civil"));
        personas.add(new Docente("101", "Jose", "Gómez", "777101", "1985-07-25", "F", "NIT002", "Arquitecta", "Diseño"));

        System.out.println(" Estudiantes mayores de 25 años:");
        for (Persona p : personas) {
            if (p instanceof Estudiante && p.getEdad() > 25) {
                System.out.println(p.mostrar());
            }
        }
        System.out.println("noemi chino blanco");
        System.out.println("\n Docente masculino, Ingeniero y mayor:");
        Docente mayorIngeniero = null;
        for (Persona p : personas) {
            if (p instanceof Docente) {
                Docente d = (Docente) p;
                if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                    if (mayorIngeniero == null || d.getEdad() > mayorIngeniero.getEdad()) {
                        mayorIngeniero = d;
                    }
                }
            }
        }
        if (mayorIngeniero != null) System.out.println(mayorIngeniero.mostrar());

        System.out.println("\n Personas con el mismo apellido:");
        for (int i = 0; i < personas.size(); i++) {
            for (int j = i + 1; j < personas.size(); j++) {
                if (personas.get(i).getApellido().equalsIgnoreCase(personas.get(j).getApellido())) {
                    System.out.println(personas.get(i).mostrar() + " <--> " + personas.get(j).mostrar());
                }
            }
        }
    }
}
