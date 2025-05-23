public class Main {
    
    public static void main(String[] args) {
        Computadora miComputadora = new Computadora();

        miComputadora.agregarComponente(new Componente("CPU"));
        miComputadora.agregarComponente(new Componente("RAM"));
        miComputadora.agregarComponente(new Componente("Disco Duro"));

        miComputadora.mostrarEstado();
        miComputadora.encender();
        miComputadora.mostrarEstado();
        miComputadora.apagar();
        miComputadora.mostrarEstado();
    }
}