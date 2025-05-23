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
        print(f"Precio Base: ${self.precio_base}")

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
        print(f"Cilindrada: {self.cilindrada}cc")
        print(f"Tipo de motor: {self.tipo_motor}")

def main_vehiculos():
    # Crear instancias de vehículos
    coche1 = Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina")
    coche2 = Coche("Ford", "F-150", 2023, 45000, 2, "Diesel")
    coche3 = Coche("Chevrolet", "Spark", 2025, 18000, 5, "Gasolina")
    moto1 = Moto("Honda", "CBR600", 2021, 12000, 600, "4-tiempos")
    moto2 = Moto("Yamaha", "MT-07", 2025, 15000, 700, "4-tiempos")

    # Mostrar información de los vehículos
    print("=== Información de vehículos ===")
    coche1.mostrar_info()
    print("-------------------")
    coche2.mostrar_info()
    print("-------------------")
    moto1.mostrar_info()
    print("-------------------")
    coche3.mostrar_info()
    print("-------------------")
    moto2.mostrar_info()

    # Mostrar coches con más de 4 puertas
    print("\n=== Coches con más de 4 puertas ===")
    coches = [coche1, coche2, coche3]
    for coche in coches:
        if coche.num_puertas > 4:
            coche.mostrar_info()
            print("-------------------")

    # Mostrar vehículos de gestión 2025
    print("\n=== Vehículos de gestión 2025 ===")
    vehiculos = [coche1, coche2, coche3, moto1, moto2]
    for vehiculo in vehiculos:
        if vehiculo.año == 2025:
            vehiculo.mostrar_info()
            print("-------------------")

if __name__ == "__main__":
    main_vehiculos()