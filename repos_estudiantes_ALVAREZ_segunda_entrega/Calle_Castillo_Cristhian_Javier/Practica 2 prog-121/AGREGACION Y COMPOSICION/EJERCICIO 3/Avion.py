class Parte:
    def __init__(self, nombre, peso):
        self._nombre = nombre
        self._peso = peso

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_peso(self):
        return self._peso

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_peso(self, peso):
        self._peso = peso

    # Método para mostrar información
    def mostrar_info(self):
        print(f"Parte: {self._nombre}, Peso: {self._peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []

    # Getters
    def get_modelo(self):
        return self._modelo

    def get_fabricante(self):
        return self._fabricante

    def get_partes(self):
        return self._partes

    # Setters
    def set_modelo(self, modelo):
        self._modelo = modelo

    def set_fabricante(self, fabricante):
        self._fabricante = fabricante

    # Método para agregar una parte
    def agregar_parte(self, parte):
        if isinstance(parte, Parte):
            self._partes.append(parte)

    # Método para mostrar información del avión
    def mostrar_avion(self):
        print(f"Modelo del avión: {self._modelo}")
        print(f"Fabricante: {self._fabricante}")
        print("Partes del avión:")
        for p in self._partes:
            p.mostrar_info()

if __name__ == "__main__":
    # Crear partes del avión
    motor = Parte("Motor", 1200)
    ala_izquierda = Parte("Ala Izquierda", 800)
    ala_derecha = Parte("Ala Derecha", 800)
    tren_aterrizaje = Parte("Tren de Aterrizaje", 600)

    avion = Avion("Boeing 737", "Boeing")
    # Agregar partes al avión
    avion.agregar_parte(motor)
    avion.agregar_parte(ala_izquierda)
    avion.agregar_parte(ala_derecha)
    avion.agregar_parte(tren_aterrizaje)

    # Mostrar información del avión
    avion.mostrar_avion()
