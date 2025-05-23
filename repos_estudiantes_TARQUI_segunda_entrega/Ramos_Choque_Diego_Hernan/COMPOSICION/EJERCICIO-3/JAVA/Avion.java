package composicion;
import java.util.ArrayList;
public class Avion {
	private String modelo;
	private String fabricante;
	private ArrayList<Parte> componentesdelavion;
	
	public Avion(String modelo, String fabricante) {

		this.modelo = modelo;
		this.fabricante = fabricante;
		this.componentesdelavion = new ArrayList<>();
		
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public ArrayList<Parte> getComponentesdelavion() {
		return this.componentesdelavion;
	}
	public void setComponentesdelavion(ArrayList<Parte> componentesdelavion) {
		this.componentesdelavion = componentesdelavion;
	}
	
	public void agregar_parte(Parte parte) {
		this.componentesdelavion.add(parte);
		
	}
	public void mostrar_avion() {
		System.out.println("El fabricante es: " + this.fabricante + " modelo" + this.modelo);
		System.out.println("---------PARTES--------");
		for(int i = 0 ; i < this.componentesdelavion.size(); i++){
			System.out.println(this.componentesdelavion.get(i).mostrarInfo());
			
		}
	}
	
	
	
}
