package EJERCICIO1;

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String saludo() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    public boolean mayorDeEdad() {
        return edad >= 18;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Victor", 27, "La Paz");
        Persona persona2 = new Persona("Raquel", 21, "Santa Cruz");
        Persona persona3 = new Persona("Alejandra", 17, "Oruro");

        System.out.println(persona1.saludo());
        System.out.println(persona2.saludo());
        System.out.println(persona3.saludo());

        System.out.println("¿" + persona1.getNombre() + " es mayor de edad? " + persona1.mayorDeEdad());
        System.out.println("¿" + persona2.getNombre() + " es mayor de edad? " + persona2.mayorDeEdad());
        System.out.println("¿" + persona3.getNombre() + " es mayor de edad? " + persona3.mayorDeEdad());
    }
}
