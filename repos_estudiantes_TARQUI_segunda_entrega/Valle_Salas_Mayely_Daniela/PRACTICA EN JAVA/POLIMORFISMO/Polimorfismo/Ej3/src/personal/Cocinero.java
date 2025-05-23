package personal;

public class Cocinero extends Empleado {
	 private int horasExtra;
	 private float sueldoHora;

	 public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
	     super(nombre, sueldoMes);
	     this.horasExtra = horasExtra;
	     this.sueldoHora = sueldoHora;
	 }

	 @Override
	 public float sueldoTotal() {
	     return sueldoMes + (horasExtra * sueldoHora);
	 }
	}
