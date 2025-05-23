package HERENCIA.Ejer1.codigo;

//1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
//características:
//Vehículo<marca, modelo, año, precio_base>
//Métodos: mostrar_info() muestra la información básica del vehículo
//Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
//Métodos: mostrar_info() debe mostrar la información básica más los
//atributos adicionales
//Moto (hereda de Vehículo)< cilindrada, tipo_motor>
//Métodos: mostrar_info() debe mostrar la información básica más los
//atributos adicionales
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea instancias de Coche y Moto y muestra su información usando el
//método mostrar_info().
//c) Muestra todos los coches que tienen más de 4 puertas.
//d) Mostrar los coches y motos actuales (gestión 2025).


public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Moto moto = new Moto("Yamaha", "MT-07", 2019, 7000, 689, "2 cilindros en paralelo");

        Main main = new Main();

        System.out.println(" ------- Información del coche --------");
        coche.mostrar_info();
        main.mostrarModelo(coche);
        main.mostrarCoche(coche);
        System.out.println("\n ------- Información de la moto --------");
        moto.mostrar_info();
        main.mostrarModelo(moto);
    
    }
    public int mostrarModelo(Vehiculo vehiculo) {
        if (vehiculo.getAño() == 2025) {
            System.out.println("Es ultimo modelo");
        } else {
            System.out.println("No es el ultimo modelo");
        }
        return 0;       
    }
    public int mostrarCoche(Coche coche) {
        if (coche.getNum_puertas() == 4) {
            System.out.println("Es un coche de 4 puertas");
        } else {
            System.out.println("No es un coche de 4 puertas");
        }
        return 0;       
    }
    
}
