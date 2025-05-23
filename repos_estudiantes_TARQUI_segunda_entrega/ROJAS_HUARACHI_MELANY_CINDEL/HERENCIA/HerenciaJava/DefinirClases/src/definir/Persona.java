package definir;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    protected String ci, nombre, apellido, celular;
    protected Date fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, Date fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + " | CI: " + ci);
    }

    public int edad() {
        Calendar nac = Calendar.getInstance();
        nac.setTime(fechaNac);
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - nac.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < nac.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String getApellido() {
        return apellido;
    }
}
