public class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public String mostrar(){
        return String.format("nombre:%s color:%s",this.nombre,this.color);
    }
    public void hacerSonido(){
        System.out.println("miau");
    }
    public void moverse(){
        System.out.println("salta");
    }
}
