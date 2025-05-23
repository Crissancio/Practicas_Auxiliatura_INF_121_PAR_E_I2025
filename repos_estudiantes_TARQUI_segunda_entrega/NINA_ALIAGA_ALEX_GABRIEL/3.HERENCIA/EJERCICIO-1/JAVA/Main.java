import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Coche coche = new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina");
    Coche coche2 = new Coche("Honda", "Civic", 2019, 23000, 4, "Gasolina");
    Moto moto = new Moto("Yamaha", "YZF-R3", 2021, 6000, 321, "4T");
    Moto moto2 = new Moto("Kawasaki", "Ninja 400", 2020, 5000, 399, "4T");

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    vehiculos.add(coche);
    vehiculos.add(coche2);
    vehiculos.add(moto);
    vehiculos.add(moto2);
    
    System.out.println("Información de todos los vehículos:");
    for (Vehiculo vehiculo : vehiculos) {
      if (vehiculo instanceof Coche) {
        Coche c = (Coche) vehiculo;
        c.mostrarInformacion();
      } else {
        Moto m = (Moto) vehiculo;
        m.mostrarInformacion();
      }
      System.out.println();
    }
    
    System.out.println("--------------------------------------");
    System.out.println("Coches con más de 4 puertas:");
    CochesConMasDe4Puertas(vehiculos);

    System.out.println("--------------------------------------");
    System.out.println("Vehículos actuales:");
    VehicuosActuales(vehiculos);
  }

  public static void CochesConMasDe4Puertas(ArrayList<Vehiculo> vehiculos) {
    for (Vehiculo vehiculo : vehiculos) {
      if (vehiculo instanceof Coche) {
        Coche c = (Coche) vehiculo;
        if (c.getNum_puertas() >= 4) {
          c.mostrarInformacion();
        }
      }
      System.out.println();
    }
  }

  public static void VehicuosActuales(ArrayList<Vehiculo> vehiculos) {
    for (Vehiculo vehiculo : vehiculos) {
      if (vehiculo.getAnio() >= 2020) {
        vehiculo.mostrarInformacion();
      }
      System.out.println();
    }
  }
}