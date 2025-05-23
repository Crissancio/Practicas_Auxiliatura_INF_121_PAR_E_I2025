class Habitacion:
    def __init__(self, nombre="Sin Nombre", tamaño=0.0):
        self._nombre = nombre
        self._tamaño = tamaño

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

    def mostrar_info(self):
        print(f"  Nombre: {self._nombre}, Tamaño: {self._tamaño} m^2")

class Casa:
    def __init__(self, dirección="Sin Dirección"):
        self._dirección = dirección
        self._habitaciones = []

    # Getter
    def get_dirección(self):
        return self._dirección

    def get_habitaciones(self):
        return self._habitaciones

    # Setter
    def set_dirección(self, dirección):
        self._dirección = dirección

    def agregar_habitacion(self, habitacion):
        if isinstance(habitacion, Habitacion):
            self._habitaciones.append(habitacion)
        else:
            print("Error: Solo se pueden agregar objetos de tipo Habitacion.")

    def mostrar_casa(self):
        print(f"Dirección de la Casa: {self._dirección}")
        print("Habitaciones:")
        for habitacion in self._habitaciones:
            habitacion.mostrar_info()

# b) Crea una casa y agrega varias habitaciones.
mi_casa = Casa(dirección="Calle Siempre Viva #742")

habitacion1 = Habitacion(nombre="Dormitorio Principal", tamaño=25.5)
habitacion2 = Habitacion(nombre="Sala de Estar", tamaño=35.0)
habitacion3 = Habitacion(nombre="Cocina", tamaño=18.2)
habitacion4 = Habitacion(nombre="Baño", tamaño=8.0)

mi_casa.agregar_habitacion(habitacion1)
mi_casa.agregar_habitacion(habitacion2)
mi_casa.agregar_habitacion(habitacion3)
mi_casa.agregar_habitacion(habitacion4)

# Intentando agregar un objeto de tipo incorrecto (esto mostrará el error)
# mi_casa.agregar_habitacion("Esto no es una habitación")

# c) Muestra la información de la casa y sus habitaciones.
print("\n--- Información de la Casa ---")
mi_casa.mostrar_casa()
