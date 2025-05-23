package Ejercicio_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Docente extends Persona {
	private int nit;
	private String profesion;
	private String especialidad;
	
	public Docente() {
		super();
		this.nit=987654321;
		this.profesion="Ingeniero";
		this.especialidad="TIC'S";
	}
	public Docente(int cix, String nombrex, String apellidox, int celularx, String fecha_nacx, int nitx, String profesionx, String especialidadx) {
		super(cix, nombrex, apellidox, celularx, fecha_nacx);
		this.nit=nitx;
		this.profesion=profesionx;
		this.especialidad=especialidadx;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("<DOCENTE>");
		System.out.println("N.I.T.: "+this.nit);
		System.out.println("Profesion: "+this.profesion);
		System.out.println("Especialidad: "+this.especialidad);
		System.out.println();
	}
	public boolean esIngeniero() {
	    if (profesion.equals("Ingeniero") || profesion.equals("ingeniero")) {
	        return true;
	    } 
	    else {
	        return false;
	    }
	}

	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
