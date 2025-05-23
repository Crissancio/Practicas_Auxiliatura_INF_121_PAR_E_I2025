"""1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
características:
Vehículo&lt;marca, modelo, año, precio_base&gt;
Métodos: mostrar_info() muestra la información básica del vehículo
Coche (hereda de Vehículo)&lt; num_puertas, tipo_combustible&gt;
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
Moto (hereda de Vehículo)&lt; cilindrada, tipo_motor&gt;
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales"""
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


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self.num_puertas

    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self.tipo_combustible

    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        print(f"Información Coche:\nMarca: {self.get_marca()} Modelo: {self.get_modelo()} Año: {self.get_año()} "
              f"Precio Base: {self.get_precio_base()} Número de Puertas: {self.get_num_puertas()} "
              f"Tipo de Combustible: {self.get_tipo_combustible()}")

    def mostrar_coche(self):
        if self.get_num_puertas() >= 4:
            self.mostrar_info()

    def mostrar_vehiculo_actual(self):
        if self.get_año() == 2025:
            self.mostrar_info()


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        print(f"Información Moto:\nMarca: {self.get_marca()} Modelo: {self.get_modelo()} Año: {self.get_año()} "
              f"Precio Base: {self.get_precio_base()} Cilindrada: {self.cilindrada}cc Tipo de Motor: {self.tipo_motor}")

    def mostrar_vehiculo_actual(self):
        if self.get_año() == 2025:
            self.mostrar_info()
coches = []
motos = []

def agrega_coche(coche):
    if len(coches) < 6:
        coches.append(coche)
    else:
        print("Array coches lleno")

def agrega_moto(moto):
    if len(motos) < 6:
        motos.append(moto)
    else:
        print("Array motos lleno")

print("b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info().")
coche1 = Coche("BMW", "GTR3", 2005, 85000.0, 2, "Gasolina")
coche2 = Coche("Toyota", "Corolla", 2020, 21000.0, 4, "Gasolina")
coche3 = Coche("Tesla", "Model 5", 2025, 39999.99, 4, "Eléctrico")
coche4 = Coche("Ford", "F-150", 2018, 30000.0, 4, "Diésel")

agrega_coche(coche1)
agrega_coche(coche2)
agrega_coche(coche3)
agrega_coche(coche4)

for coche in coches:
    coche.mostrar_info()

moto1 = Moto("Yamaha", "YZF-R6", 2021, 12500.0, 599.0, "4 tiempos")
moto2 = Moto("Honda", "CBR500RF", 2025, 7200.0, 471.0, "4 tiempos")
moto3 = Moto("Kawasaki", "Ninja ZX-10R", 2022, 16500.0, 998.0, "4 tiempos")
moto4 = Moto("Ducati", "Monster 797", 2019, 9300.0, 803.0, "L-twin")

agrega_moto(moto1)
agrega_moto(moto2)
agrega_moto(moto3)
agrega_moto(moto4)

for moto in motos:
    moto.mostrar_info()

print("--------------")
print("c) Mostrar coches con más de 4 puertas:")
for coche in coches:
    coche.mostrar_coche()

print("--------------")
print("d) Mostrar coches y motos actuales (2025):")
for coche in coches:
    coche.mostrar_vehiculo_actual()
for moto in motos:
    moto.mostrar_vehiculo_actual()