class Parte:
    def __init__(self, nombre, peso):
        self._nombre = nombre
        self._peso = peso

    def get_nombre(self):
        return self._nombre

    def get_peso(self):
        return self._peso

    def set_peso(self, nuevo_peso):
        self._peso = nuevo_peso

    def mostrar_info(self):
        print(f"Parte: {self._nombre}, Peso: {self._peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []

    def get_modelo(self):
        return self._modelo

    def set_modelo(self, nuevo_modelo):
        self._modelo = nuevo_modelo

    def get_fabricante(self):
        return self._fabricante

    def set_fabricante(self, nuevo_fabricante):
        self._fabricante = nuevo_fabricante

    def agregar_parte(self, parte):
        self._partes.append(parte)

    def mostrar_avion(self):
        print(f"\nInformación del Avión:")
        print(f"Modelo: {self._modelo}")
        print(f"Fabricante: {self._fabricante}")
        print("\nPartes del avión:")
        for parte in self._partes:
            parte.mostrar_info()


if __name__ == "__main__":
    avion_comercial = Avion("Boeing 747", "Boeing")

    motor = Parte("Motor JT9D", 4000)
    ala_izquierda = Parte("Ala izquierda", 1500)
    ala_derecha = Parte("Ala derecha", 1500)
    tren_aterrizaje = Parte("Tren de aterrizaje principal", 2500)

    avion_comercial.agregar_parte(motor)
    avion_comercial.agregar_parte(ala_izquierda)
    avion_comercial.agregar_parte(ala_derecha)
    avion_comercial.agregar_parte(tren_aterrizaje)

    avion_comercial.mostrar_avion()