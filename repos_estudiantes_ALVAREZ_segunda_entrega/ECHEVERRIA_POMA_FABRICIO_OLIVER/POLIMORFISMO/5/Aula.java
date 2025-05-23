public class Aula {
    private String nombre;
    private int capacidad;
    private int nropupitres;
    
    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }
//B
    public void mostrar(){
        System.out.println("Aula: ");
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nropupitres);
    }
//C
    public int cantidadMuebles(){
        return this.nropupitres;
    }
}
