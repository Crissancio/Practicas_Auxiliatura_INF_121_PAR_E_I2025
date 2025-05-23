class Habitacion:
    def __init__(self, nombre: str, tamaño: float):
        self._nombre = nombre
        self._tamaño = tamaño

    def mostrar_info(self):
        print(f"Habitación: {self._nombre}, Tamaño: {self._tamaño} m²")

    def get_nombre(self) -> str:
        return self._nombre

    def set_nombre(self, nombre: str):
        self._nombre = nombre

    def get_tamaño(self) -> float:
        return self._tamaño

    def set_tamaño(self, tamaño: float):
        self._tamaño = tamaño


class Casa:
    def __init__(self, direccion: str):
        self._direccion = direccion
        self._habitaciones = []

    def agregar_habitacion(self, habitacion: Habitacion):
        self._habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Casa en: {self._direccion}")
        print("Habitaciones:")
        for habitacion in self._habitaciones:
            habitacion.mostrar_info()

    def get_direccion(self) -> str:
        return self._direccion

    def set_direccion(self, direccion: str):
        self._direccion = direccion


if __name__ == "__main__":
    mi_casa = Casa("Calle Principal 123")

    sala = Habitacion("Sala", 20.5)
    mi_casa.agregar_habitacion(sala)

    cocina = Habitacion("Cocina", 15.0)
    mi_casa.agregar_habitacion(cocina)

    dormitorio = Habitacion("Dormitorio Principal", 18.7)
    mi_casa.agregar_habitacion(dormitorio)

    mi_casa.mostrar_casa()