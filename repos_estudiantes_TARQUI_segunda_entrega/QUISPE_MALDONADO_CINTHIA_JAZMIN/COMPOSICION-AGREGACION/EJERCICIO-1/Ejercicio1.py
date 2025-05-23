class Habitacion:
    def __init__(self,nombre, tamano):
        self.nombre=nombre
        self.tamano=tamano
    def get_nombre(self):
        return self.nombre
    def get_tamano(self):
        return self.tamano
    def set_nombre(self, nombre):
        self.nombre=nombre
    def set_tamano(self, tamano):
        self.tamano=tamano
    def mostrar_info(self):
        print(f" Nombre: {self.nombre}")
        print(f" Tamano: {self.tamano} m²")
class Casa:
    def __init__(self,direccion):
        self.direccion=direccion
        self.habitaciones=[]
    def get_direccion(self):
        return self.direccion
    def set_direccion(self, direccion):
        self.direccion=direccion
    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)
    def mostrar_casa(self):
        print(f"Dirección de la casa: {self.direccion}")
        print("Habitaciones")
        for i in self.habitaciones:
            i.mostrar_info()

if __name__=="__main__":
    h1=Habitacion("Comedor",13)
    h2=Habitacion("Dormitorio",10)
    h3=Habitacion("Sala",15)
    h4=Habitacion("Cochera",20)
    h5=Habitacion("Cuarto de huespedes",9)
    h6=Habitacion("Cocina",12)
    h7=Habitacion("Bano",6)
    c1=Casa("Buenos Aires 154")
    c1.agregar_habitacion(h1)
    c1.agregar_habitacion(h2)
    c1.agregar_habitacion(h3)
    c1.agregar_habitacion(h4)
    c1.agregar_habitacion(h5)
    c1.agregar_habitacion(h6)
    c1.agregar_habitacion(h7)
    c1.mostrar_casa()
