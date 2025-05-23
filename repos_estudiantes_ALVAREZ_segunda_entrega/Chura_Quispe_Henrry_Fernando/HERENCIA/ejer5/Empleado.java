package empleados;

public class Empleado {
	private String nombre;
	private String apellido;
	private float salario_base;
	private int anios_antiguedad;
	
	public Empleado(String nombre, String apellido,float salario_base,int anios_antiguedad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.salario_base=salario_base;
		this.anios_antiguedad=anios_antiguedad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public float getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(float salario_base) {
		this.salario_base=salario_base;
	}
	public int getAnios_antiguedad() {
		return anios_antiguedad;
	}
	public void setAnios_antiguedad(int anios_antiguedad) {
		this.anios_antiguedad=anios_antiguedad;
	}
	public double salario() {
		return salario_base+(salario_base*0.05*anios_antiguedad);
	}
	public void mostrarinf() {
		System.out.printf("-Nombre: %s\n-Apellido: %s\n-Salario Base: %.2f\n-Años de antiguedad: %d \n",nombre,apellido,salario_base,anios_antiguedad);
	}
}
