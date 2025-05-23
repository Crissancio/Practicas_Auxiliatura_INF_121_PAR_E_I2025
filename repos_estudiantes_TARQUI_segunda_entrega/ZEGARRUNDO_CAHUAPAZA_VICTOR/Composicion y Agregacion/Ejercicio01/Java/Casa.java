package Composicion;

public class Casa {
	    private String direccion;
	    private Habitacion[] habitaciones;
	    private int cantidadHabitaciones;

	    public Casa(String direccion) {
	        this.direccion = direccion;
	        this.habitaciones = new Habitacion[10]; // Máximo 10 habitaciones
	        this.cantidadHabitaciones = 0;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public void agregarHabitacion(Habitacion habitacion) {
	        if (cantidadHabitaciones < habitaciones.length) {
	            habitaciones[cantidadHabitaciones] = habitacion;
	            cantidadHabitaciones++;
	        }
	    }

	    public void mostrarCasa() {
	        System.out.println("Dirección de la casa: " + direccion);
	        for (int i = 0; i < cantidadHabitaciones; i++) {
	            habitaciones[i].mostrarInfo();
	        }
	    }
	}

