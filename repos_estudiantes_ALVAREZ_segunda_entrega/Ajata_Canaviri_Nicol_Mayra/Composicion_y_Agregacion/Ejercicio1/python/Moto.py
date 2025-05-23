
from Vehiculo import Vehiculo
class Moto(Vehiculo):  
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):     
        super().__init__(marca, modelo, anio, precio_base)  
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor
    
    def mostrar_info(self):
        super().mostrar_info()        
        print(f"Cilindrada de la moto: {self.cilindrada}")        
        print(f"Tipo de motor: {self.tipo_motor}")
