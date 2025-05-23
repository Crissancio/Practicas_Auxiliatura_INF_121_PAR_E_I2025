public class Main {
    public static void main(String[] args) {

        Oficina oficina1 = new Oficina(5, 3, 2);
        Oficina oficina2 = new Oficina(4, 2, 3);
        Aula aula1 = new Aula("Aula Magna", 50, 30);
        Aula aula2 = new Aula("Aula 101", 30, 20);
        Laboratorio laboratorio1 = new Laboratorio("Lab de Química", 20, 10, 20);

        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio1.mostrar();

        System.out.println("Cantidad de muebles en Oficina 1: " + oficina1.cantidadMuebles());
        System.out.println("Cantidad de muebles en Oficina 2: " + oficina2.cantidadMuebles());
        System.out.println("Cantidad de muebles en Aula Magna: " + aula1.cantidadMuebles());
        System.out.println("Cantidad de muebles en Aula 101: " + aula2.cantidadMuebles());
        System.out.println("Cantidad de muebles en Lab de Química: " + laboratorio1.cantidadMuebles());
    }
}