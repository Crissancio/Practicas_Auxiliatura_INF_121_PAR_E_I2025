#a)
class Habitacion:
    def __init__(self,nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño
    
    def __str__(self):
        return f'-----------------------Habitacion------------------- \n Habitacion: {self.nombre}, Tamaño: {self.tamaño} metros cuadrados\n'

    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
        
    def getTamaño(self):	
        return self.tamaño
    def setTamaño(self,tamaño):
        self.tamaño = tamaño
    
class Casa:
    def __init__(self,direccion):
        self.direccion = direccion
        self.habitaciones = []
        
    def agregar_habitacion(self, nombre,tamaño):
        self.habitaciones.append(Habitacion(nombre,tamaño))
    
    def __str__(self):
        print( "---------------------------Casa------------------------- \n")
        cad = ""
        for habitacion in self.habitaciones:
            cad += str(habitacion)
        return f"Dirección: {self.direccion} \n Habitaciones:\n{cad} \n"
    
    def getDireccion(self):
        return self.direccion
    
    def setDireccion(self,direccion):
        self.direccion = direccion
    
    def getHabitaciones(self):
        return self.habitaciones
    
    def setHabitaciones(self,habitaciones):
        self.habitaciones = habitaciones
    
#Main
#b)
casa = Casa("Calle Falsa 123")
casa.agregar_habitacion("Habitacion 1", 20)
casa.agregar_habitacion("Habitacion 2", 25)
casa.agregar_habitacion("Habitacion 3", 30)
#c)
print(casa)
