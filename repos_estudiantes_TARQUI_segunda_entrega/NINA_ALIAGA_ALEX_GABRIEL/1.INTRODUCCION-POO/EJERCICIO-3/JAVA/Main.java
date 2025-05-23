public class Main {
  public static void main(String[] args) {
    Coche c1 = new Coche("Toyota", "Corolla", 150);
    Coche c2 = new Coche("Mercedes Benz", "CLA", 100);

    c1.acelerar();
    c2.acelerar();

    c1.frenar();
    c2.frenar();

    System.out.println(c1);
    System.out.println(c2);
  }

}