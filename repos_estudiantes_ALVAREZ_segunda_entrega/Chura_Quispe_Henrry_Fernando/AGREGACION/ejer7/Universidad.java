package estudiante_agregacion;
import java.util.ArrayList; 

import java.util.List;
public class Universidad {
	private String nombre;
	private List<Estudiante>est=new ArrayList<>();
	
	
	public Universidad(String nombre ) {
		this.nombre=nombre;
	}
	public Universidad(String nombre,List<Estudiante>est ) {
		this.nombre=nombre;
		this.est=est;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public List<Estudiante> getEst (){
		return est;
	}
	public void setEst(List<Estudiante>est) {
		this.est=est;
	}
	public void agrgar(Estudiante est) {
		this.est.add(est);
	}
	public void MostrarUni() {
		System.out.println("el nombre de la universidad es "+nombre+" y los estudiantes son");
		System.out.println("----------------------------------------------");
		for(Estudiante estu :est) {
			estu.mostrarinf();
			System.out.println("-------------------------------------------------");
		}
	}
}
