/*
-----------------ENUNCIADO-----------------

 * 3. Crea una clase Coche con marca, modelo y velocidad
a) Agrega un método acelerar () que aumente la velocidad en 10
b) Agrega un método frenar () que disminuya la velocidad en 5
c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades
*/
public class Main{
    public static void main(String[] args) {
        //B
        Coche coche1 = new Coche("Tesla", "LDC", 10);
        Coche coche2 = new Coche("Pegasus", "NS", 1);
        //C
        System.out.println("Antes de acelerar:");
        coche1.mostrarVelocidad();
        coche2.mostrarVelocidad();

        System.out.println("\nAcelerando...");
        coche1.acelerar();
        coche2.acelerar();
        coche1.mostrarVelocidad();
        coche2.mostrarVelocidad();

        System.out.println("\nFrenando...");
        coche1.frenar();
        coche2.frenar();
        coche1.mostrarVelocidad();
        coche2.mostrarVelocidad();
    }
}