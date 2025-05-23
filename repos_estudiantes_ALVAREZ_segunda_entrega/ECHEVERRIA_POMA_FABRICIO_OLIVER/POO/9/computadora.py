class Computadora:
    def __init__ (self, procesador, ram, almacenamiento, tarjeta_madre):
        self. procesador= procesador
        self.ram= ram
        self.almacenamiento= almacenamiento
        self.tarjeta_madre= tarjeta_madre
        self.encendido = False

    def componentes(self):
        print("Componentes")
        print(f"Procesador: {self.procesador}")
        print(f"RAM: {self.ram}")
        print(f"Almacenamiento: {self.almacenamiento}")
        print(f"Tarjeta madre: {self.tarjeta_madre}")
        print("--------------------------")

    def estado(self):
        estado= "Encendida" if self.encendido else "Apagada"
        print(f"Estado: {estado}")
        print("--------------------------")

    def encender(self):
        if self.encendido:
            print("La computadora ya esta encendida")
        else:
            self.encendido= True
            print("Computadora encendida")
            print("--------------------------")
    def apagar(self):
        if not self.encendido:
            print("La computadora ya esta apagada")
        else:
            self.encendido= False
            print("Computadora apagada")
