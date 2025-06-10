// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//8. Para la reserva de habitaciones se guía por las siguientes clases:
//
//a) Instanciar 1 objeto de cada tipo de habitación
//b) Implementa el método calcularCosto(int noches), sobrescribiéndolo en
//HabitacionSimple, HabitacionDoble y Suite, aplicando distintos costos por
//noche.
//c) Sobrecarga el método reservar() permitiendo reservar con diferentes
//parámetros (por número de noches o incluyendo el número de personas).


public class Habitacion {
    private String tipo;
    private int nroHabitacion;

    public Habitacion(String tipo, int nroHabitacion) {
        this.tipo = tipo;
        this.nroHabitacion = nroHabitacion;
    }

    public void calcularCosto() {
        System.out.println("Habitacion costo.");
    }

    public void calcularCosto(int noches) {
        double costo = 0;
        if (tipo.equals("Simple")) {
            costo = noches * 50;
        } else if (tipo.equals("Doble")) {
            costo = noches * 80;
        } else if (tipo.equals("Suite")) {
            costo = noches * 150;
        }
        System.out.println("El costo para " + noches + " noches es: $" + costo);
    }

    public void calcularCosto(int noches, int personas) {
        double costo = 0;
        if (tipo.equals("Simple")) {
            if (personas > 1) {
                System.out.println("Excede la capacidad máxima para una habitación simple.");
                return;
            }
            costo = noches * 50;
        } else if (tipo.equals("Doble")) {
            if (personas > 2) {
                System.out.println("Excede la capacidad máxima para una habitación doble.");
                return;
            }
            costo = noches * 80;
        } else if (tipo.equals("Suite")) {
            if (personas > 4) {
                System.out.println("Excede la capacidad máxima para una suite.");
                return;
            }
            costo = noches * 150;
        }
        System.out.println("El costo para " + noches + " noches con " + personas + " personas es: $" + costo);
    }

    public static class HabitacionSimple extends Habitacion {
        public HabitacionSimple(int nroHabitacion) {
            super("Simple", nroHabitacion);
        }
    }

    public static class HabitacionDoble extends Habitacion {
        public HabitacionDoble(int nroHabitacion) {
            super("Doble", nroHabitacion);
        }
    }

    public static class Suite extends Habitacion {
        public Suite(int nroHabitacion) {
            super("Suite", nroHabitacion);
        }
    }

    public static void main(String[] args) {

        HabitacionSimple simple = new HabitacionSimple(101);
        HabitacionDoble doble = new HabitacionDoble(102);
        Suite suite = new Suite(201);

        System.out.println("Cálculo de costos:");
        simple.calcularCosto(3);
        doble.calcularCosto(2);
        suite.calcularCosto(5, 3);
        suite.calcularCosto(5, 5);
    }
}
