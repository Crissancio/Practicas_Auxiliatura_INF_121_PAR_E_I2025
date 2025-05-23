class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        return f"\nMarca: {self.marca} \nModelo: {self.modelo} \nAño: {self.año} \nPrecio: ${self.precio_base}"

    def get_marca(self):
        return self.marca

    def set_marca(self, marca):
        self.marca = marca

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_año(self):
        return self.año

    def set_año(self, año):
        self.año = año

    def get_precio_base(self):
        return self.precio_base

    def set_precio_base(self, precio_base):
        self.precio_base = precio_base


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        base_info = super().mostrar_info()
        return f"{base_info} \nPuertas: {self.num_puertas} \nCombustible: {self.tipo_combustible}"
    
    def get_num_puertas(self):
        return self.num_puertas

    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self.tipo_combustible

    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        base_info = super().mostrar_info()
        return f"{base_info} \nCilindrada: {self.cilindrada}cc \nTipo de Motor: {self.tipo_motor}"

    def get_cilindrada(self):
        return self.cilindrada

    def set_cilindrada(self, cilindrada):
        self.cilindrada = cilindrada

    def get_tipo_motor(self):
        return self.tipo_motor

    def set_tipo_motor(self, tipo_motor):
        self.tipo_motor = tipo_motor

        
coche1 = Coche("Toyota", "Corolla", 2023, 22000, 4, "Gasolina")
coche2 = Coche("Ford", "F-150", 2023, 35000, 4, "Gasolina/Diesel")
coche3 = Coche("Tesla", "Model Y Standard Range", 2025, 60000, 5, "Electrico")
moto1 = Moto("Yamaha", "R3", 2020, 5500, 321, "4 tiempos refrigerado por líquido")
moto2 = Moto("Honda", "TMX Supremo", 2025, 1400, 150, " 4 tiempos, refrigerado por aire")

print(("--------COCHE 1--------"),(coche1.mostrar_info()))
print(("--------COCHE 2--------"),(coche2.mostrar_info()))
print(("--------COCHE 3--------"),(coche3.mostrar_info()))
print(("--------MOTO 1--------"),(moto1.mostrar_info()))
print(("--------MOTO 2--------"),(moto2.mostrar_info()))

coches = [coche1, coche2, coche3]
print("______________________________")
print("\nCOCHES CON MAS DE 4 PUERTAS")
print("______________________________")
for coche in coches:
    if coche.get_num_puertas() > 4:
        print(coche.mostrar_info())
vehiculos = [coche1, coche2, coche3, moto1, moto2]
print("__________________________")
print("\nVEHICULOS DEL AÑO 2025")
print("__________________________")
for vehiculo in vehiculos:
    if vehiculo.get_año() == 2025:
        print(vehiculo.mostrar_info())

