package minecraft;

public abstract class Bloque {
 protected String tipo;

 public Bloque(String tipo) {
     this.tipo = tipo;
 }

 public abstract void accion();

 public void colocar(String orientacion) {
     System.out.println("Colocando el bloque " + tipo + " en " + orientacion);
 }

 public abstract void romper();
}

