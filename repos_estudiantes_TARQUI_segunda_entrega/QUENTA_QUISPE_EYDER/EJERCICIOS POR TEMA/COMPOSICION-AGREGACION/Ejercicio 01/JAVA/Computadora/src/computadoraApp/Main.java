public class Main {
    public static void main(String[] args) {
        Computadora pc = new Computadora("Dell");

        pc.agregarComponente(new Componente("Intel Core i7", "Procesador"));
        pc.agregarComponente(new Componente("16GB DDR4", "Memoria RAM"));
        pc.agregarComponente(new Componente("1TB SSD", "Disco Duro"));

        System.out.println("== Información de la Computadora ==");
        pc.mostrarComputadora();
    }
}