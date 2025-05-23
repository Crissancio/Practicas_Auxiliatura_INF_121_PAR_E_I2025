# -*- coding: utf-8 -*-
"""
Created on Mon May 19 20:27:38 2025

@author: Fabricio
"""

# Enunciado:
# Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes características:
# Vehículo<marca, modelo, año, precio_base>
# Métodos: mostrar_info()
# Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
# Moto (hereda de Vehículo)< cilindrada, tipo_motor>
# Se deben crear instancias y mostrar la info, además de filtros.

class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"{self.marca} {self.modelo}, Año: {self.año}, Precio: {self.precio_base}")

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
        print(f"Cilindrada: {self.cilindrada}cc, Motor: {self.tipo_motor}")


coches = [
    Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2024, 30000, 5, "Diesel"),
    Coche("Hyundai", "SantaFe", 2025, 27000, 6, "Gasolina")
]

motos = [
    Moto("Yamaha", "FZ", 2025, 8000, 150, "4 tiempos"),
    Moto("Honda", "CBR", 2023, 12000, 500, "2 tiempos")
]

print("\n--- Información de Coches ---")
for coche in coches:
    coche.mostrar_info()

print("\n--- Coches con más de 4 puertas ---")
for coche in coches:
    if coche.num_puertas > 4:
        coche.mostrar_info()

print("\n--- Vehículos actuales  ---")
for coche in coches:
    if coche.año == 2025:
        coche.mostrar_info()
for moto in motos:
    if moto.año == 2025:
        moto.mostrar_info()
