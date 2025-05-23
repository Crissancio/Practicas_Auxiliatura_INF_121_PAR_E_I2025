public class Main {
    public static void main(String[] args) {
        Habitacion dormitorioPrincipal = new Habitacion("Dormitorio Principal", 25);
        Habitacion dormitorioNinos = new Habitacion("Dormitorio de Ninos", 18);
        Habitacion sala = new Habitacion("Sala", 30);
        Habitacion cocina = new Habitacion("Cocina", 15);
        Habitacion banoPrincipal = new Habitacion("Bano Principal", 8);
        Habitacion banoVisitas = new Habitacion("Bano de Visitas", 6);
        Habitacion comedor = new Habitacion("Comedor", 20);
        Habitacion garage = new Habitacion("Garage", 35);
        
        Casa casaMamani = new Casa("Calle Warnes N 1245, Zona Villa Fatima, La Paz");
        
        casaMamani.agregarHabitacion(dormitorioPrincipal);
        casaMamani.agregarHabitacion(dormitorioNinos);
        casaMamani.agregarHabitacion(sala);
        casaMamani.agregarHabitacion(cocina);
        casaMamani.agregarHabitacion(banoPrincipal);
        casaMamani.agregarHabitacion(banoVisitas);
        casaMamani.agregarHabitacion(comedor);
        casaMamani.agregarHabitacion(garage);
        
        System.out.println("CASA DE MAMANI:");
        casaMamani.mostrarCasa();
        
        Habitacion salaEstar = new Habitacion("Sala de Estar", 22);
        Habitacion estudio = new Habitacion("Estudio", 12);
        Habitacion lavanderia = new Habitacion("Lavanderia", 10);
        
        Casa casaQuispe = new Casa("Avenida 6 de Agosto N 3456, Zona San Miguel, La Paz");
        casaQuispe.agregarHabitacion(new Habitacion("Dormitorio Matrimonial", 28));
        casaQuispe.agregarHabitacion(salaEstar);
        casaQuispe.agregarHabitacion(estudio);
        casaQuispe.agregarHabitacion(new Habitacion("Cocina Integral", 18));
        casaQuispe.agregarHabitacion(lavanderia);
        casaQuispe.agregarHabitacion(new Habitacion("Bano Completo", 10));
        
        System.out.println("CASA DE QUISPE:");
        casaQuispe.mostrarCasa();
    }
}