package Ej1;
public class Persona {
    public String nombre;
    public int edad;
    public String ciudad;

    public Persona(String nombre, int edad, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    // Inciso a
    public void mostrar_saludo(){
        System.out.println("Hola, soy " + this.nombre + " de " + this.ciudad);
    }
    // Inciso c
    public void verificar_mayoria_edad(){
        if(this.edad >= 18){
            System.out.println(this.nombre + " es mayor de edad");
        }else{
            System.out.println(this.nombre + " es menor de edad");
        }
    }
    // Inciso b
    public static void main(String[] args) {
        Persona p1 = new Persona("Joel", 23, "Bolivia");
        p1.mostrar_saludo();
        p1.verificar_mayoria_edad();
        Persona p2 = new Persona("Belen", 24, "Brasil");
        p2.mostrar_saludo();
        p2.verificar_mayoria_edad();
        Persona p3 = new Persona("Tobias", 2, "Alemania");
        p3.mostrar_saludo();
        p3.verificar_mayoria_edad();
    }
}
