package vehiculos;

public class Coche extends Vehiculo {
	private int numDePuertas;
	private String tipoDeCombustible;
	
	public Coche(int numDePuertas, String tipoDeCombustible,String marca , String modelo, int anio , float precioBase) {
		super(marca,modelo,anio,precioBase);
		this.numDePuertas=numDePuertas;
		this.tipoDeCombustible=tipoDeCombustible;
	}
	
	public  int getNumDePuertas() {
		return numDePuertas;
	}
	
	public void setNumDePuertas(int numDePuertas) {
		this.numDePuertas=numDePuertas;
	}
	public  String getTipoDeCombustible() {
		return tipoDeCombustible;
	}
	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible=tipoDeCombustible;
	}
	@Override
	public void mostrarInf() {
		System.out.printf("\nCoche: \n-Puertas: %d\n-Combustible: %s  ",numDePuertas,tipoDeCombustible);
		super.mostrarInf();
	}
}

