# Clase base
class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.año}")
        print(f"Precio base: ${self.precio_base}")

    # Getters y setters
    def get_marca(self):
        return self.marca

    def set_marca(self, marca):
        self.marca = marca

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_año(self):
        return self.año

    def set_año(self, año):
        self.año = año

    def get_precio_base(self):
        return self.precio_base

    def set_precio_base(self, precio_base):
        self.precio_base = precio_base

# Clase Coche que hereda de Vehiculo
class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")

    def get_num_puertas(self):
        return self.num_puertas

    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self.tipo_combustible

    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible

# Clase Moto que hereda de Vehiculo
class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc")
        print(f"Tipo de motor: {self.tipo_motor}")

    def get_cilindrada(self):
        return self.cilindrada

    def set_cilindrada(self, cilindrada):
        self.cilindrada = cilindrada

    def get_tipo_motor(self):
        return self.tipo_motor

    def set_tipo_motor(self, tipo_motor):
        self.tipo_motor = tipo_motor

# b) Crear instancias
coche1 = Coche("Toyota", "Corolla", 2023, 20000, 4, "Gasolina")
coche2 = Coche("Ford", "Explorer", 2025, 35000, 5, "Híbrido")
moto1 = Moto("Yamaha", "MT-07", 2025, 7500, 689, "4 tiempos")

print("Información del coche 1:")
coche1.mostrar_info()
print("\nInformación del coche 2:")
coche2.mostrar_info()
print("\nInformación de la moto 1:")
moto1.mostrar_info()

# c) Mostrar coches con más de 4 puertas
print("\nCoches con más de 4 puertas:")
for coche in [coche1, coche2]:
    if coche.get_num_puertas() > 4:
        coche.mostrar_info()

# d) Mostrar vehículos del año 2025
print("\nVehículos del año 2025:")
for vehiculo in [coche1, coche2, moto1]:
    if vehiculo.get_año() == 2025:
        vehiculo.mostrar_info()
