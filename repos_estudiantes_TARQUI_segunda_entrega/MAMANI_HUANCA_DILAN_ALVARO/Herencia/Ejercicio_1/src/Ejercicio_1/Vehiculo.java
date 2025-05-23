package Ejercicio_1;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private float precio_base;
	
	public Vehiculo(String marcax, String modelox, int añox, float precio_basex) {
		this.marca=marcax;
		this.modelo=modelox;
		this.año=añox;
		this.precio_base=precio_basex;
	}
	
	public void mostrar_info() {
		System.out.println("<VEHICULO>");
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Año: "+this.año);
		System.out.println("Precio: "+this.precio_base);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public float getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(float precio_base) {
		this.precio_base = precio_base;
	}
	

}
