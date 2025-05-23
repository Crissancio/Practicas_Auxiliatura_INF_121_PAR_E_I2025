///"NOMBRE: QUENTA MAMANI NICK RANDY"
/// "CI: 10037571"
///
/// "1. Crea una clase Persona con nombre, edad y ciudad"
/// "a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”"
/// "b) Crea tres personas y muestra su saludo"
/// "c) Agrega un método para verificar si es mayor de edad"

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
        return "Hola, soy " + nombre + " de " + ciudad + ".";
    }

    public String verificarMayorEdad() {
        return edad >= 18 ? "es mayor de edad" : "no es mayor de edad";
    }

    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Mauricio", 30, "Beni"),
                new Persona("Nayra", 16, "El Alto"),
                new Persona("Gafi", 21, "Sucre")
        };

        for (Persona persona : personas) {
            System.out.println(persona.saludo());
            System.out.println(persona.nombre + " " + persona.verificarMayorEdad());
        }
    }
}
