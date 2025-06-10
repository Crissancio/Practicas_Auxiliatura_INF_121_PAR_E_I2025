// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//8. Realiza la abstracción de un Banco que atiende a 10 usuarios con cuenta de ahorros
//a) Crea un método para agregar un usuario
//b) Realiza un método para que un usuario pueda retirar dinero del banco
//c) Realiza un método para que un usuario pueda guardar dinero en el banco
//d) Dales a los usuarios un 2% de bono en sus cuentas respecto a su saldo
//e) Muestra el total de dinero que posee el banco

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Operaciones bancarias:");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Mostrar saldo");
        System.out.println("4. Salir");

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nSeleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado. Saldo actual: " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro realizado. Saldo actual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente. No se pudo realizar el retiro.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + saldo);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Gracias por usar nuestro servicio bancario.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}

// no entendi bien como hacer esa pregunta en java y me guie con un video de youtube
