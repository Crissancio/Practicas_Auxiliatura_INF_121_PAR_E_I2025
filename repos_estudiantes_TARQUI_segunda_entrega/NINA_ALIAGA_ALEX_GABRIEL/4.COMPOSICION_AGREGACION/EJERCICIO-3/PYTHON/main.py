from typing import List

class Parte:
    def __init__(self, nombre: str, peso: int):
        self.nombre = nombre
        self.peso = peso

    def mostrarInfo(self):
        print(f"Nombre: {self.nombre}, Peso: {self.peso}")


class Avion:
    def __init__(self, modelo: str, fabricante: str):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes: List[Parte] = [] 

    def getCantidadPartes(self) -> int:
        return len(self.partes)

    def agregarParte(self, parte: Parte):
        self.partes.append(parte)

    def mostrarAvion(self):
        print(f"Modelo del avion: {self.modelo}, Fabricante: {self.fabricante}")
        for parte in self.partes:
            parte.mostrarInfo()


if __name__ == "__main__":
    avion = Avion("Boeing 747", "Boeing")

    ala = Parte("Ala", 1000)
    cola = Parte("Cola", 500)
    fuselaje = Parte("Fuselaje", 2000)
    motor = Parte("Motor", 1500)
    trenAterrizaje = Parte("Tren de Aterrizaje", 800)
    cabina = Parte("Cabina", 1200)
    timon = Parte("Timón", 300)
    estabilizador = Parte("Estabilizador", 400)
    parabrisas = Parte("Parabrisas", 200)
    asa = Parte("Asa", 100)
    rueda = Parte("Rueda", 50)

    avion.agregarParte(ala)
    avion.agregarParte(cola)
    avion.agregarParte(fuselaje)
    avion.agregarParte(motor)
    avion.agregarParte(trenAterrizaje)
    avion.agregarParte(cabina)
    avion.agregarParte(timon)
    avion.agregarParte(estabilizador)
    avion.agregarParte(parabrisas)
    avion.agregarParte(asa)
    avion.agregarParte(rueda)

    print(f"Cantidad de partes del avión: {avion.getCantidadPartes()}")
    avion.mostrarAvion()