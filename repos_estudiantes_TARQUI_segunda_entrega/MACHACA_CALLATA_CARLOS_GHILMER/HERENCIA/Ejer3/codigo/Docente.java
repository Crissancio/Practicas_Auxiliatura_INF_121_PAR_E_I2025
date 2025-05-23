package HERENCIA.Ejer3.codigo;

public class Docente extends Persona {
    private int nit;
    private String profesion;
    private String especialidad;

    public Docente(int ci, String nombre, String apellido, int celular, String fecha_Nac, int nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
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

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }

    public void mostrarProfesion() {
        String profesion = getProfesion();
        if(profesion.equals("Ingeniero")){
            System.out.println(" Es del sexo masculino");
            System.out.println(" Y es el mayor que todos");
        }else {
            System.out.println("Es de otra profesión");
        }
    }
     public void mostrarMismoApellido() {
        String apellido = getApellido();
        if (apellido.equals("Martínez")) {
            System.out.println("El apellido es Martínez");
        } else {
            System.out.println("El apellido no es Martínez");
        }
    }

}
