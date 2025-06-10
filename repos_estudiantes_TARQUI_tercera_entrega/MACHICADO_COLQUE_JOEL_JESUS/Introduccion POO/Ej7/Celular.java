package Ej7;

public class Celular {
    private String[] nombresApps;
    private int[] tamanosApps;
    private int cantidadApps;
    private int espacioDisponible; 
    private double bateria;

    public Celular() {
        this.nombresApps = new String[20];
        this.tamanosApps = new int[20];
        this.cantidadApps = 0;
        this.espacioDisponible = 1024;
        this.bateria = 100.0;
    }

    public void instalarAplicacion(String nombre, int tamanoMb) {
        if (cantidadApps >= 20) {
            System.out.println("No se pueden instalar más de 20 aplicaciones.");
            return;
        }

        if (tamanoMb > espacioDisponible) {
            System.out.println("Espacio insuficiente para instalar la app.");
            return;
        }

        nombresApps[cantidadApps] = nombre;
        tamanosApps[cantidadApps] = tamanoMb;
        cantidadApps++;
        espacioDisponible -= tamanoMb;

        System.out.println("Aplicación instalada: " + nombre);
    }

    public void usarAplicacion(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. Conecte al cargador.");
            return;
        }

        int indice = -1;
        for (int i = 0; i < cantidadApps; i++) {
            if (nombresApps[i].equalsIgnoreCase(nombre)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Aplicación no encontrada.");
            return;
        }

        int peso = tamanosApps[indice];
        double consumoPor10min;

        if (peso > 250) {
            consumoPor10min = 5.0;
        } else if (peso > 100) {
            consumoPor10min = 2.0;
        } else {
            consumoPor10min = 1.0;
        }

        double consumoTotal = (minutos / 10.0) * consumoPor10min;

        if (consumoTotal >= bateria) {
            bateria = 0;
            System.out.println("Batería agotada durante el uso de la aplicación. Celular apagado.");
        } else {
            bateria -= consumoTotal;
            System.out.printf("Usaste %s por %d minutos. Batería restante: %.2f%%\n", nombre, minutos, bateria);
        }
    }

    public void mostrarBateria() {
        System.out.printf("Batería actual: %.2f%%\n", bateria);
    }
}
