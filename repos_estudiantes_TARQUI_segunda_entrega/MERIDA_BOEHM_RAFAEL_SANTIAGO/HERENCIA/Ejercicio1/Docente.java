package Ejercicio1_H;

public class Docente extends Persona {
    String nit, profesion, especialidad, sexo;

    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }
}

