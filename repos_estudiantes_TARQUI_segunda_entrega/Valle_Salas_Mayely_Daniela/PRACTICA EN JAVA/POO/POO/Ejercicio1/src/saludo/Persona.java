package saludo;

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrarSaludo() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 20, "Madrid");
        Persona persona2 = new Persona("Luis", 15, "Barcelona");
        Persona persona3 = new Persona("Carlos", 18, "Valencia");

        persona1.mostrarSaludo();
        persona2.mostrarSaludo();
        persona3.mostrarSaludo();

        System.out.println(persona1.nombre + " es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println(persona2.nombre + " es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona3.nombre + " es mayor de edad: " + persona3.esMayorDeEdad());
    }
}