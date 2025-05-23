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

    public String esMayor() {
        if (edad >= 18) {
            return nombre + " es mayor de edad";
        } else {
            return nombre + " es menor de edad";
        }
    }

    
    public static void main(String[] args) {
        Persona P1 = new Persona("Ana", 17, "Chicago");
        Persona P2 = new Persona("Esteban", 22, "Colombia");
        Persona P3 = new Persona("Ariel", 45, "Peru");

        System.out.println(P1.saludo());
        System.out.println(P2.saludo());
        System.out.println(P3.saludo());

        System.out.println(P1.esMayor());
        System.out.println(P2.esMayor());
        System.out.println(P3.esMayor());
    }
}

