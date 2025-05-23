public class Main {
  public static void main(String[] args) {
    Avion avion = new Avion("Boeing 747", "Boeing");

    Parte ala = new Parte("Ala", 1000);
    Parte cola = new Parte("Cola", 500);
    Parte fuselaje = new Parte("Fuselaje", 2000);
    Parte motor = new Parte("Motor", 1500);
    Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 800);
    Parte cabina = new Parte("Cabina", 1200);
    Parte timon = new Parte("Timón", 300);
    Parte estabilizador = new Parte("Estabilizador", 400);
    Parte parabrisas = new Parte("Parabrisas", 200);
    Parte asa = new Parte("Asa", 100);
    Parte rueda = new Parte("Rueda", 50);

    avion.agregarParte(ala);
    avion.agregarParte(cola);
    avion.agregarParte(fuselaje);
    avion.agregarParte(motor);
    avion.agregarParte(trenAterrizaje);
    avion.agregarParte(cabina);
    avion.agregarParte(timon);
    avion.agregarParte(estabilizador);
    avion.agregarParte(parabrisas);
    avion.agregarParte(asa);
    avion.agregarParte(rueda);
    
    System.out.println("Cantidad de partes del avión: " + avion.getCantidadPartes());
    avion.mostrarAvion();

  }
}