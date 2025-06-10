class Habitaciones:
    def __init__(self,nombre,tamaño):
        self._nombre=nombre
        self._tamaño=tamaño
    def get_nombre(self):
        return self._nombre
    def get_tamaño(self):
        return self._tamaño
    def set_nombre(self,nombre):
        self._nombre=nombre
    def set_tamaño(self,tamaño):
        self._tamaño=tamaño

    def mostrar(self):
       print (f"Habitacion: {self._nombre},tamaño: {self._tamaño} m*2")
class Casa:
    def __init__(self,direccion):
        self._direccion=direccion
        self._habitaciones=[]
    def get_Habitacion(self):
        return self._direccion
    def set_habitacion(self,direccion):
        self._direccion=direccion
    def get_habitaciones(self):
        return self._habitaciones
    def agregarhabitacion(self,habitacion):
        if isinstance(habitacion,Habitaciones):
            self._habitaciones.append(habitacion)
        else:
            print("error")
    def mostrar_casa(self):
        print(f"Direccion de la casa:{self._direccion}")
        print("Habitaciones")
        for habitacion in self._habitaciones:
            habitacion.mostrar()

mi_casa = Casa("Av.Achachicala 542")
hab1 = Habitaciones("Sala", 25)
hab2 = Habitaciones("Cocina", 12)
hab3 = Habitaciones("Dormitorio principal", 20)
hab4 = Habitaciones("Baño", 6)
mi_casa.agregarhabitacion(hab1)
mi_casa.agregarhabitacion(hab2)
mi_casa.agregarhabitacion(hab3)
mi_casa.agregarhabitacion(hab4)
mi_casa.mostrar_casa()
