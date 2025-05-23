class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    def __str__(self):
        return f"Habitacion: [ {self.nombre}, {self.tamaño} m² ]"


class Casa:
    def __init__(self, direccion, habitacion):
        self.direccion = direccion
        self.habitacion = habitacion

    def __str__(self):
        return f"Casa [ {self.direccion}, {self.habitacion} ]"



habitacion1 = Habitacion("Sala", 25.0)
habitacion2 = Habitacion("Cocina", 15.0)
casa1 = Casa("Calle Linares", habitacion1)
casa2 = Casa("Calle Brujas", habitacion2)

print(casa1)
print(casa2)