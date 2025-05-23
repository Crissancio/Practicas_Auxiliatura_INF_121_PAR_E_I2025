class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    # Método para mostrar información básica
    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.año}")
        print(f"Precio base: ${self.precio_base}")

    
    def get_marca(self):
        return self.marca

    def set_marca(self, marca):
        self.marca = marca

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    # Sobrescritura del metodo mostrar_info()
    def mostrar_info(self):
        super().mostrar_info()  
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")
        print("-------------------")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    # Sobrescritura del metodo mostrar_info()
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada} cc")
        print(f"Tipo de motor: {self.tipo_motor}")
        print("-------------------")

# b) Instanciar 2 coches y 2 motos
coche1 = Coche("Toyota", "Corolla", 2023, 25000, 4, "Gasolina")
coche2 = Coche("Ford", "Mustang", 2025, 45000, 2, "Gasolina")
moto1 = Moto("Honda", "CBR500R", 2023, 8000, 500, "4T")
moto2 = Moto("Yamaha", "MT-07", 2025, 9000, 700, "2T")

# Mostrar información de todos los vehículos
print("\n=== Información de Vehículos ===")
coche1.mostrar_info()
coche2.mostrar_info()
moto1.mostrar_info()
moto2.mostrar_info()

# c) Mostrar coches con más de 4 puertas (ninguno en este caso)
print("\n=== Coches con más de 4 puertas ===")
coches = [coche1, coche2]
for coche in coches:
    if coche.num_puertas > 4:
        coche.mostrar_info()
    else:
        print(f"{coche.marca} {coche.modelo} no cumple la condición.")

# d) Mostrar vehículos de gestión 2025 (año >= 2025)
print("\n=== Vehículos de gestión 2025 ===")
vehiculos = [coche1, coche2, moto1, moto2]
for vehiculo in vehiculos:
    if vehiculo.año >= 2025:
        vehiculo.mostrar_info()