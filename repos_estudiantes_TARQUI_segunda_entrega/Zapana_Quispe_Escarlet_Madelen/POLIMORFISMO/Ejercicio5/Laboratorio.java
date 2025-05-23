public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }
    public String mostrar(){
        return String.format("Nombre:%s capaciadad:%d NrodeMesas:%d nroSillas:%d",this.nombre,this.capacidad,this.nroMesas,this.nroSillas);
    }
    public int cantidadMuebles(){
        int su=this.nroMesas+this.nroSillas;
        return su;
    }
    
    
}
