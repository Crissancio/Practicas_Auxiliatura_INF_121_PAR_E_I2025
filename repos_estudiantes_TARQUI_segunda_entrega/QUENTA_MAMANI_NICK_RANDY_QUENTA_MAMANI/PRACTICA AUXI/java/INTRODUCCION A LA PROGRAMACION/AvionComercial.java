// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//10. Realiza la abstracción de un avión
//a) Al avión desean subir una X cantidad de pasajeros, actualiza los datos del
//avión
//b) Verifica la cantidad de combustible disponible según la distancia de viaje (se
//gasta 12 litros de combustible por kilómetro de viaje)
//c) El vuelo se retrasó, actualiza la hora de vuelvo con 3 horas de retraso
//d) Crea una instancia y utiliza los métodos de los anteriores incisos

public class AvionComercial {
    public String modelo;
    public int capacidadPasajeros;
    public int combustibleDisponible;
    public int horaVuelo;

    public AvionComercial(String modelo, int capacidadPasajeros, int combustibleDisponible, int horaVuelo) {
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.combustibleDisponible = combustibleDisponible;
        this.horaVuelo = horaVuelo;
    }

    public void actualizarPasajeros(int cantidad) {
        if (cantidad <= capacidadPasajeros) {
            System.out.println("Capacidad suficiente para " + cantidad + " pasajeros.");
        } else {
            System.out.println("Capacidad insuficiente, Excede el límite de " + capacidadPasajeros + " pasajeros.");
        }
    }

    public void verificarCombustible(int distancia) {
        int combustibleNecesario = distancia * 12;
        if (combustibleNecesario <= combustibleDisponible) {
            System.out.println("El combustible es suficiente para recorrer " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente, Necesitaría " + (combustibleNecesario - combustibleDisponible) + " litros más.");
        }
    }

    public void retrasarVuelo() {
        horaVuelo += 3;
        System.out.println("El vuelo ha sido retrasado, Nueva hora de vuelo: " + horaVuelo + ":00.");
    }

    public void mostrarDatos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Combustible disponible: " + combustibleDisponible + " litros");
        System.out.println("Hora de vuelo: " + horaVuelo + ":00");
    }

    public static void main(String[] args) {

        AvionComercial avion = new AvionComercial("Boeing 747", 300, 5000, 14);

        System.out.println("Info avión:");
        avion.mostrarDatos();

        System.out.println("Operaciones:");
        avion.actualizarPasajeros(250);
        avion.verificarCombustible(400);
        avion.retrasarVuelo();
    }
}
