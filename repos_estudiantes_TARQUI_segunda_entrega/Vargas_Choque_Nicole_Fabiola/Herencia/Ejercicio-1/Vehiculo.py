class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca} Modelo: {self.modelo}")
        print(f"Año: {self.año} Precio: {self.precio_base}")


class Coche(Vehiculo):
    def __init__(self, precio_base, tipo_combustible, marca, modelo, año, num_puertas):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Num Puertas: {self.num_puertas} Tipo combustible: {self.tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, cilindrada, tipo_motor, marca, modelo, año, precio_base):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}")
        print(f"Tipo Motor: {self.tipo_motor}")


def main():
    coches = []
    motos = []

    moto1 = Moto(689, "Bicilíndrico en línea, 4 tiempos, refrigerado por líquido", "Yamaha", "MT-07", 2023, 8199)
    moto2 = Moto(636, "4 cilindros en línea, 4 tiempos, refrigerado por líquido", "Kawasaki", "Ninja ZX-6R", 2025, 11299)
    moto3 = Moto(1254, "Boxer bicilíndrico, 4 tiempos, refrigerado por aire/líquido", "BMW", "R 1250 GS", 2023, 17995)

    coche1 = Coche(24000, "Gasolina", "Toyota", "Corolla SE", 2023, 4)
    coche2 = Coche(31610, "Gasolina", "Honda", "CR-V EX", 2023, 5)
    coche3 = Coche(38990, "Eléctrico", "Tesla", "Model 3", 2025, 4)

    coches.extend([coche1, coche2, coche3])
    motos.extend([moto1, moto2, moto3])

    print("=== COCHES ===")
    for coche in coches:
        coche.mostrar_info()
        print()

    print("=== MOTOS ===")
    for moto in motos:
        moto.mostrar_info()
        print()

    print("=== COCHES CON MÁS DE 4 PUERTAS ===")
    for coche in coches:
        if coche.num_puertas > 4:
            coche.mostrar_info()
            print()

    print("=== VEHÍCULOS DEL AÑO 2025 ===")
    for coche in coches:
        if coche.año == 2025:
            coche.mostrar_info()
            print()

    for moto in motos:
        if moto.año == 2025:
            moto.mostrar_info()
            print()


if __name__ == "__main__":
    main()