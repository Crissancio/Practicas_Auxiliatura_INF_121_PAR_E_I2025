package estudiante_agregacion;

public class Estudiante {
private String nombre;
private String carrera;
private String semestre;
	
	public Estudiante(String nombre, String carrera,String semestre) {
		this.nombre=nombre;
		this.carrera=carrera;
		this.semestre=semestre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera=carrera;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre=semestre;
	}
	
	public void mostrarinf() {
		System.out.println(nombre+"  esta en la carrera de "+carrera+" y esta en el semestre "+semestre);
		
	}
}
