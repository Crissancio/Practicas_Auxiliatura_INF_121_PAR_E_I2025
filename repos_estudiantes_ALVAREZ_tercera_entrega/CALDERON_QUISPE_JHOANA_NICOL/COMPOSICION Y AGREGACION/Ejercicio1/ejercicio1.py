class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño
        
    def mostrar_info(self):
        print(f"Habitacion: {self.nombre}, Tamaño: {self.tamaño} m²")
    
class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []
        
    def agregarhabitacion(self, nombre, tamaño):
        habitaciones = Habitacion(nombre, tamaño)
        self.habitaciones.append(habitaciones)
        
    def mostrarcasa(self):
        print(f"Dirección de la casa: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()
    
   
casa = Casa("Ciudad Satelite Plan 129 C-11A")


casa.agregarhabitacion("Sala", 20.5)
casa.agregarhabitacion("Cocina", 12.0)
casa.agregarhabitacion("Cuarto", 15.3)
casa.agregarhabitacion("Baño", 5.0)


casa.mostrarcasa()
