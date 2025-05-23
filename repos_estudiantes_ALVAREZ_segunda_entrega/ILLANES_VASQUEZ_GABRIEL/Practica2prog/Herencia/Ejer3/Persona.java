
package Ejercicio3;


public class Persona {
    protected String nombre, apellido;
    protected int ci, celular, fecha_Nac;
    
    public Persona(){
        this.nombre="Gabo";
        this.celular=12323;
        this.fecha_Nac = 2000;
        this.apellido="ronaldo :V";
        this.ci=121313123;
    }
    
    
    public Persona(String nombre, String apellido, int ci, int celular, int fecha_Nac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }
    
    public void mostrar(){
        System.out.println("nombre: " +nombre+ "\n apellido: " +apellido+ "\n ci :" +ci+ "\n celular: " +celular+ "\n fecha_Nac: " +fecha_Nac);
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

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getFecha_Nac() {
        return fecha_Nac;
    }

    public void setFecha_Nac(int fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }
    
   
    
    
    
}
