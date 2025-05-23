package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Casa Casa = new Casa("Ciudad Satelite Plan 129 C-11");

        Casa.agregarHabitacion("Sala", 30.0);
        Casa.agregarHabitacion("Cocina", 18.5);
        Casa.agregarHabitacion("Dormitorio Principal", 25.0);
        Casa.mostrarCasa();
    }
}
