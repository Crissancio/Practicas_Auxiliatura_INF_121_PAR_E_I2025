class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio: {self.precio_base}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}, Tipo Motor: {self.tipo_motor}")


coche1 = Coche("Toyota", "Corolla", 2025, 15000, 4, "Gasolina")
coche2 = Coche("BMW", "Serie 5", 2025, 45000, 5, "Diesel")
moto1 = Moto("Honda", "CBR600", 2025, 12000, 600, "4 tiempos")

coche1.mostrar_info()
coche2.mostrar_info()
moto1.mostrar_info()

print("\nCoches con más de 4 puertas:")
for coche in [coche1, coche2]:
    if coche.num_puertas > 4:
        coche.mostrar_info()

print("\nVehículos actuales (gestión 2025):")
for vehiculo in [coche1, coche2, moto1]:
    if vehiculo.año == 2025:
        vehiculo.mostrar_info()
