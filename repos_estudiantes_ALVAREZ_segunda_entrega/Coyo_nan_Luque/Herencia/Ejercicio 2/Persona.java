public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String fecha_nac;

    public Persona(String ci, String nombre, String apellido, String celular, String fecha_nac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
    }

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

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String mostrar() {
        return "CI: " + ci + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Celular: " + celular + ", Fecha Nac: " + fecha_nac;
    }

    public static void mismos_apellidos(java.util.ArrayList<Persona> personas) {
        System.out.println("\nPersonas con mismo apellido:");
        for (int i = 0; i < personas.size(); i++) {
            Persona p1 = personas.get(i);
            boolean tiene_repetido = false;
            for (int j = i + 1; j < personas.size(); j++) {
                Persona p2 = personas.get(j);
                if (p1.getApellido().equals(p2.getApellido())) {
                    if (!tiene_repetido) {
                        System.out.println("Apellido: " + p1.getApellido());
                        System.out.println("  " + p1.mostrar());
                        tiene_repetido = true;
                    }
                    System.out.println("  " + p2.mostrar());
                }
            }
        }
    }
}