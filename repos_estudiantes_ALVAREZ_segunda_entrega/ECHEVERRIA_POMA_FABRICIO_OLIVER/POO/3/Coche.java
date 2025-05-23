public class Coche{
    private String marca;
    private String modelo;
    private int velocidad;
    
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    //A
    public void acelerar(){
        this.velocidad += 10;
    }
    public void frenar(){
        this.velocidad -= 5;
        if (this.velocidad < 0){
            this.velocidad = 0;
        }
    }
    public void mostrarVelocidad(){
        System.out.println("El coche " + this.marca + " " + this.modelo + " tiene una velocidad de " + this.velocidad + " km/h.");
    }
}