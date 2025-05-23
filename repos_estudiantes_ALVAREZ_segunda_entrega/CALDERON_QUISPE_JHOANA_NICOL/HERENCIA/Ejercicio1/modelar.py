class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca 
        self.modelo = modelo 
        self.año = año
        self.precio_base = precio_base
     
    def get_marca(self):
        return self.marca
    def get_modelo(self):
        return self.modelo
    def get_año(self):
        return self.año
    def get_precio_base(self):
        return self.precio_base
    def set_marca(self, marca):
        self.marca = marca
    def set_modelo(self, modelo):
        self.modelo = modelo
    def set_año(self, año):
        self.año = año
    def set_precio_base(self, precio_base):
        self.precio_base = precio_base    
    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio: {self.precio_base}")
        
class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible
        
    def get_num_puertas(self):
        return self.num_puertas
    def get_tipo_combustible(self):
        return self.tipo_combustible
    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas
    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Numero de Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}")
class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor
    def get_cilindrada(self):
        return self.cilindrada
    def get_tipo_motor(self):
        return self.tipo_motor 
    def set_cilindrada(self, cilindrada):
        self.cilindrada = cilindrada
    def set_tipo_motor(self, tipo_motor):
        self.tipo_motor = tipo_motor    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}, Tipo de motor: {self.tipo_motor}")
        
c1 = Coche("Toyota", "Corolla", 2025, 4000, 4, "Gasolina")
c2 = Coche("Chevrolet", "CBR500R", 2025, 6000, 5, "Otro")
m1 = Moto("Toyota", "FZ16", 2025, 4000, 500, "2T")
m2 = Moto("Honda", "Corolla", 2025, 4000, 120, "5R")    

c1.mostrar_info()
print()
c2.mostrar_info()
print()

m1.mostrar_info()
print()
m2.mostrar_info()
print()

coches = [c1, c2]
for coche in coches:
    if coche.get_num_puertas() > 4:
        coche.mostrar_info()
        print()
        
vehiculos = coches + [m1, m2]
for v in vehiculos:
    if v.get_año() == 2025:
        v.mostrar_info()
        print()