package personas;

public class Docente extends Persona{
	private int nit;
	private String profecion;
	private String especialidad;
	
	public Docente(int nit, String profecion, String especialidad,
			int ci, String nombre,
			String apellido, int celular,int fecha_nac) {
		super(ci,nombre,apellido,celular,fecha_nac);
		this.nit=nit;
		this.profecion=profecion;
		this.especialidad=especialidad;
		}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit=nit;
	}
	public String getProfecion() {
		return profecion;
	}
	public void setProfecion(String profecion) {
		this.profecion=profecion;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad=especialidad;
	}
	public void mostrarInfoDocente() {
	System.out.printf("\nDocente: \n-nit %d\n-Profecion: %s\n-Especialidad: \n",nit,profecion,especialidad);
		super.mostrarInfoPersona();
	}
}
