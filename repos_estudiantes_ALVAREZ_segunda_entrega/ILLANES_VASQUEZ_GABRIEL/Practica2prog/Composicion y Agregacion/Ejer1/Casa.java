package Lenny;

public class Casa {
    private String direccion;
    private Habitacion habitaciones[] = new Habitacion[30];
    private int cantHab;

    public Casa() {
        // Datos fijos (en lugar de usar Leer)
        direccion = "Av. Las Palmeras 123";
        cantHab = 3;

        System.out.println("Ingresa tus habitaciones con nombre y tamaño");
        habitaciones[0] = new Habitacion("Sala", "5");
        habitaciones[1] = new Habitacion("Cocina", "3");
        habitaciones[2] = new Habitacion("Comedor", "4");

        for (int j = cantHab; j < 29; j++) {
            habitaciones[j] = new Habitacion(); // habitaciones vacías
        }
    }

    public void mostrar_casa() {
        System.out.println("Direccion: " + direccion);
        System.out.println("Habitaciones");
        for (int i = 0; i < cantHab; i++) {
            habitaciones[i].mostrar_info();
        }
    }

    public void agregar(Habitacion x) {
        if (cantHab < 29) {
            habitaciones[cantHab] = x;
            cantHab++;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Habitacion getHabitaciones(int i) {
        return habitaciones[i - 1];
    }

    public void setHabitaciones(Habitacion h, int i) {
        this.habitaciones[i - 1] = h;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }
}
