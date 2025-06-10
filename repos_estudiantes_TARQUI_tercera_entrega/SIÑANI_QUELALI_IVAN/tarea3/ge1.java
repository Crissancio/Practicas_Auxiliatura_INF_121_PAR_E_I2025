public class Caja<T> {
    private T objeto; 

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }
}

public class Main {
    public static void main(String[] args) {

        Caja<Integer> cajaEntera = new Caja<>();
        cajaEntera.guardar(42);
        System.out.println("Contenido de cajaEntera: " + cajaEntera.obtener());

        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola, mundo!");
        System.out.println("Contenido de cajaTexto: " + cajaTexto.obtener());
    }
}
//DIAGRAMA
//Clase Caja<T>
//---------------------------
//- objeto: T
//---------------------------
//+ guardar(T objeto): void
//+ obtener(): T
//---------------------------

//Clase Main
//---------------------------
//+ main(String[] args): void
//---------------------------
