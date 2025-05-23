package personas;

public class Persona {
	private int ci;
	private String nombre; 
	private String apellido;
	private int celular; 
	private int fecha_nac;
	
	public Persona(int ci, String nombre, String apellido, int celular,int fecha_nac){
		this.ci=ci;
		this.nombre=nombre;
		this.apellido=apellido;
		this.celular=celular;
		this.fecha_nac=fecha_nac;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci=ci;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public  int getCelular() {
		return celular;
	}
	public void setCelular(int celular ) {
		this.celular = celular;
	}
	public int getFecha_nac() {
		return  fecha_nac ;
	}
	public void setFecha_nac(int fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public void mostrarInfoPersona() {
		System.out.printf("-Nombre: %s\n-Apellido: %s\n-Celular: %d\n-Nacimiento: %s\n-CI: %d \n",nombre,apellido,celular,fecha_nac,ci);
	}
	
	
	
	
}
