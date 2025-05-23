package Herencia_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Avion {
	private String modelo;
	private String fabricante;
	private List<Parte> partes;
	public Avion(String modelo, String fabricante) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.partes = new ArrayList<>();
	}
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void agregar_parte(Parte parte) {
		partes.add(parte);
	}
	public void mostrar_avion() {
		System.out.println("Avion: "+modelo+", fabricante: "+ fabricante);
		System.out.println("Partes:");
		for (Parte parte:partes) {
			parte.mostrar_info();
		}
	}

}
