package Herencia;

public class Coche extends Vehiculo{
	private int numerodepuertas;
	private String tipodecombustible;

	public Coche(String marca, String modelo, int año, float precio,int nro, String tipo) {
		super(marca, modelo, año, precio);
		this.numerodepuertas = nro;
		this.tipodecombustible = tipo;
		
	}

	public int getNumerodepuertas() {
		return numerodepuertas;
	}

	public void setNumerodepuertas(int numerodepuertas) {
		this.numerodepuertas = numerodepuertas;
	}

	public String getTipodecombustible() {
		return tipodecombustible;
	}

	public void setTipodecombustible(String tipodecombustible) {
		this.tipodecombustible = tipodecombustible;
	}

	public String mostrar_info() {
		return super.toString() + "Coche [numerodepuertas=" + numerodepuertas + ", tipodecombustible=" + tipodecombustible + "]";
	}
	
	

}
