package Herencia;

public class Vehiculo {
	public String marca;
	public String modelo;
	public int año;
	public int precio_base;
	
	public Vehiculo(String marca, String modelo, int año, int precio_base) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.precio_base = precio_base;
	}
	
	
	
	
	public void mostrar_info(){
		System.out.println("Marca "+ this.marca +"modelo: "+ this.modelo +"Año: "+this.año+"precio base: "+this.precio_base+"");
	}
	
	public void vehiculosActuales(){
		if(this.año == 2025)
			mostrar_info();
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


	public int getPrecio_base() {
		return precio_base;
	}


	public void setPrecio_base(int precio_base) {
		this.precio_base = precio_base;
	}
	
	
}
