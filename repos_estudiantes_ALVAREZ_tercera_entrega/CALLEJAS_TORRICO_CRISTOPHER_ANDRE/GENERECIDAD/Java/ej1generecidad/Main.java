package ej1genericidad;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Callejas Torrico Cristopher");

        Caja<Integer> cajaNumerica = new Caja<>();
        cajaNumerica.guardar(13377384);

        System.out.println("Contenido de cajaTexto: " + cajaTexto.obtener());
        System.out.println("Contenido de cajaNumerica: " + cajaNumerica.obtener());
    }
}
