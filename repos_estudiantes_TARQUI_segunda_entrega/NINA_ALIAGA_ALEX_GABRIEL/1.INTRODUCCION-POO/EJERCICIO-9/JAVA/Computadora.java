import java.util.ArrayList;
import java.util.List;


class Computadora {
    private boolean estado;
    private List<Componente> componentes;

    public Computadora() {
        this.estado = false;
        this.componentes = new ArrayList<>();
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("La computadora está apagada.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public void mostrarEstado() {
        if (estado) {
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora está apagada.");
        }
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
        System.out.println("Componente " + componente.getNombre() + " agregado.");
    }

}