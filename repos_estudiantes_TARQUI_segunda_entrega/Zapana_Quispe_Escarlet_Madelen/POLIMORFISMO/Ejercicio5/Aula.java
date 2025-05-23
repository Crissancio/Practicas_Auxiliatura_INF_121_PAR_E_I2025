public class Aula {
    private String nombre;
    private int capacidad;
    private int nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }
    public String mostrar(){
        return String.format("nombre: %s Capacidad: %d  pupitres: %d",this.nombre,this.capacidad,this.nropupitres);
    }
    public int cantidadMuebles(){
        return this.nropupitres;
    }
}
