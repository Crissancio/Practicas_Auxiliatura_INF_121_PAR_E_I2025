from abc import ABC, abstractmethod

class Ambiente(ABC):

    def mostrar(self):
        pass

    def cantidadMuebles(self):
        pass

class Oficina(Ambiente):
    def __init__(self, sillas, escritorios, estanterias):
        self.sillas = sillas
        self.escritorios = escritorios
        self.estanterias = estanterias

    def mostrar(self):
        print(f"Oficina con {self.sillas} sillas, {self.escritorios} escritorios, {self.estanterias} estanterías.")

    def cantidadMuebles(self):
        return self.sillas + self.escritorios + self.estanterias

class Aula(Ambiente):
    def __init__(self, nombre, capacidad, pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.pupitres = pupitres

    def mostrar(self):
        print(f"Aula '{self.nombre}' con capacidad para {self.capacidad} personas y {self.pupitres} pupitres.")

    def cantidadMuebles(self):
        return self.pupitres

class Laboratorio(Ambiente):
    def __init__(self, nombre, capacidad, mesas, sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.mesas = mesas
        self.sillas = sillas

    def mostrar(self):
        print(f"Laboratorio '{self.nombre}' con capacidad para {self.capacidad} personas, {self.mesas} mesas y {self.sillas} sillas.")

    def cantidadMuebles(self):
        return self.mesas + self.sillas

if __name__ == "__main__":
    ambientes = [
        Oficina(4, 3, 2),
        Oficina(5, 2, 1),
        Aula("Aula 101", 30, 25),
        Aula("Aula 202", 40, 35),
        Laboratorio("Lab de Informática", 20, 10, 10)
    ]

    for ambiente in ambientes:
        ambiente.mostrar()
        print("Cantidad de muebles:", ambiente.cantidadMuebles())
        print()
