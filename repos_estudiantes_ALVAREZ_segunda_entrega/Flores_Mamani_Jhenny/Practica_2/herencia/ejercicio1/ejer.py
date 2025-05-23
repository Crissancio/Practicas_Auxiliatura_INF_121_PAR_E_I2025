class Vehiculo:
    def __init__(self, marca, modelo, año, precio):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio = precio

    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.año}")
        print(f"Precio: {self.precio}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self.num_puertas

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio, cilindrada, categoria):
        super().__init__(marca, modelo, año, precio)
        self.cilindrada = cilindrada
        self.categoria = categoria

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}")
        print(f"Categoría: {self.categoria}")


def mostrar_coches_con_mas_de_4_puertas(vehiculos):
    for v in vehiculos:
        if isinstance(v, Coche) and v.get_num_puertas() > 4:
            v.mostrar_info()
            print()


def mostrar_vehiculos_2025(vehiculos):
    for v in vehiculos:
        if v.año == 2025 and isinstance(v, (Coche, Moto)):
            v.mostrar_info()
            print()


if __name__ == "__main__":
    vehiculos = []
    coche1 = Coche("Suprime", "45FGG", 2025, 2340, 4, "Gas")
    coche2 = Coche("Tesla", "Model 3", 2025, 35000, 5, "Eléctrico")
    moto1 = Moto("Toyota", "5T", 2024, 4000, 31, "06")
    moto2 = Moto("Ford", "KGH", 2025, 1500, 70, "05")

    vehiculos.extend([coche1, coche2, moto1, moto2])

    print("--- Vehículos registrados ---")
    for v in vehiculos:
        v.mostrar_info()
        print()

    print("--- Coches con más de 4 puertas ---")
    mostrar_coches_con_mas_de_4_puertas(vehiculos)

    print("--- Vehículos de gestión 2025 (Coches y Motos) ---")
    mostrar_vehiculos_2025(vehiculos)
