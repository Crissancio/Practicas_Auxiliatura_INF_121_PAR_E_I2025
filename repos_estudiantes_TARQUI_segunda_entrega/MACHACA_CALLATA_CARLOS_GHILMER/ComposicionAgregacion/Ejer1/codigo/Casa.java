package ComposicionAgregacion.Ejer1.codigo;

public class Casa {
    public String direccion;
    public Habitacion habitaciones;

    public Casa(String direccion, Habitacion habitacion) {
        this.direccion = direccion;
        this.habitaciones = habitacion;
    }
    public String toString() {
        return String.format(" Casa [ %s, %s ]", this.direccion, this.habitaciones);
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Habitacion getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(Habitacion habitaciones) {
        this.habitaciones = habitaciones;
    }
}
