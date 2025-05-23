package Agregacion;

public class Universidad {
	private String nombreU;
	private Estudiante[] estudiantes;
	private int cantidaddeestudiantesenlau;
	
	public Universidad(String nombre) {
		this.nombreU = nombre;
		this.estudiantes = new Estudiante[10];
		this.cantidaddeestudiantesenlau = 0;
		
	}
	public  void agregarEstudiante(Estudiante estudiante) {
		this.estudiantes[this.cantidaddeestudiantesenlau] = estudiante;
		this.cantidaddeestudiantesenlau++;
		
	}
	
	public void mostrar_info() {
		System.out.println("---------------" + this.nombreU + "--------------");
		for (int i = 0; i < this.cantidaddeestudiantesenlau ; i++) {
			System.out.println("Estudiante nro"  + (i +1) + this.estudiantes[i]);
		}
	}
}
