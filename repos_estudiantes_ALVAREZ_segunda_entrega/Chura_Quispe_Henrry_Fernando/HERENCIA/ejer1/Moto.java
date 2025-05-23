package vehiculos;

public class Moto extends Vehiculo{
	private float cilindrada;
	private String tipoMotor;
	
	public Moto(float cilindrada, String tipoMotor,String marca , String modelo, int anio , float precioBase) {
		super(marca,modelo,anio,precioBase);
		this.cilindrada=cilindrada;
		this.tipoMotor=tipoMotor;
	}
	public  float getCilindra() {
		return cilindrada;
	}
	public void setCilindra(float cilindrada) {
		this.cilindrada=cilindrada ;
	}
	public  String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor=tipoMotor;
	}
	
	@Override
	public void mostrarInf() {
	System.out.printf("\nMOTO: \n-Cilindrada: %.2fcc\n-Motor: %s ",cilindrada,tipoMotor);
	super.mostrarInf();
	}
	
	}
	
