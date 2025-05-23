package avion_composicion;

import java.util.ArrayList;
import java.util.List;

public class Avion {
	private String modelo;
	private String fabricante;
	private List<Parte> parte= new ArrayList<>();
	
	
	
	public Avion(String modelo,String fabricante) {
		this.modelo=modelo;
		this.fabricante=fabricante;
	}
	
	public Avion(String modelo,String fabricante,List<Parte> parte) {
		this.modelo=modelo;
		this.fabricante=fabricante;
		this.parte=parte;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante=fabricante;
	}
	public List<Parte> getParte(){
		return parte;
	}
	public void setParte(List<Parte> parte) {
		this.parte=parte;
	}
	
	public void agregarPartes(Parte part) {
		this.parte.add(part);
	}
	
	public void MostrarinfAvion() {
		System.out.println("el modelo es "+modelo+" y es del fabricante "+fabricante+" y su partes son ");
		for(Parte part : parte) {
			part.mostrarInf();
		}
	}
}
