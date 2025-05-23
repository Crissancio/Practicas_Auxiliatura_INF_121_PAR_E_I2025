package velocidad;

public class Coche {
 private String marca;
 private String modelo;
 private int velocidad;

 public Coche(String marca, String modelo) {
     this.marca = marca;
     this.modelo = modelo;
     this.velocidad = 0; 
 }

 public void acelerar() {
     velocidad += 10; 
 }

 public void frenar() {
     velocidad -= 5; 
     if (velocidad < 0) {
         velocidad = 0; 
     }
 }

 public int getVelocidad() {
     return velocidad;
 }

 @Override
 public String toString() {
     return "Coche [Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h]";
 }

 public static void main(String[] args) {
     Coche coche1 = new Coche("Nissan", "Kicks Play");
     Coche coche2 = new Coche("BMW", "BMW X5 M");

     coche1.acelerar();
     coche2.acelerar();
     coche1.acelerar();

     coche1.frenar();
     coche2.frenar();
     coche2.frenar(); 

     System.out.println(coche1);
     System.out.println(coche2);
 }
}
