package composicion;
import java.util.ArrayList;
public class Computadora {
	private String marca;
	private String modelo;
	private ArrayList<Componente> componentes;
	
	public Computadora(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.componentes = new ArrayList<>();
		
	}
	 public  void agregarComponente(String nombre, String capacidad ){
		 Componente c = new Componente( nombre, capacidad);
		 this.componentes.add(c);
	 }
	 
	 public void mostrar_info() {
		 System.out.println("La computadora es de marca: " + this.marca + " del modelo: " + this.modelo);
		 System.out.println("--------PARTES----------");
		 for(int i = 0; i < this.componentes.size(); i++) {
			 System.out.println(this.componentes.get(i));
			 
		 }
	 }

}
