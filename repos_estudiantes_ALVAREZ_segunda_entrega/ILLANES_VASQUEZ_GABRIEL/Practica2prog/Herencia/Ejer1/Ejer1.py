class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"La marca es: {self.marca}\nModelo: {self.modelo}\nAño: {self.año}\nPrecio base: {self.precio_base}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}\nTipo de motor: {self.tipo_motor}")

    def mostrar_actual(self):
        if self.año >= 2025:
            print(f"La moto {self.modelo} es más actual")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}\nTipo de combustible: {self.tipo_combustible}")

    def mas_puertas(self):
        if self.num_puertas >= 4:
            print(f"El coche {self.modelo} tiene más de cuatro puertas")

    def mostrar_actual(self):
        if self.año >= 2025:
            print(f"El coche {self.modelo} es más actual")



if __name__ == "__main__":
    c = Coche("Toyota", "2x2", 2025, 1200, 2, "gasolina")
    m = Moto("Suzuki", "GQ España", 2025, 1222, "4", "eléctrico")

    c1 = Coche("Fiat", "4x4", 2021, 1200, 5, "gasolina")
    m1 = Moto("Piaggio", "GQ", 2021, 1222, "8", "eléctrico")

    c3 = Coche("Ferrari", "2x2", 2019, 1200, 6, "gasolina")
    m3 = Moto("Kawasaki", "China", 2025, 1222, "9", "eléctrico")

    for v in [c, m, c1, m1, c3, m3]:
        v.mostrar_info()

    print("Más puertas:")
    c.mas_puertas()
    c1.mas_puertas()
    c3.mas_puertas()

    print("Más actual coches:")
    c.mostrar_actual()
    c1.mostrar_actual()
    c3.mostrar_actual()

    print("Más actual motos:")
    m.mostrar_actual()
    m1.mostrar_actual()
    m3.mostrar_actual()
