class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
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
        print(f"Número de puertas: {self.num_puertas}, Tipo de combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc, Tipo de motor: {self.tipo_motor}")

coche1 = Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina")
coche2 = Coche("Honda", "Civic", 2025, 22000, 5, "Híbrido")
moto1 = Moto("Yamaha", "R6", 2025, 15000, 600, "2T")

print("Información de los vehículos:")
coche1.mostrar_info()
coche2.mostrar_info()
moto1.mostrar_info()

print("\nCoches con más de 4 puertas:")
for coche in [coche1, coche2]:
    if coche.num_puertas > 4:
        coche.mostrar_info()
