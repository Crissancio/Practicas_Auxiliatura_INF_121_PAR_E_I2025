package personal;

public class Mesero extends Empleado {
	 private int horasExtra;
	 private float sueldoHora;
	 private float propina;

	 public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
	     super(nombre, sueldoMes);
	     this.horasExtra = horasExtra;
	     this.sueldoHora = sueldoHora;
	     this.propina = propina;
	 }

	 @Override
	 public float sueldoTotal() {
	     return sueldoMes + (horasExtra * sueldoHora) + propina;
	 }
	}