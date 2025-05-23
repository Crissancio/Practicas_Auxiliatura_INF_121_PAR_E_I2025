package espacio;

import java.util.ArrayList;

class Celular {
    private ArrayList<Aplicacion> aplicaciones;
    private int espacioMaximo; 
    private int espacioUsado; 
    private int bateria; 

    public Celular() {
        this.aplicaciones = new ArrayList<>();
        this.espacioMaximo = 1024; 
        this.espacioUsado = 0;
        this.bateria = 100; 
    }

    public boolean instalarAplicacion(Aplicacion app) {
        if (aplicaciones.size() < 20 && (espacioUsado + app.getPeso() <= espacioMaximo)) {
            aplicaciones.add(app);
            espacioUsado += app.getPeso();
            System.out.println("Aplicación " + app.getNombre() + " instalada.");
            return true;
        } else {
            System.out.println("No se puede instalar la aplicación " + app.getNombre() + ". Espacio insuficiente o límite de aplicaciones alcanzado.");
            return false;
        }
    }

    public void utilizarAplicacion(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado.");
            return;
        }

        Aplicacion app = buscarAplicacion(nombre);
        if (app != null) {
            int peso = app.getPeso();
            int consumoBateria = calcularConsumoBateria(peso, minutos);

            if (bateria - consumoBateria < 0) {
                System.out.println("No hay suficiente batería para utilizar la aplicación " + nombre + ".");
                return;
            }

            bateria -= consumoBateria;
            System.out.println("Se ha utilizado la aplicación " + nombre + " durante " + minutos + " minutos. Batería restante: " + bateria + "%.");
        } else {
            System.out.println("La aplicación " + nombre + " no está instalada.");
        }
    }

    private Aplicacion buscarAplicacion(String nombre) {
        for (Aplicacion app : aplicaciones) {
            if (app.getNombre().equals(nombre)) {
                return app;
            }
        }
        return null;
    }

    private int calcularConsumoBateria(int peso, int minutos) {
        int consumoPor10Minutos;
        if (peso > 250) {
            consumoPor10Minutos = 5;
        } else if (peso > 100) {
            consumoPor10Minutos = 2;
        } else {
            consumoPor10Minutos = 1;
        }
        return (minutos / 10) * consumoPor10Minutos;
    }

    public int getBateriaRestante() {
        return bateria;
    }
}

