class Ejercicio1:
    class Vehiculo:
        def __init__(self, marca, modelo, anio, precio_base):
            self.marca = marca
            self.modelo = modelo
            self.anio = anio
            self.precio_base = precio_base

        def mostrar_info(self):
            print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.anio}, Precio base: {self.precio_base}")

    class Coche(Vehiculo):
        def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
            super().__init__(marca, modelo, anio, precio_base)
            self.num_puertas = num_puertas
            self.tipo_combustible = tipo_combustible

        def mostrar_info(self):
            super().mostrar_info()
            print(f"Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}")

    class Moto(Vehiculo):
        def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
            super().__init__(marca, modelo, anio, precio_base)
            self.cilindrada = cilindrada
            self.tipo_motor = tipo_motor

        def mostrar_info(self):
            super().mostrar_info()
            print(f"Cilindrada: {self.cilindrada}, Tipo de motor: {self.tipo_motor}")

    def main(self):
        coches = [
            self.Coche("Toyota", "Corolla", 2025, 20000, 5, "Gasolina"),
            self.Coche("Ford", "Focus", 2024, 18000, 3, "Diésel"),
        ]
        motos = [
            self.Moto("Yamaha", "FZ", 2025, 7000, "150cc", "4 tiempos"),
            self.Moto("Honda", "CBR", 2023, 12000, "500cc", "2 tiempos"),
        ]
        print("=== Información de coches ===")
        for c in coches:
            c.mostrar_info()

        print("\n=== Información de motos ===")
        for m in motos:
            m.mostrar_info()

        print("\n=== Coches con más de 4 puertas ===")
        for c in coches:
            if c.num_puertas > 4:
                c.mostrar_info()

        print("\n=== Vehículos del año 2025 ===")
        for c in coches:
            if c.anio == 2025:
                c.mostrar_info()
        for m in motos:
            if m.anio == 2025:
                m.mostrar_info()

Ejercicio1().main()
