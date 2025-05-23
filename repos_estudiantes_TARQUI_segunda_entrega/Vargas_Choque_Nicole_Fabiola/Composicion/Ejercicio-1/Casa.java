import java.util.*;

class Habitacion {
    private String nombre;
    private double tamaño;
    
    public Habitacion(String n, double t)
    {
        this.nombre=n;
        this.tamaño=t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Tamano: "+tamaño);
    }
}

class Casa {
    private String dirección;
    private List<Habitacion> habitaciones;
    
    public Casa(String d)
    {
        this.dirección=d;
        this.habitaciones=new ArrayList<>();
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    public void agregarHabitacion(Habitacion h)
    {
        habitaciones.add(h);
    }
    
    public void mostrarCasa()
    {
        System.out.println("Direccion de la casa: "+dirección);
        System.out.println("Habitaciones: ");
        for(Habitacion h: habitaciones)
        {
            h.mostrarInfo();
        }
    }
}

class App {
    public static void main(String[] args) {
        
        System.out.println("------------------------CASA-----------------");
        Casa c1=new Casa("Calle Falsa 123");
        
        Habitacion h1=new Habitacion("Sala", 20.5);        
        Habitacion h2=new Habitacion("Cocina", 12.0);
        Habitacion h3=new Habitacion("Dormitorio", 15.0);
        Habitacion h4=new Habitacion("Bano", 5.5);
        
        c1.agregarHabitacion(h1);        
        c1.agregarHabitacion(h2);
        c1.agregarHabitacion(h3);
        c1.agregarHabitacion(h4);
        
        c1.mostrarCasa();
    }
}