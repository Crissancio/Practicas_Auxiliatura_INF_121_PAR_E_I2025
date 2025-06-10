class Computadora:
    def __init__(self, procesador, memoriaRam, discoduro, tarjetagrafica):
        self.procesador = procesador
        self.memoriaRam = memoriaRam
        self.discoduro = discoduro
        self.tarjetagrafica = tarjetagrafica
        self.estado = False
    def encender(self):
        if not self.estado:
            self.estado = True
            print(f"La computadora esta encendida")
        else:
            print(f"la computadora ya esta encendida")
            
    def apagar(self):
        if self.estado:
            self.estado =False
            print(f"la computadora se ah  apagado")
        else: 
            print(f"la computadora ya esta apagada")
            
    def mostrar(self):
        print("estado: ", "encendida" if self.estado else "apagada")
        
miComputadora = Computadora("inter i7", "16GB","1TB SSD", "NVIDIA RTX 3060")
miComputadora.mostrar()
miComputadora.encender()
miComputadora.mostrar()
miComputadora.apagar()
miComputadora.mostrar()
