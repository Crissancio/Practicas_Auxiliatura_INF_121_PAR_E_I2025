package Herencia;

class Coche extends Vehiculo {
	public int num_puertas;
	public String tipo_combustible;
	public Coche(int num_puertas, String tipo_combustible,String marca, String modelo, int año, int precio_base) {
		super(marca,modelo, año,precio_base);
		this.num_puertas = num_puertas;
		this.tipo_combustible = tipo_combustible;
		
	}
	public void mostrar_info(){
		System.out.println("Marca "+ this.marca +"modelo: "+ this.modelo +"Año: "+this.año+"precio base: "+this.precio_base+"Num puertas"+this.num_puertas+"Tipo de combustible"+this.tipo_combustible);
	}
	
	public void Mostrar4puertas() {
		if(this.num_puertas > 4) {
			System.out.println("Marca "+ this.marca +"modelo: "+ this.modelo +"Año: "+this.año+"precio base: "+this.precio_base+"Num puertas"+this.num_puertas+"Tipo de combustible"+this.tipo_combustible);
		}
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
