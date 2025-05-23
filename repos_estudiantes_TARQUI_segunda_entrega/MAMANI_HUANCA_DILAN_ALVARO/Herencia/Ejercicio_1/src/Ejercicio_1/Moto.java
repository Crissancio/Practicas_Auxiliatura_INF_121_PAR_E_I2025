package Ejercicio_1;

public class Moto extends Vehiculo {
	private int cilindrada;
	private String tipo_motor;
	
	public Moto(String marcax, String modelox, int añox, float precio_basex, int cilindradax, String tipo_motorx) {
		super(marcax, modelox, añox, precio_basex);
		this.cilindrada=cilindradax;
		this.tipo_motor=tipo_motorx;
	}
	public void mostrar_info() {
		super.mostrar_info();
		System.out.println("<MOTO>");
		System.out.println("Cilindrada: "+this.cilindrada);
		System.out.println("Tipo Motor: "+this.tipo_motor);
		System.out.println();
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getTipo_motor() {
		return tipo_motor;
	}
	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}
		
}
