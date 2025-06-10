class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String Saludo() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}

class Persona1 {
    private String nombre;
    private String ciudad;

    public Persona1(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String Saludo() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    public boolean esMayorDeEdad(int edad) {
        return edad > 18;
    }
}

class Persona2 {
    private String nombre;
    private String ciudad;

    public Persona2(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String Saludo() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    public boolean esMayorDeEdad(int edad) {
        return edad > 18;
    }
}

public class Principal {
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Axl Rose", 24, "Detroit");
        System.out.println(persona1.Saludo());
        System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());

        
        Persona1 persona2 = new Persona1("Jim Morrison", "Texas");
        System.out.println(persona2.Saludo());
        System.out.println("¿Es mayor de edad? " + persona2.esMayorDeEdad(20));

        
        Persona2 persona3 = new Persona2("Paul McCartney", "London");
        System.out.println(persona3.Saludo());
        System.out.println("¿Es mayor de edad? " + persona3.esMayorDeEdad(17));
    }
}
