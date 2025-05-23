public class Persona {
    protected String ci="13878548";
    protected String nombre="Ana Maria";
    protected String apellido="Ruiz Castillo";
    protected String celular="68475201";
    protected int fecha_Nac=2001;

    public Persona(String ci, String nombre, String apellido, String celular, int fecha_Nac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }
    
    //Implementa las clases con sus constructores, datos por defecto y mostrar.
    //datos por defecto
    public void Mostrar(){
        System.out.printf("ci: %s,nombre:%s,apellido:%s,celular:%s,fecha de nacimiento:%d",ci,nombre,apellido,celular,fecha_Nac);
        
    }

    public int getFecha_Nac() {
        return fecha_Nac;
    }
    public String getApellido(){
        return apellido;
    }
    
}
