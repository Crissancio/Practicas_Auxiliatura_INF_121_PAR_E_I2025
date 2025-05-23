public class MainCasa {
    public static void main(String[] args) {
        
        Casa miCasa = new Casa("Av. Siempre Viva 123, Springfield");
        
        
        Habitacion sala = new Habitacion("Sala de Estar", 20.5);
        Habitacion cocina = new Habitacion("Cocina", 15.0);
        Habitacion dormitorioPrincipal = new Habitacion("Dormitorio Principal", 25.0);
        Habitacion bano = new Habitacion("Baño", 8.5);
        
      
        miCasa.agregarHabitacion(sala);
        miCasa.agregarHabitacion(cocina);
        miCasa.agregarHabitacion(dormitorioPrincipal);
        miCasa.agregarHabitacion(bano);
        
    
        miCasa.mostrarCasa();
        
        
        System.out.println("\n=== Agregando una nueva habitación ===");
        Habitacion oficina = new Habitacion("Oficina", 12.0);
        miCasa.agregarHabitacion(oficina);
        miCasa.mostrarCasa();
    }
}