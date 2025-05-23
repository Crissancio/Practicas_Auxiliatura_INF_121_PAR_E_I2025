import java.util.ArrayList;

public class Casa {
    public String direccion;
    public ArrayList<Habitacion> habitaciones;
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<Habitacion>();
    }
    public void agregarHabiitacoin(String nombre, double tamaño){
        Habitacion habitacion = new Habitacion(nombre, tamaño);
        this.habitaciones.add(habitacion);
    }

    public String toString(){
        System.out.println("-------------Casa--------------");
        String cad = "";
        for(int i = 0; i < habitaciones.size(); i++){
            cad += habitaciones.get(i).toString();
        }
        return "Direccion: " + direccion + "\n" +
                cad;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }
    
}
