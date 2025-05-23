package com.mycompany.practicaco1;
public class PracticaCO1 {                                            
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 20, "Madrid");
        Persona p2 = new Persona("Luis", 17, "Barcelona");
        Persona p3 = new Persona("Marta", 30, "Sevilla");

        Persona[] personas = {p1, p2, p3};
        for (Persona p : personas) {
            p.saludar();
            System.out.println("Mayor de edad: " + p.esMayorDeEdad());
        }
    }
}
