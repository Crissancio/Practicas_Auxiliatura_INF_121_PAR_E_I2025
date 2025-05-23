class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño
    
    def mostrar_info(self):
        print(f"Habitacion: {self.nombre}")
        print(f"Tamaño: {self.tamaño} m2")

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []
    
    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)
    
    def mostrar_casa(self):
        print("=== Casa ===")
        print(f"Direccion: {self.direccion}")
        print("\n=== Habitaciones ===")
        for hab in self.habitaciones:
            hab.mostrar_info()
            print("-------------------")

if __name__ == "__main__":
    mi_casa = Casa("Av. Siempre Viva 123")
    
    # Crear habitaciones (solo existen dentro de la casa)
    mi_casa.agregar_habitacion(Habitacion("Sala", 20.5))
    mi_casa.agregar_habitacion(Habitacion("Cocina", 12.0))
    mi_casa.agregar_habitacion(Habitacion("Dormitorio Principal", 15.75))
    
    mi_casa.mostrar_casa()