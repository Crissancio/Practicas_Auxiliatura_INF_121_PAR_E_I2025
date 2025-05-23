class Habitacion:
    def __init__(self, nombre, tamano_m2):
        self.nombre = nombre
        self.tamano_m2 = tamano_m2

    def get_nombre(self):
        return self.nombre

    def get_tamano(self):
        return self.tamano_m2

    def set_nombre(self, nuevo_nombre):
        self.nombre = nuevo_nombre

    def set_tamano(self, nuevo_tamano):
        if nuevo_tamano > 0: 
            self.tamano_m2 = nuevo_tamano
        else:
            print("El tamaño debe ser un valor positivo.")

    def mostrar_info(self):

        print(f"  - Nombre: {self.nombre}")
        print(f"    Tamaño: {self.tamano_m2} m²")

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def get_direccion(self):
        return self.direccion

    def get_habitaciones(self):
        return self.habitaciones

    def set_direccion(self, nueva_direccion):
        self.direccion = nueva_direccion

    def agregar_habitacion(self, habitacion):
        if isinstance(habitacion, Habitacion): 
            self.habitaciones.append(habitacion)
            print(f"'{habitacion.get_nombre()}' agregada a la casa.")
        else:
            print("Solo se pueden agregar objetos de tipo 'Habitacion'.")

    def mostrar_casa(self):
        print("\n--- Información de la Casa ---")
        print(f"Dirección: {self.direccion}")
        if self.habitaciones:
            print("Habitaciones:")
            for habitacion in self.habitaciones:
                habitacion.mostrar_info()
        else:
            print("La casa no tiene habitaciones.")

mi_casa = Casa("Av. Principal 123, El Alto")

sala = Habitacion("Sala de Estar", 25.5)
cocina = Habitacion("Cocina", 15.0)
dormitorio_principal = Habitacion("Dormitorio Principal", 20.0)
bano = Habitacion("Baño", 6.2)

mi_casa.agregar_habitacion(sala)
mi_casa.agregar_habitacion(cocina)
mi_casa.agregar_habitacion(dormitorio_principal)
mi_casa.agregar_habitacion(bano)

mi_casa.agregar_habitacion("Esto no es una habitación")
mi_casa.mostrar_casa()
