package componentes;

public class Main {
    public static void main(String[] args) {
        Computadora miComputadora = new Computadora("Intel i7", 16, 512);

        miComputadora.mostrarComponentes();

        miComputadora.mostrarEstado(); 
        miComputadora.encender();       
        miComputadora.mostrarEstado();  
        miComputadora.apagar();         
        miComputadora.mostrarEstado();  
    }
}
