'''
1. Sean las siguientes clases:
Habitación<nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa<dirección, habitaciones (lista de objetos de tipo Habitación) 
Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la 
dirección y la información de todas las habitaciones)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una casa y agrega varias habitaciones.
c) Muestra la información de la casa y sus habitaciones.
'''

# a)
class Habitación:
    def __init__(self, n, t):
        self._nombre = n
        self._tamaño = t
    
    def getNombre(self):
        return self._nombre
    
    def setNombre(self, nombre):
        self._nombre = nombre
    
    def getTamaño(self):
        return self._tamaño
    
    def setTamaño(self, tamaño):
        self._tamaño = tamaño
    
    def mostrar_info(self):
        print("habitación:", self._nombre)
        print("tamaño:", self._tamaño, "m²")

# a)
class Casa:
    def __init__(self, d):
        self._direccion = d
        self._habitaciones = []
    
    def getDireccion(self):
        return self._direccion
    
    def setDireccion(self, direccion):
        self._direccion = direccion
    
    def agregar_habitacion(self, x):
        self._habitaciones.append(x)
    
    def mostrar_casa(self):
        print("Casa:")
        print("dirección:", self._direccion)
        print("\nhabitaciones de la casa:")
        if not self._habitaciones:
            print("la casa no tiene habitaciones")
        else:
            for a in self._habitaciones:
                a.mostrar_info()


if __name__ == "__main__":
    # b) Creando una casa
    c1 = Casa("zona 1ro de mayo plan 50 mzno k nro 11")
    h1 = Habitación("dormitorio niños", 20.5)
    h2 = Habitación("sala", 12.0)
    h3 = Habitación("cocina", 15.75)
    h4 = Habitación("baño", 8.0)
    
    # b) Agregando habitaciones a la casa
    c1.agregar_habitacion(h1)
    c1.agregar_habitacion(h2)
    c1.agregar_habitacion(h3)
    c1.agregar_habitacion(h4)
    
    # c) Mostrando información de la casa y sus habitaciones
    c1.mostrar_casa()
