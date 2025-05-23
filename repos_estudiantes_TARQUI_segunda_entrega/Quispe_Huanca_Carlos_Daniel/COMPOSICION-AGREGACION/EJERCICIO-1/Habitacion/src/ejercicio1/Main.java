package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Casa miCasa = new Casa("Calle Principal 123");
        
        Habitacion sala = new Habitacion("Sala", 20.5);
        miCasa.agregarHabitacion(sala);
        
        Habitacion cocina = new Habitacion("Cocina", 15.0);
        miCasa.agregarHabitacion(cocina);
        
        Habitacion dormitorio = new Habitacion("Dormitorio Principal", 18.7);
        miCasa.agregarHabitacion(dormitorio);
        
        miCasa.mostrarCasa();
    }
}