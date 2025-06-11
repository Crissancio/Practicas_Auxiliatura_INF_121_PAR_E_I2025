public abstract class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String fechaNac;

    public Persona() {
        this.ci = "0";
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.celular = "0";
        this.fechaNac = "01/01/1900";
    }
    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    //A
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Celular: " + celular + ", Fecha Nacimiento: " + fechaNac);
    }
    public int calcularEdad() {
        int añoNac = Integer.parseInt(fechaNac.split("/")[2]);
        int añoActual = 2025;
        return añoActual - añoNac;
    }
}