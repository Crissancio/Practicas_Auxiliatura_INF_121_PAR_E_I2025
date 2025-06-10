#TEMA: HERENCIA
# 1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
# características:
# Vehículo<marca, modelo, año, precio_base>
# Métodos: mostrar_info() muestra la información básica del vehículo
# Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
# Métodos: mostrar_info() debe mostrar la información básica más los
# atributos adicionales
# Moto (hereda de Vehículo)< cilindrada, tipo_motor>
# Métodos: mostrar_info() debe mostrar la información básica más los
# atributos adicionales
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea instancias de Coche y Moto y muestra su información usando el
# método mostrar_info().
# c) Muestra todos los coches que tienen más de 4 puertas.
# d) Mostrar los coches y motos actuales (gestión 2025)

class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca, self.modelo, self.año, self.precio_base = marca, modelo, año, precio_base

    def __str__(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: {self.precio_base}"

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas, self.tipo_combustible = num_puertas, tipo_combustible

    def __str__(self):
        return super().__str__() + f", Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}"

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada, self.tipo_motor = cilindrada, tipo_motor

    def __str__(self):
        return super().__str__() + f", Cilindrada: {self.cilindrada}, Motor: {self.tipo_motor}"

vehiculos = [
    Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2025, 35000, 5, "Diesel"),
    Coche("Chevrolet", "Spark", 2023, 15000, 2, "Gasolina"),
    Moto("Yamaha", "YZF-R3", 2025, 6000, "321cc", "4 tiempos"),
    Moto("Honda", "CBR600RR", 2024, 11500, "599cc", "4 tiempos")
]

print("\n--- Todos los vehículos ---")
print("\n".join(map(str, vehiculos)))

print("\n--- Coches con más de 4 puertas ---")
print("\n".join(str(v) for v in vehiculos if isinstance(v, Coche) and v.num_puertas > 4))

print("\n--- Vehículos del año 2025 ---")
print("\n".join(str(v) for v in vehiculos if v.año == 2025))

