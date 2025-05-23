# Implementing the requested classes and demonstrating their use

class Habitacion:
    def __init__(self, nombre, tamaño):
        self._nombre = nombre
        self._tamaño = tamaño  # en m²

    # Getters
    @property
    def nombre(self):
        return self._nombre

    @property
    def tamaño(self):
        return self._tamaño

    # Setters
    @nombre.setter
    def nombre(self, value):
        self._nombre = value

    @tamaño.setter
    def tamaño(self, value):
        self._tamaño = value

    def mostrar_info(self):
        return f"Habitación: {self.nombre}, Tamaño: {self.tamaño} m²"


class Casa:
    def __init__(self, dirección):
        self._dirección = dirección
        self._habitaciones = []

    # Getters
    @property
    def dirección(self):
        return self._dirección

    @property
    def habitaciones(self):
        return self._habitaciones

    # Setters
    @dirección.setter
    def dirección(self, value):
        self._dirección = value

    def agregar_habitacion(self, habitacion):
        if isinstance(habitacion, Habitacion):
            self._habitaciones.append(habitacion)
        else:
            raise TypeError("Se debe agregar un objeto de tipo Habitacion")

    def mostrar_casa(self):
        info = [f"Dirección: {self.dirección}"]
        if self.habitaciones:
            info.append("Habitaciones:")
            for h in self.habitaciones:
                info.append("  - " + h.mostrar_info())
        else:
            info.append("No hay habitaciones registradas.")
        return "\n".join(info)


# b) Crear una casa y agregar varias habitaciones
casa = Casa("Calle 123, Ciudad Ejemplo")
casa.agregar_habitacion(Habitacion("Sala", 25))
casa.agregar_habitacion(Habitacion("Cocina", 12))
casa.agregar_habitacion(Habitacion("Dormitorio Principal", 20))
casa.agregar_habitacion(Habitacion("Baño", 8))

# c) Mostrar la información de la casa y sus habitaciones
print(casa.mostrar_casa())
