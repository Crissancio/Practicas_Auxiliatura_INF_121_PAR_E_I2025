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
        print(f"Precio base: {self.precio_base} $")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}")
        print(f"Tipo de motor: {self.tipo_motor}")



def mostrar_modelo(vehiculo):
    if vehiculo.año == 2025:
        print("Es último modelo")
    else:
        print("No es el último modelo")

def mostrar_coche(coche):
    if coche.num_puertas > 4:
        print("Es un coche con más de 4 puertas")
    elif coche.num_puertas == 4:
        print("Es un coche de 4 puertas")
    else:
        print("No es un coche de 4 puertas")

coche1 = Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina")
coche2 = Coche("Chevrolet", "Suburban", 2023, 30000, 5, "Diesel")
moto1 = Moto("Yamaha", "MT-07", 2019, 7000, 689, "2 cilindros en paralelo")
moto2 = Moto("Kawasaki", "Ninja 400", 2025, 8500, 400, "Bicilíndrico")

    
coches = [coche1, coche2]
motos = [moto1, moto2]

print(" ------- Información de los coches --------")
for coche in coches:
    coche.mostrar_info()
    mostrar_modelo(coche)
    mostrar_coche(coche)
    print("--------------------------")

print("\n ------- Información de las motos --------")
for moto in motos:
    moto.mostrar_info()
    mostrar_modelo(moto)
    print("--------------------------")

    
print("\nCoches con más de 4 puertas:")
for coche in coches:
    if coche.num_puertas > 4:
        coche.mostrar_info()
        print("--------------------------")

    
print("\nMotos actuales (gestión 2025):")
for moto in motos:
    if moto.año == 2025:
        moto.mostrar_info()
        print("--------------------------")

   