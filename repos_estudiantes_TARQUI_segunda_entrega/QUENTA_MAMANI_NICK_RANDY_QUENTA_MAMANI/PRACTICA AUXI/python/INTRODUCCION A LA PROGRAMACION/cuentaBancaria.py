"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"8. Realiza la abstracción de un Banco que atiende a 10 usuarios con cuenta de ahorros"
"a) Crea un método para agregar un usuario"
"b) Realiza un método para que un usuario pueda retirar dinero del banco"
"c) Realiza un método para que un usuario pueda guardar dinero en el banco"
"d) Dales a los usuarios un 2% de bono en sus cuentas respecto a su saldo"
"e) Muestra el total de dinero que posee el banco"

from abc import ABC, abstractmethod

class CuentaBancaria(ABC):
    def __init__(self, nombre, saldo):
        self.nombre = nombre
        self.saldo = saldo

    @abstractmethod
    def depositar(self, cantidad):
        pass

    @abstractmethod
    def retirar(self, cantidad):
        pass

    def mostrar_saldo(self):
        print(f"{self.nombre} tienes: {self.saldo:.2f}")


class CuentaAhorro(CuentaBancaria):
    def depositar(self, cantidad):
        self.saldo += cantidad
        print(f"{self.nombre} deposito {cantidad:.2f}. Saldo actual: {self.saldo:.2f}")

    def retirar(self, cantidad):
        if cantidad <= self.saldo:
            self.saldo -= cantidad
            print(f"{self.nombre} retiro {cantidad:.2f}. Saldo actual: {self.saldo:.2f}")
        else:
            print(f"{self.nombre} no tienes mucho dinero {cantidad:.2f}.")


if __name__ == "__main__":
    cuenta = CuentaAhorro("johan", 1000.00)


    cuenta.depositar(200)
    cuenta.retirar(100)
    cuenta.mostrar_saldo()
