class Parte:
    def __init__(self,nombre,peso):
        self.nombre=nombre
        self.peso=peso
    def get_nombre(self):
        return self.nombre
    def get_peso(self):
        return self.peso
    def set_nombre(self,nombre):
        self.nombre=nombre
    def set_peso(self,peso):
        self.peso=peso
    def mostrar_info(self):
        print(f" Parte: {self.nombre} , Peso: {self.peso} kg")
class Avion:
    def __init__(self,modelo,fabricante):
        self.modelo=modelo
        self.fabricante=fabricante
        self.parte=[]
    def get_modelo(self):
        return self.modelo
    def set_modelo(self,modelo):
        self.modelo=modelo
    def get_fabricante(self):
        return self.fabricante
    def set_fabricante(self,fabricante):
        self.modelo=modelo
    def agregar_parte(self,parte):
        self.parte.append(parte)
    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Las partes del avion son:")
        for parte in self.parte:
            parte.mostrar_info()
if __name__ == "__main__":
    m=Parte("Motor",1509)
    a=Parte("Alas",1064)
    c=Parte("Cola",351)
    ta=Parte("Tren de Aterrisaje",664)
    av1=Avion("Airbus A320","Airbus")
    av1.agregar_parte(m)
    av1.agregar_parte(a)
    av1.agregar_parte(c)
    av1.agregar_parte(ta)
    av1.mostrar_avion()
    

