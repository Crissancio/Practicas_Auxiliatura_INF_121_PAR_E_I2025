// b)
public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String fecha_Nac;
    public Persona() {
        this.ci = "0000000";
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.celular = "00000000";
        this.fecha_Nac = "01/01/2000";
    }
    public Persona(String ci, String n, String a, String c, String f) {
        this.ci = ci;
        this.nombre = n;
        this.apellido = a;
        this.celular = c;
        this.fecha_Nac = f;
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
    public String getFecha_Nac() { 
        return fecha_Nac;
    }
    public void setFecha_Nac(String fechaNac) {
        this.fecha_Nac = fechaNac;
    }
    public void mostrar() {
        System.out.println("ci: " + ci);
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("celular: " + celular);
        System.out.println("fecha de nacimiento: " + fecha_Nac);
    }
    public int calcularEdad() {
        int añoNac = Integer.parseInt(fecha_Nac.substring(6));
        return 2023 - añoNac;
    }
}