class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: {self.precio_base}"


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return f"{info_base}, Número de Puertas: {self.num_puertas}, Tipo de Combustible: {self.tipo_combustible}"


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return f"{info_base}, Cilindrada: {self.cilindrada}, Tipo de Motor: {self.tipo_motor}"


coche1 = Coche("BMW", "BMW X7", 2025, 20000, 4, "Gasolina")
coche2 = Coche("Suzuki", "Across", 2025, 22000, 5, "Gasolina")
moto1 = Moto("Yamaha", "XMAX 125 ", 2025, 7500, 689, "Combustión")
moto2 = Moto("Kawasaki", "Ninja H2R", 2022, 9000, 649, "Combustión")

print(coche1.mostrar_info())
print(coche2.mostrar_info())
print(moto1.mostrar_info())
print(moto2.mostrar_info())

coches_mas_de_4_puertas = [coche for coche in [coche1, coche2] if coche.num_puertas > 4]
print("\nCoches con más de 4 puertas:")
for coche in coches_mas_de_4_puertas:
    print(coche.mostrar_info())

print("\nVehículos actuales (gestión 2025):")
for vehiculo in [coche1, coche2, moto1, moto2]:
    print(vehiculo.mostrar_info())

