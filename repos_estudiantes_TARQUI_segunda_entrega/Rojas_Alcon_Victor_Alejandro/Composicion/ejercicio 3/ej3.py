class Parte:
    def __init__(self, nombre, peso):
        self._nombre = nombre
        self._peso = peso

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    @property
    def peso(self):
        return self._peso

    @peso.setter
    def peso(self, valor):
        self._peso = valor

    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")

class Avion:
    def __init__(self, modelo, fabricante):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []

    @property
    def modelo(self):
        return self._modelo

    @modelo.setter
    def modelo(self, valor):
        self._modelo = valor

    @property
    def fabricante(self):
        return self._fabricante

    @fabricante.setter
    def fabricante(self, valor):
        self._fabricante = valor

    def agregar_parte(self, parte):
        if isinstance(parte, Parte):
            self._partes.append(parte)

    def mostrar_avion(self):
        print(f"\nAvión: {self.modelo} | Fabricante: {self.fabricante}")
        if not self._partes:
            print("Sin partes registradas.")
        for parte in self._partes:
            parte.mostrar_info()

if __name__ == "__main__":
    avion = Avion("Boeing 737", "Boeing")
    avion.agregar_parte(Parte("Motor", 1500))
    avion.agregar_parte(Parte("Alas", 800))
    avion.agregar_parte(Parte("Tren de aterrizaje", 300))
    avion.mostrar_avion()