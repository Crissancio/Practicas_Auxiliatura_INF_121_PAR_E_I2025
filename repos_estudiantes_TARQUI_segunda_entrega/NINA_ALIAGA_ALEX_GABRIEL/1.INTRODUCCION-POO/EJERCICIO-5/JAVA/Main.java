public class Main {
  public static void main(String[] args) {
    Estudiante e1 = new Estudiante("Juan", 7, 8);
    Estudiante e2 = new Estudiante("Pedro", 5, 4);
    Estudiante e3 = new Estudiante("Maria", 9, 10);

    System.out.println("El promedio de " + e1.getNombre() + " es " + e1.promedio() + " y " + e1.aprobo());
    System.out.println("El promedio de " + e2.getNombre() + " es " + e2.promedio() + " y " + e2.aprobo());
    System.out.println("El promedio de " + e3.getNombre() + " es " + e3.promedio() + " y " + e3.aprobo());

  }
}