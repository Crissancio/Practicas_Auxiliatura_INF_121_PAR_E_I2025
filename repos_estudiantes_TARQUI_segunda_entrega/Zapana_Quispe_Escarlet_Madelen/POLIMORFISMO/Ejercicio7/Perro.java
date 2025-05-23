public class Perro {
    private String Nombre;
    private int edad;
    private String raza;

    public Perro(String Nombre, int edad, String raza) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.raza = raza;
    }
    public String mostrar(){
        return String.format("Nombre: %s Edad: %d Raza: %s",this.Nombre,this.edad,this.raza);
    }
    public void hacerSonido(){
        System.out.println("Gua Guau");
    }
    public void moverse(){
        System.out.println("corre");
    }
}
