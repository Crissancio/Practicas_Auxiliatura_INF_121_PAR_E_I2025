// 3. Definir las clases:
// Persona <ci, nombre, apellido, celular, fecha_Nac>
// Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
// Docente (heredado de persona) <nit, profesión, especialidad>

package ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    // a) Se definen los atributos solicitados en el enunciado general
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;

    // a) Constructor por defecto
    public Persona() {
        this.ci = "";
        this.nombre = "";
        this.apellido = "";
        this.celular = "";
        this.fechaNac = LocalDate.now();
    }

    // a) Constructor con parámetros
    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaNac = LocalDate.parse(fechaNac, fmt);
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }

    // b) Método mostrar()
    public void mostrar() {
        System.out.printf("CI: %s, Nombre: %s %s, Celular: %s, Fecha Nac: %s, Edad: %d\n",
                ci, nombre, apellido, celular, fechaNac, getEdad());
    }
}
