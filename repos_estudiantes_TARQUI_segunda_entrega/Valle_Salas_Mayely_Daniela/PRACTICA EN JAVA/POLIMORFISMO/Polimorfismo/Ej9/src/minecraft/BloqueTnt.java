package minecraft;

public class BloqueTnt extends Bloque {
	 private int daño;

	 public BloqueTnt(int daño) {
	     super("TNT");
	     this.daño = daño;
	 }

	 @Override
	 public void accion() {
	     System.out.println("El " + tipo + " causará un daño de " + daño + " al detonarse.");
	 }

	 @Override
	 public void romper() {
	     System.out.println("Rompiendo el " + tipo + ". ¡Ten cuidado! Podría explotar.");
	 }
	}

