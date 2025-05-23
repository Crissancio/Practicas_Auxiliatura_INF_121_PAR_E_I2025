#1. Sean las siguientes clases:
#Habitación<nombre, tamaño (en metros cuadrados)
#Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
#Casa<dirección, habitaciones (lista de objetos de tipo Habitación) Métodos:
#agregar_habitacion(habitacion), mostrar_casa() (muestra la dirección y la información de todas las habitaciones)
class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño  

    def mostrar_info(self):
        print(f"Habitación: {self.nombre}")
        print(f"Tamaño: {self.tamaño} m²")
        print("-------------------")

    # Getters y setters
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_tamaño(self):
        return self.tamaño

    def set_tamaño(self, tamaño):
        self.tamaño = tamaño



class Casa:
    def __init__(self, dirección):
        self.dirección = dirección
        self.habitaciones = []  

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)
        print(f"Se agregó '{habitacion.nombre}' a la casa en {self.dirección}")

    def mostrar_casa(self):
        print(f"\n ----- Casa en {self.dirección} -----")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()


    def get_direccion(self):
        return self.dirección

    def set_direccion(self, dirección):
        self.dirección = dirección



if __name__ == "__main__":
    # b) Crear una casa y agregar habitaciones
    mi_casa = Casa("Calle Random 333")

    # Crear habitaciones
    sala = Habitacion("Sala", 30.5)
    cocina = Habitacion("Cocina", 64.0)
    baño = Habitacion("Baño principal", 3.8)

    # Agregar habitaciones a la casa
    mi_casa.agregar_habitacion(sala)
    mi_casa.agregar_habitacion(cocina)
    mi_casa.agregar_habitacion(baño)

    # c) Mostrar información completa
    mi_casa.mostrar_casa()
