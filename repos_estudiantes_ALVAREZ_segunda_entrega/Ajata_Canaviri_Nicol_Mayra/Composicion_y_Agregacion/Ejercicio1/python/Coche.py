
from Vehiculo import Vehiculo
class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, tipo_combustible, num_puertas):  
        super().__init__(marca, modelo, anio, precio_base)   
        self.tipo_combustible = tipo_combustible       
        self.num_puertas = num_puertas  
    
    def mostrar_info(self):
        super().mostrar_info()        
        print(f"Tipo de combustible: {self.tipo_combustible}")
        print(f"Numero de puertas: {self.num_puertas}")
    
    def mas_de_4(self):        
        if self.num_puertas > 4:           
            print(f"- {self.get_marca()} de {self.get_modelo()} tiene {self.num_puertas} puertas.")

