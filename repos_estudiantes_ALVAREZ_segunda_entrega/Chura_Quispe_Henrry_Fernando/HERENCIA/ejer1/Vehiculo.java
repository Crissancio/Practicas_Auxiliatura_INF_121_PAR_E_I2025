package vehiculos;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private float precioBase;
	
	public Vehiculo(String marca , String modelo, int anio , float precioBase) {
		this.marca= marca;
		this.modelo= modelo;
		this.anio=anio;
		this.precioBase=precioBase;
	}
	
	public  String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public  String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public  int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio=anio;
	}
	public  float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase=precioBase;
	}
	
	public void mostrarInf() {
		System.out.printf("\n-Marca: %s\n-Modelo: %s \n-Año: %d \n-Precio Base: $%.2f\n",marca,modelo,anio,precioBase);
	}
	}
