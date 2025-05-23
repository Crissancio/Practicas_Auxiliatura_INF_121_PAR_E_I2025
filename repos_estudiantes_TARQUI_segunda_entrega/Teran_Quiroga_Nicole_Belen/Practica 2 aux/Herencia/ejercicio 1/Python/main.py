from Moto import Moto
from Coche import Coche
v2025 = [
    Coche("Honda", "Civic", 2024, 22000, 4, "Gasolina"),
    Coche("Chevrolet", "Tahoe", 2024, 55000, 7, "Gasolina"),
    Moto("Kawasaki", "Ninja ZX-10R", 2024, 20000, 1000, "RGB"),
    Moto("Suzuki", "V-Strom 650", 2024, 9500, 650, "RGBD"),
]
tc = []
tm = []
print("Vehiculos 2025")
for vehiculo in v2025:
    print(vehiculo.mostrar())
    if isinstance(vehiculo, Coche):
        tc.append(vehiculo)
    elif isinstance(vehiculo, Moto):
        tm.append(vehiculo)
print("tiene 4 puertas")
for coche in tc:
    if coche.nPuertas > 4:
        print(coche.mostrar())
