package Ej3;
public class Coche {
    public String marca;
    public String modelo;
    public float velocidad = 0;

    public Coche(String marca, String modelo, float velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    // Inciso a
    public void acelerar(){
        this.velocidad = this.velocidad + 10;
        System.out.println("El coche " + this.marca +" "+ this.modelo + " acelero a " + this.velocidad + " km/h");
    }
    // Inciso b
    public void frenar(){
        this.velocidad = this.velocidad - 5;
        System.out.println("El coche " + this.marca +" "+ this.modelo + " freno a " + this.velocidad + " km/h");
    }
    // Inciso c
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla", 100);
        c1.acelerar();
        c1.frenar();
        Coche c2 = new Coche("Nissan", "Sentra", 120);
        c2.acelerar();
        c2.frenar();
    }
}
