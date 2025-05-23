class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        return f"{self.marca} {self.modelo} - Año: {self.año}, Precio: ${self.precio_base}"


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}"


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Cilindrada: {self.cilindrada}, Motor: {self.tipo_motor}"


coche1 = Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina")
coche2 = Coche("Ford", "Explorer", 2024, 35000, 5, "Diésel")
moto1 = Moto("Yamaha", "MT-07", 2025, 7500, "689cc", "4 tiempos")

print(coche1.mostrar_info())
print(coche2.mostrar_info())
print(moto1.mostrar_info())

print("\nCoches con más de 4 puertas:")
for coche in [coche1, coche2]:
    if coche.num_puertas > 4:
        print(coche.mostrar_info())

print("\nVehículos del año 2025:")
for vehiculo in [coche1, coche2, moto1]:
    if vehiculo.año == 2025:
        print(vehiculo.mostrar_info())
