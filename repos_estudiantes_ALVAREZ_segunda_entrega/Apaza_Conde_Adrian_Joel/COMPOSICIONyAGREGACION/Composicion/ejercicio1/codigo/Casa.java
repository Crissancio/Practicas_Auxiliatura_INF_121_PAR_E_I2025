// a)
import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitación> habitaciones;
    
    public Casa(String d) {
        this.direccion = d;
        this.habitaciones = new ArrayList<>();
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void agregar_habitacion(Habitación x) {
        habitaciones.add(x);
    }
    public void mostrar_casa() {
        System.out.println("Casa: ");
        System.out.println("dirección: " + direccion);
        System.out.println("\n habitaciones de la casa: ");
        if (habitaciones.isEmpty()) {
            System.out.println("la casa no tiene habitaciones");
        } else {
            for (Habitación a : habitaciones) {
                a.mostrar_info();
            }
        }
    }
}