class Habitacion:
    def __init__(self, nombre, tamaño):
        self._nombre = nombre
        self._tamaño = tamaño  # en metros cuadrados

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_tamaño(self):
        return self._tamaño

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_tamaño(self, tamaño):
        self._tamaño = tamaño

    # Método para mostrar la información de la habitación
    def mostrar_info(self):
        print(f"Habitación: {self._nombre}, Tamaño: {self._tamaño} m²")


class Casa:
    def __init__(self, direccion):
        self._direccion = direccion
        self._habitaciones = []

    # Getters
    def get_direccion(self):
        return self._direccion

    def get_habitaciones(self):
        return self._habitaciones

    # Setters
    def set_direccion(self, direccion):
        self._direccion = direccion

    # Método para agregar una habitación a la casa
    def agregar_habitacion(self, habitacion):
        if isinstance(habitacion, Habitacion):
            self._habitaciones.append(habitacion)
        else:
            print("Error: solo se pueden agregar objetos de tipo Habitacion.")

    # Método para mostrar la información de la casa y sus habitaciones
    def mostrar_casa(self):
        print(f"Dirección de la casa: {self._direccion}")
        print("Habitaciones:")
        for hab in self._habitaciones:
            hab.mostrar_info()


# ==== Prueba del código ====

# Crear habitaciones
hab1 = Habitacion("Sala", 20)
hab2 = Habitacion("Cocina", 10)
hab3 = Habitacion("Dormitorio", 15)
hab4 = Habitacion("Baño", 5)

# Crear la casa
mi_casa = Casa("Av. Siempre Viva 742")

# Agregar habitaciones a la casa
mi_casa.agregar_habitacion(hab1)
mi_casa.agregar_habitacion(hab2)
mi_casa.agregar_habitacion(hab3)
mi_casa.agregar_habitacion(hab4)

# Mostrar información de la casa
mi_casa.mostrar_casa()
