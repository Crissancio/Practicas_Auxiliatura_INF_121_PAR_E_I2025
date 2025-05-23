package minecraft;

public class BloqueHorno extends Bloque {
	 private String color;
	 private int capacidadComida;

	 public BloqueHorno(String color, int capacidadComida) {
	     super("Horno");
	     this.color = color;
	     this.capacidadComida = capacidadComida;
	 }

	 @Override
	 public void accion() {
	     System.out.println("El " + tipo + " de color " + color + " tiene una capacidad de " + capacidadComida + " comida.");
	 }

	 @Override
	 public void romper() {
	     System.out.println("Rompiendo el " + tipo + ". Puede que caigan restos.");
	 }
	}