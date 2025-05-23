package Herencia;

public class Moto extends Vehiculo {
	private String cilindrada;
	private String tipomotor;
	
	public Moto(String marca, String modelo, int año, float precio,String c, String t) {
		super(marca, modelo, año, precio);
		this.cilindrada = c;
		this.tipomotor = t;
		
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipomotor() {
		return tipomotor;
	}

	public void setTipomotor(String tipomotor) {
		this.tipomotor = tipomotor;
	}


	public String mostrar_info() {
		return super.toString() +"Moto [cilindrada=" + cilindrada + ", tipomotor=" + tipomotor + "]";
	}
	
	

}
