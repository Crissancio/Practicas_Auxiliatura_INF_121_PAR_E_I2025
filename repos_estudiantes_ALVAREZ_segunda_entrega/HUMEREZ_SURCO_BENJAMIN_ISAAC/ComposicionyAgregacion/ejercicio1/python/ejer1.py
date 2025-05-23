#1. Sean las siguientes clases:
#Habitación<nombre, tamaño (en metros cuadrados)
#Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
#Casa<dirección, habitaciones (lista de objetos de tipo Habitación)
#Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
#dirección y la información de todas las habitaciones)
#a) Implementa las clases con sus constructores, getters y setters.
#b) Crea una casa y agrega varias habitaciones.
#c) Muestra la información de la casa y sus habitaciones.

class Habitacion:
    def __init__(self, nombre, tamaño):
        self._nombre = nombre
        self._tamaño = tamaño

    
    def get_nombre(self):
        return self._nombre

    def get_tamaño(self):
        return self._tamaño

    
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_tamaño(self, tamaño):
        self._tamaño = tamaño

    def mostrar_info(self):
        print(f"Habitación: {self._nombre}, Tamaño: {self._tamaño} m²")

class Casa:
    def __init__(self, direccion):
        self._direccion = direccion
        self._habitaciones = []

    
    def get_direccion(self):
        return self._direccion

    
    def set_direccion(self, direccion):
        self._direccion = direccion

    def agregar_habitacion(self, habitacion):
        self._habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección de la casa: {self._direccion}")
        print("Habitaciones:")
        for habitacion in self._habitaciones:
            habitacion.mostrar_info()


if __name__ == "__main__":
    habitacion1 = Habitacion("Dormitorio Principal", 20)
    habitacion2 = Habitacion("Sala de Estar", 30)
    habitacion3 = Habitacion("Cocina", 15)

    mi_casa = Casa("Calle Falsa 123")
    mi_casa.agregar_habitacion(habitacion1)
    mi_casa.agregar_habitacion(habitacion2)
    mi_casa.agregar_habitacion(habitacion3)

    mi_casa.mostrar_casa()