class Computadora:
    def __init__(self, procesador, ram, almacenamiento):
        self.procesador = procesador
        self.ram = ram
        self.almacenamiento = almacenamiento
        self.estado = "Apagada"  
    
    # Método para mostrar los componentes principales
    def mostrar_componentes(self):
        print(f"Procesador: {self.procesador}")
        print(f"Memoria RAM: {self.ram} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")
    
    # Método para mostrar el estado de la computadora
    def mostrar_estado(self):
        print(f"La computadora está {self.estado}.")
    
    # Método para encender la computadora
    def encender(self):
        if self.estado == "Apagada":
            self.estado = "Encendida"
            print("La computadora ha sido encendida.")
        else:
            print("La computadora ya está encendida.")
    
    # Método para apagar la computadora
    def apagar(self):
        if self.estado == "Encendida":
            self.estado = "Apagada"
            print("La computadora ha sido apagada.")
        else:
            print("La computadora ya está apagada.")

comp = Computadora("Intel Core i7", 16, 512)

comp.mostrar_componentes()
comp.mostrar_estado()
comp.encender()  
comp.mostrar_estado()  

comp.apagar() 
comp.mostrar_estado() 
