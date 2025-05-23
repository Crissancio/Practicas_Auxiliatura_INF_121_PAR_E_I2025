package Herencia.Ejercicio3;

public class Docente extends Persona {
    private int nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(int ci, String n, String ap, int cel, int fn, int nit, String prof, String espe, String sexo) {
        super(ci, n, ap, cel, fn);
        this.nit = nit;
        this.profesion = prof;
        this.especialidad = espe;
        this.sexo = sexo;
    }

    public Docente(String sexo) {
        super(1234, "Manuel", "Romero", 789456, 1996);
        this.nit = 100000;
        this.profesion = "Ingeniero";
        this.especialidad = "Industrial";
        this.sexo = sexo;
    }

    public Docente(int ci) {
        super(ci, "Anahy", "Diaz", 657878, 1989);
        this.nit = 2000;
        this.profesion = "Ingeniero";
        this.especialidad = "Ambiental";
        this.sexo = "femenino";
    }

    public Docente() {
        super(6565, "Carla", "Torrez", 48484, 1978);
        this.nit = 75555;
        this.profesion = "Administrador";
        this.especialidad = "Comercio";
        this.sexo = "femenino";
    }

    public int getNit() {
        return nit;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + this.nit);
        System.out.println("Profesión: " + this.profesion);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Sexo: " + this.sexo);
    }

    // Método para saber si el docente cumple con profesion y sexo dados
    public boolean esDeProfesionYSexo(String profesion, String sexo) {
        return this.profesion.equalsIgnoreCase(profesion) && this.sexo.equalsIgnoreCase(sexo);
    }

    // Metodo para calcular la edad del docente
    public int getEdad(int añoActual) {
        return añoActual - this.getFecha_Nac();
    }

    public static void mostrarDocenteMayor(Docente[] docentes, String profesion, String sexo, int añoActual) {
        Docente mayor = null;
        int mayorEdad = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].esDeProfesionYSexo(profesion, sexo)) {
                int edad = docentes[i].getEdad(añoActual);
                if (edad > mayorEdad) {
                    mayorEdad = edad;
                    mayor = docentes[i];
                }
            }
        }

        if (mayor != null) {
            System.out.println("Docente mayor con profesión de " + profesion + " y sexo " + sexo + ":");
            mayor.mostrar();
            System.out.println("Edad: " + mayorEdad);
        } else {
            System.out.println("No se encontró un docente que cumpla con los criterios.");
        }
    }
}