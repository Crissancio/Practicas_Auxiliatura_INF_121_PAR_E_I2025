
class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano
    
    def get_nombre(self):
        return self.nombre
    
    def get_tamano(self):
        return self.tamano
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def set_tamano(self, tamano):
        self.tamano = tamano
    
    def mostrar_info(self):
        return f"Habitacion: {self.nombre}, Tamano: {self.tamano} metros "

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []
    
    def get_direccion(self):
        return self.direccion
    
    def get_habitaciones(self):
        return self.habitaciones
    
    def set_direccion(self, direccion):
        self.direccion = direccion
    
    def set_habitaciones(self, habitaciones):
        self.habitaciones = habitaciones
    
    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)
    
    def mostrar_casa(self):
        print(f"Casa ubicada en: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            print(f"  - {habitacion.mostrar_info()}")
        print(f"Total de habitaciones: {len(self.habitaciones)}")

dormitorio_principal = Habitacion("Dormitorio Principal", 25)
dormitorio_ninos = Habitacion("Dormitorio de Ninos", 18)
sala = Habitacion("Sala", 30)
cocina = Habitacion("Cocina", 15)
bano_principal = Habitacion("Bano Principal", 8)
bano_visitas = Habitacion("Bano de Visitas", 6)
comedor = Habitacion("Comedor", 20)
garage = Habitacion("Garage", 35)

casa_mamani = Casa("Calle Warnes N 1245, Zona Villa Fatima, La Paz")

casa_mamani.agregar_habitacion(dormitorio_principal)
casa_mamani.agregar_habitacion(dormitorio_ninos)
casa_mamani.agregar_habitacion(sala)
casa_mamani.agregar_habitacion(cocina)
casa_mamani.agregar_habitacion(bano_principal)
casa_mamani.agregar_habitacion(bano_visitas)
casa_mamani.agregar_habitacion(comedor)
casa_mamani.agregar_habitacion(garage)

print("CASA DE MAMANI:")
casa_mamani.mostrar_casa()


sala_estar = Habitacion("Sala de Estar", 22)
estudio = Habitacion("Estudio", 12)
lavanderia = Habitacion("Lavanderia", 10)

casa_quispe = Casa("Avenida 6 de Agosto N 3456, Zona San Miguel, La Paz")
casa_quispe.agregar_habitacion(Habitacion("Dormitorio Matrimonial", 28))
casa_quispe.agregar_habitacion(sala_estar)
casa_quispe.agregar_habitacion(estudio)
casa_quispe.agregar_habitacion(Habitacion("Cocina Integral", 18))
casa_quispe.agregar_habitacion(lavanderia)
casa_quispe.agregar_habitacion(Habitacion("Bano Completo", 10))
print("CASA DE QUISPE:")
casa_quispe.mostrar_casa()