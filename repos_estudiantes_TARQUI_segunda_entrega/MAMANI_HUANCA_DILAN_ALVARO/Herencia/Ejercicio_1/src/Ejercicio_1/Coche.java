package Ejercicio_1;

public class Coche extends Vehiculo{
	private int num_puertas;
	private String tipo_combustible;
	
	public Coche(String marcax, String modelox, int añox, float precio_basex,int num_puertasx, String tipo_combustiblex) {
		super(marcax, modelox, añox, precio_basex);
		this.num_puertas=num_puertasx;
		this.tipo_combustible=tipo_combustiblex;
	}
	
	public void mostrar_info() {
		super.mostrar_info();
		System.out.println("<COCHE>");
		System.out.println("Nro. Puertas: "+this.num_puertas);
		System.out.println("Tipo Combustible: "+this.tipo_combustible);
		System.out.println();
	}
	
	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	public String getTipo_combustible() {
		return tipo_combustible;
	}

	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}
	
	
}
