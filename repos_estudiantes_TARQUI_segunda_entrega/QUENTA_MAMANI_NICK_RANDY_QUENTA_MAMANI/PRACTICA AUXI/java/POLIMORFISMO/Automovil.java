// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//4. Sean las siguientes clases que detallan 2 tipos de automóviles:
//
//a) Instanciar 2 objetos Bus y 1 objeto Camioneta
//b) Sobrecargar el método asignarConductor() en Camioneta, donde primero solo
//se añada el nombre del conductor, y el segundo añada al conductor y pida
//años de experiencia para mostrarlo junto a su nombre.
//c) Sobrecargar el método registrarViaje() en Bus, donde se pida una distancia y
//esta misma se aumente al kilometraje, y en otro que se pida distancia, lugar de
//destino y nroPasajeros


public class Automovil {
    protected String modelo;
    protected String placa;
    protected String conductor;
    protected double kilometraje;

    public Automovil(String modelo, String placa, String conductor, double kilometraje) {
        this.modelo = modelo;
        this.placa = placa;
        this.conductor = conductor;
        this.kilometraje = kilometraje;
    }

    public void registrarViaje(double distancia) {
        kilometraje += distancia;
        System.out.println("Viaje : " + kilometraje);
    }

    public void mostrar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Conductor: " + conductor);
        System.out.println("Kilometraje: " + kilometraje);
    }

    public static class Bus extends Automovil {
        private int nroPasajeros;

        public Bus(String modelo, String placa, String conductor, double kilometraje, int nroPasajeros) {
            super(modelo, placa, conductor, kilometraje);
            this.nroPasajeros = nroPasajeros;
        }

        public void registrarViaje(double distancia, String destino, int nroPasajeros) {
            kilometraje += distancia;
            this.nroPasajeros = nroPasajeros;
            System.out.println("Viaje a " + destino + ". Kilometraje: " + kilometraje + ", pasajeros: " + nroPasajeros);
        }
    }

    public static class Camioneta extends Automovil {
        public Camioneta(String modelo, String placa, String conductor, double kilometraje) {
            super(modelo, placa, conductor, kilometraje);
        }

        public void asignarConductor(String nombreConductor) {
            conductor = nombreConductor;
            System.out.println("Conductor asignado: " + conductor);
        }
    }

    public static void main(String[] args) {

        Bus bus = new Bus("CABUS", "123ABC", "Carlitos", 5000, 40);
        Camioneta camioneta = new Camioneta("VOLVO", "789GHI", "PERIRITO", 7000);

        System.out.println("Info de los vehículos:");
        bus.mostrar();
        camioneta.mostrar();

        System.out.println("Registrar viaje:");
        bus.registrarViaje(100, "La Paz", 50);
        camioneta.registrarViaje(200);

        System.out.println("Asignar conductor:");
        camioneta.asignarConductor("Ser ZE");
    }
}
