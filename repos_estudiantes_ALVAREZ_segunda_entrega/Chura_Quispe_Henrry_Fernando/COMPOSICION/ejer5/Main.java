package futbol_composicion;

public class Main {

	public static void main(String[] args) {
		
		Equipo equi = new Equipo("Bolivar");
		
		
		
		equi.agregarJugadores(new Portero(3,"messi",7," Portero "));
		equi.agregarJugadores(new Defensa(5,"ronaldo",2,"Defensa"));
		equi.agregarJugadores(new Mediocampista(4,"pele",9,"Mediocampista"));
		equi.agregarJugadores(new Delantero(8,"Maradona",5,"Delantero"));
		
		equi.mostrarEquipo();

	}

}
