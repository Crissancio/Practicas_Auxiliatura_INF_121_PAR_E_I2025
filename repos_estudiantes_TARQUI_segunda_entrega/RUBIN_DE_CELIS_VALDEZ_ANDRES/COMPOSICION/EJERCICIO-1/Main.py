from casa import Casa
from habitacion import Habitacion

casa = Casa("Calle Los Pinos #123")
casa.agregar_habitacion(Habitacion("Sala", 20))
casa.agregar_habitacion(Habitacion("Cocina", 12))
casa.agregar_habitacion(Habitacion("Dormitorio", 15))
casa.agregar_habitacion(Habitacion("Baño", 6))

casa.mostrar_casa()
