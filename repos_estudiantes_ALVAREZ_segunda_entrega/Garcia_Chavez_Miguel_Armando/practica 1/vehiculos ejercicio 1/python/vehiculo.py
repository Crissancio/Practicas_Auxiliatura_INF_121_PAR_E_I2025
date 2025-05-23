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
        print(f"Precio base: {self.precio_base}")

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

if __name__ == "__main__":
    # Crear vehículos
    coche1 = Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina")
    coche2 = Coche("Ford", "Mustang", 2022, 45000, 2, "Gasolina")
    moto1 = Moto("Honda", "CBR600", 2021, 12000, 600, "4 tiempos")
    

    print("Información del coche 1")
    coche1.mostrar_info()
    
    print("\n=== Información del coche 2")
    coche2.mostrar_info()
    
    print("\nInformación de la moto 1")
    moto1.mostrar_info()

    print("\nCoches con más de 4 puertas")
    coches = [coche1, coche2]
    for coche in coches:
        if coche.num_puertas > 4:
            coche.mostrar_info()
   
    print("\nVehículos de gestión 2025")
    vehiculos = [coche1, coche2, moto1]
    for vehiculo in vehiculos:
        if vehiculo.año == 2025:
            vehiculo.mostrar_info()