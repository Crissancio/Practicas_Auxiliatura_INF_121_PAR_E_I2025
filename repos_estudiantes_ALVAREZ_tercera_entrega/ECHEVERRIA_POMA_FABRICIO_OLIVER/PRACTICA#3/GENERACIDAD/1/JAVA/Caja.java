import java.util.Optional;
//a)
public class Caja<T> {
    private Optional<T> contenido;

    public Caja() {
        contenido = Optional.empty();
    }
//a)
    public void guardar(T objeto) {
        contenido = Optional.of(objeto);
        System.out.println("Objeto guardado en la caja: " + objeto);
    }

    public Optional<T> obtener() {
        if (contenido.isPresent()) {
            System.out.println("Obteniendo objeto de la caja: " + contenido.get());
            return contenido;
        } else {
            System.out.println("La caja está vacía");
            return Optional.empty();
        }
    }

    public boolean estaVacia() {
        return !contenido.isPresent();
    }

    @Override
    public String toString() {
        return contenido.isPresent() 
            ? "Caja[" + contenido.get().getClass().getSimpleName() + "]: " + contenido.get()
            : "Caja vacía";
    }
}