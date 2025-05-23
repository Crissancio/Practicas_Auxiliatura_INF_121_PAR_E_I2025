class Vehiculo:
    def __init__(self, m, mo, a, pb):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: {self.precio_base}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Num Puertas: {self.num_puertas}, Tipo Combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, tipo_motor, cilindrada):
        super().__init__(marca, modelo, año, precio_base)
        self.tipo_motor = tipo_motor
        self.cilindrada = cilindrada

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Tipo Motor: {self.tipo_motor}, Cilindrada: {self.cilindrada}")

# a) Instancias de Coche y Moto
moto1 = Moto("Yamaha", "MT-07", 2023, 7500.0, "Deportiva", 689)
moto2 = Moto("Honda", "CB500X", 2025, 8000.0, "Adventure", 471)
coche1 = Coche("Toyota", "Corolla", 2022, 20000.0, 4, "Gasolina")
coche2 = Coche("Ford", "Explorer", 2025, 35000.0, 5, "Diesel")

vehiculos = [moto1, moto2, coche1, coche2]

# b) Mostrar información de todos los vehículos
print("Información de todos los vehículos:")
for v in vehiculos:
    v.mostrar_info()
    print()

# c) Mostrar coches con más de 4 puertas
print("Coches con más de 4 puertas:")
for v in vehiculos:
    if isinstance(v, Coche) and v.num_puertas > 4:
        v.mostrar_info()
        print()

# d) Mostrar vehículos actuales (gestión 2025)
print("Vehículos actuales (gestión 2025):")
for v in vehiculos:
    if v.año == 2025:
        v.mostrar_info()
        print()