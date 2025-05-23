package H_2;

public class Persona {
	protected String ci, nombre, apellido, celular, sexo;
    protected int[] fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, int[] fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido + ", Celular: " + celular +
                           ", Fecha Nac: " + fechaNac[0] + "/" + fechaNac[1] + "/" + fechaNac[2] + ", Sexo: " + sexo);
    }

    public int edad(int añoActual) {
        return añoActual - fechaNac[0];
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }
}
