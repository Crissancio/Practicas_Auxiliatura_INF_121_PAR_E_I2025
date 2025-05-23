class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.anio}")
        print(f"Precio base: ${self.precio_base}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc")
        print(f"Tipo de motor: {self.tipo_motor}")
# Ejemplo de uso
if __name__ == "__main__":
    # Crear instancias
    coches = [
        Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina"),
        Coche("Ford", "Mustang", 2023, 45000, 2, "Gasolina"),
        Coche("Tesla", "Model 3", 2024, 50000, 4, "Eléctrico")
    ]
    motos = [
        Moto("Honda", "CBR600", 2022, 12000, 600, "4T"),
        Moto("Yamaha", "MT-07", 2023, 9000, 700, "2T")
    ]
    # b) Mostrar información de todos los vehículos
    print("=== TODOS LOS VEHÍCULOS ===")
    for coche in coches:
        coche.mostrar_info()
        print("---------------------")
    for moto in motos:
        moto.mostrar_info()
        print("---------------------")
    # c) Mostrar coches con más de 4 puertas
    print("=== COCHES CON MÁS DE 4 PUERTAS ===")
    for coche in coches:
        if coche.num_puertas > 4:
            coche.mostrar_info()
            print("---------------------")
    # d) Mostrar vehículos del año actual (2025)
    print("=== VEHÍCULOS DEL AÑO ACTUAL (2025) ===")
    for coche in coches:
        if coche.anio == 2025:
            coche.mostrar_info()
            print("---------------------")
    for moto in motos:
        if moto.anio == 2025:
            moto.mostrar_info()
            print("---------------------")