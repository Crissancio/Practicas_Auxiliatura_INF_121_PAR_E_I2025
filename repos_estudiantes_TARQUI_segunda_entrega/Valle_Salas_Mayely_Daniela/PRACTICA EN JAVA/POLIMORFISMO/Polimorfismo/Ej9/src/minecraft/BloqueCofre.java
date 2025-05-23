package minecraft;

public class BloqueCofre extends Bloque {
	 private int capacidad;
	 private int resistencia;

	 public BloqueCofre(int capacidad, int resistencia) {
	     super("Cofre");
	     this.capacidad = capacidad;
	     this.resistencia = resistencia;
	 }

	 @Override
	 public void accion() {
	     System.out.println("El " + tipo + " tiene una capacidad de " + capacidad + " y una resistencia de " + resistencia);
	 }

	 @Override
	 public void romper() {
	     System.out.println("Rompiendo el " + tipo + ". Puede que se pierdan los objetos dentro.");
	 }
	}