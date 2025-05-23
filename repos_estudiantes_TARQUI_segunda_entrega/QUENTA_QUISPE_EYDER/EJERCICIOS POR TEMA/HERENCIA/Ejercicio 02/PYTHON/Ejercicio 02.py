class Vehiculo:
    def __init__(self, marca, modelo, año):
        self.marca = marca
        self.modelo = modelo
        self.año = año

    def mostrar_info(self):
        return f"{self.marca} {self.modelo} ({self.año})"

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, cilindrada):
        super().__init__(marca, modelo, año)
        self.cilindrada = cilindrada

    def mostrar_info(self):
        return super().mostrar_info() + f" - Cilindrada: {self.cilindrada}cc"

class Auto(Vehiculo):
    def __init__(self, marca, modelo, año, nro_puertas):
        super().__init__(marca, modelo, año)
        self.nro_puertas = nro_puertas

    def mostrar_info(self):
        return super().mostrar_info() + f" - Puertas: {self.nro_puertas}"

class Camion(Vehiculo):
    def __init__(self, marca, modelo, año, capacidad_carga):
        super().__init__(marca, modelo, año)
        self.capacidad_carga = capacidad_carga

    def mostrar_info(self):
        return super().mostrar_info() + f" - Capacidad: {self.capacidad_carga} kg"

vehiculos = [
    Moto("Yamaha", "R1", 2020, 998),
    Auto("Toyota", "Corolla", 2021, 4),
    Camion("Volvo", "FH", 2019, 18000)
]

print("== Información de Vehículos ==")
for v in vehiculos:
    print(v.mostrar_info())