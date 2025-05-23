
class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base
        
    def mostrar_info(self):      
        print(f"La marca es: {self.marca}")     
        print(f"El modelo es: {self.modelo}")       
        print(f"El año es: {self.anio}")
        print(f"El precio base es: {self.precio_base}")
        
    def get_modelo(self):  return self.modelo   
    def get_marca(self):  return self.marca  
    def mod2025(self):        
        if self.anio == 2025:     
            print(f"- {self.marca} {self.modelo} es del año 2025.")
