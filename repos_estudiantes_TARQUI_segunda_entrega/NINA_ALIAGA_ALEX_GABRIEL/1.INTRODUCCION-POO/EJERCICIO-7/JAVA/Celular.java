import java.util.ArrayList;
import java.util.List;

class Celular {
    private List<Aplicacion> aplicaciones;
    private int espacioUsado;
    private int espacioTotal;
    private double bateria;

    public Celular() {
        this.aplicaciones = new ArrayList<>();
        this.espacioUsado = 0;
        this.espacioTotal = 1024;
        this.bateria = 100;
    }

    public void instalarAplicacion(String nombre, int tamaño) {
        if (aplicaciones.size() >= 20) {
            System.out.println("No se pueden instalar más de 20 aplicaciones.");
            return;
        }
        if (espacioUsado + tamaño > espacioTotal) {
            System.out.println("No hay suficiente espacio para instalar la aplicación.");
            return;
        }

        aplicaciones.add(new Aplicacion(nombre, tamaño));
        espacioUsado += tamaño;
        System.out.println("Aplicación " + nombre + " instalada con éxito.");
    }

    public void usarAplicacion(String nombre, int minutos) {
        if (bateria == 0) {
            System.out.println("Celular apagado. Por favor, cargue la batería.");
            return;
        }

        Aplicacion app = null;
        for (Aplicacion a : aplicaciones) {
            if (a.nombre.equals(nombre)) {
                app = a;
                break;
            }
        }

        if (app == null) {
            System.out.println("La aplicación no está instalada.");
            return;
        }

        double consumoBateria = 0;
        if (app.tamaño > 250) {
            consumoBateria = 0.05 * (minutos / 10);
        } else if (app.tamaño > 100) {
            consumoBateria = 0.02 * (minutos / 10);
        } else {
            consumoBateria = 0.01 * (minutos / 10);
        }

        bateria -= consumoBateria * 100;
        if (bateria < 0) {
            bateria = 0;
        }

        if (bateria == 0) {
            System.out.println("Celular apagado.");
        } else {
            System.out.println("Usando " + nombre + " por " + minutos + " minutos. Batería restante: " + String.format("%.2f", bateria) + "%");
        }
    }

    public void mostrarBateria() {
        System.out.println("Batería restante: " + String.format("%.2f", bateria) + "%");
    }
}