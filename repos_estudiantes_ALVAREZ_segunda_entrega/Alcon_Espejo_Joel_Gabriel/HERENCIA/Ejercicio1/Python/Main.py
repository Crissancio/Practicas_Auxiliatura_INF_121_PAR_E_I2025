class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._año = año
        self._precio_base = precio_base
    
 
    @property
    def marca(self):
        return self._marca
    
    @property
    def modelo(self):
        return self._modelo
    
    @property
    def año(self):
        return self._año
    
    @property
    def precio_base(self):
        return self._precio_base
    
  
    @marca.setter
    def marca(self, value):
        self._marca = value
    
    @modelo.setter
    def modelo(self, value):
        self._modelo = value
    
    @año.setter
    def año(self, value):
        self._año = value
    
    @precio_base.setter
    def precio_base(self, value):
        self._precio_base = value
    
    def mostrar_info(self):
        return (f"Marca: {self.marca}, Modelo: {self.modelo}, "
                f"Año: {self.año}, Precio base: ${self.precio_base}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible
    
   
    @property
    def num_puertas(self):
        return self._num_puertas
    
    @property
    def tipo_combustible(self):
        return self._tipo_combustible
    
    
    @num_puertas.setter
    def num_puertas(self, value):
        self._num_puertas = value
    
    @tipo_combustible.setter
    def tipo_combustible(self, value):
        self._tipo_combustible = value
    
    def mostrar_info(self):
        return (super().mostrar_info() + 
                f", Número de puertas: {self.num_puertas}, "
                f"Tipo de combustible: {self.tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor
    
    
    @property
    def cilindrada(self):
        return self._cilindrada
    
    @property
    def tipo_motor(self):
        return self._tipo_motor
    
 
    @cilindrada.setter
    def cilindrada(self, value):
        self._cilindrada = value
    
    @tipo_motor.setter
    def tipo_motor(self, value):
        self._tipo_motor = value
    
    def mostrar_info(self):
        return (super().mostrar_info() + 
                f", Cilindrada: {self.cilindrada}cc, "
                f"Tipo de motor: {self.tipo_motor}")



coche1 = Coche("Toyota", "Corolla", 2023, 25000, 4, "Gasolina")
coche2 = Coche("Ford", "Mustang", 2024, 45000, 2, "Gasolina")
coche3 = Coche("Volkswagen", "Golf", 2025, 30000, 5, "Diésel")
moto1 = Moto("Honda", "CBR600RR", 2024, 12000, 599, "4 tiempos")
moto2 = Moto("Yamaha", "MT-07", 2025, 9000, 689, "2 tiempos")


vehiculos = [coche1, coche2, coche3, moto1, moto2]


print("=== Información de todos los vehículos ===")
for vehiculo in vehiculos:
    print(vehiculo.mostrar_info())
print()

print("=== Coches con más de 4 puertas ===")
for vehiculo in vehiculos:
    if isinstance(vehiculo, Coche) and vehiculo.num_puertas > 4:
        print(vehiculo.mostrar_info())
print()