class Habitacion:
    def __init__(self, nombre, tamano): 
        self._nombre = nombre
        self._tamano = tamano

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    @property
    def tamano(self):
        return self._tamano

    @tamano.setter
    def tamano(self, valor):
        self._tamano = valor

    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamano} m²")

class Casa:
    def __init__(self, direccion):  
        self._direccion = direccion
        self._habitaciones = []

    @property
    def direccion(self):
        return self._direccion

    @direccion.setter
    def direccion(self, valor):
        self._direccion = valor

    def agregar_habitacion(self, habitacion):
        if isinstance(habitacion, Habitacion):
            self._habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"\n--- Casa en {self.direccion} ---")
        if not self._habitaciones:
            print("No hay habitaciones registradas.")
        for hab in self._habitaciones:
            hab.mostrar_info()

if __name__ == "__main__":
    casa = Casa("Calle Ruiz Orellana 1233")
    casa.agregar_habitacion(Habitacion("Sala", 25))
    casa.agregar_habitacion(Habitacion("Cocina", 12))
    casa.agregar_habitacion(Habitacion("Dormitorio", 18))
    casa.mostrar_casa()