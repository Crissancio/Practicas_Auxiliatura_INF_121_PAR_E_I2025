"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"10. Realiza la abstracción de un avión"
"a) Al avión desean subir una X cantidad de pasajeros, actualiza los datos del avión"
"b) Verifica la cantidad de combustible disponible según la distancia de viaje (se gasta 12 litros de combustible por kilómetro de viaje)"
"c) El vuelo se retrasó, actualiza la hora de vuelvo con 3 horas de retraso"
"d) Crea una instancia y utiliza los métodos de los anteriores incisos"

from abc import ABC, abstractmethod

class Avion(ABC):
    def __init__(self, modelo, capacidad_pasajeros, combustible_disponible, hora_vuelo):
        self.modelo = modelo
        self.capacidad_pasajeros = capacidad_pasajeros
        self.combustible_disponible = combustible_disponible
        self.hora_vuelo = hora_vuelo

    @abstractmethod
    def actualizar_pasajeros(self, cantidad):
        pass

    @abstractmethod
    def verificar_combustible(self, distancia):
        pass

    @abstractmethod
    def retrasar_vuelo(self):
        pass

class AvionComercial(Avion):
    def actualizar_pasajeros(self, cantidad):
        print(f"{'Capacidad suficiente' if cantidad <= self.capacidad_pasajeros else 'Capacidad insuficiente'} para {cantidad} pasajeros.")

    def verificar_combustible(self, distancia):
        print(f"{'Suficiente' if distancia * 12 <= self.combustible_disponible else 'Insuficiente'} combustible para {distancia} km.")

    def retrasar_vuelo(self):
        self.hora_vuelo += 3
        print(f"Hora de vuelo retrasada a las {self.hora_vuelo}:00.")


avion = AvionComercial("Boeing 747", 300, 5000, 14)
avion.actualizar_pasajeros(250)
avion.verificar_combustible(400)
avion.retrasar_vuelo()
