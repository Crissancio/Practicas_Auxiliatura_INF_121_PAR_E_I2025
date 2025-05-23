package Herencia;


class Moto extends Vehiculo {
	public int cilindrada;
	public String tipo_motor;
	public Moto(int cilindrada, String tipo_motor,String marca, String modelo, int año, int precio_base) {
		super(marca,modelo, año,precio_base);
		this.cilindrada = cilindrada;
		this.tipo_motor = tipo_motor;
		
	}
	public void mostrar_info(){
		System.out.println("Marca "+ this.marca +" modelo: "+ this.modelo +" Año: "+this.año+" precio base: "+this.precio_base+" cilindrada "+this.cilindrada+" Tipo de motor "+this.tipo_motor);
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
