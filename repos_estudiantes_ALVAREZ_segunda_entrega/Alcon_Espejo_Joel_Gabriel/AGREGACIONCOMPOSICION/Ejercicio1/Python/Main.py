class Habitacion:
    def __init__(self, nombre, tamaño):
        self._nombre = nombre
        self._tamaño = tamaño
    
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
    def __init__(self, direccion):
        self._direccion = direccion
        self._habitaciones = []
    
    # Getters
    @property
    def direccion(self):
        return self._direccion
    
    @property
    def habitaciones(self):
        return self._habitaciones
    
    # Setters
    @direccion.setter
    def direccion(self, value):
        self._direccion = value
    
    def agregar_habitacion(self, habitacion):
        if isinstance(habitacion, Habitacion):
            self._habitaciones.append(habitacion)
        else:
            raise ValueError("El objeto debe ser de tipo Habitacion")
    
    def mostrar_casa(self):
        info = f"Casa en: {self.direccion}\nHabitaciones:\n"
        for i, habitacion in enumerate(self.habitaciones, 1):
            info += f"  {i}. {habitacion.mostrar_info()}\n"
        return info


# b) Crear una casa y agregar habitaciones
mi_casa = Casa("Calle Falsa 123, Springfield")

# Crear habitaciones
sala = Habitacion("Sala de estar", 20)
cocina = Habitacion("Cocina", 15)
baño = Habitacion("Baño principal", 8)
dormitorio = Habitacion("Dormitorio principal", 18)

# Agregar habitaciones a la casa
mi_casa.agregar_habitacion(sala)
mi_casa.agregar_habitacion(cocina)
mi_casa.agregar_habitacion(baño)
mi_casa.agregar_habitacion(dormitorio)

# c) Mostrar información de la casa y sus habitaciones
print(mi_casa.mostrar_casa())