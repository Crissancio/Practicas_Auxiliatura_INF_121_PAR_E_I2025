public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public String mostrar(){
        return String.format("nombre: %s  tipo: %s",this.nombre,this.tipo );
    } 
    public void hacerSonido(){
        System.out.println("pio pio");
    }
    public void moverse(){
        System.out.println("vuela...");
    }
}
