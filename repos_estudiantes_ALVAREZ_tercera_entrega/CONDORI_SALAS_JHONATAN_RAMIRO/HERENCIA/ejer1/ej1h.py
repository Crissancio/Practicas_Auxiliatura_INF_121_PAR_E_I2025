# Clase base
class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._anio = anio
        self._precio_base = precio_base

    def getMarca(self):
        return self._marca

    def getModelo(self):
        return self._modelo

    def getAnio(self):
        return self._anio

    def getPrecioBase(self):
        return self._precio_base

    def mostrar_info(self):
        return f"Marca: {self._marca}, Modelo: {self._modelo}, Año: {self._anio}, Precio Base: ${self._precio_base}"

# Subclase Coche
class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    def getNumPuertas(self):
        return self._num_puertas

    def mostrar_info(self):
        return super().mostrar_info() + f", Puertas: {self._num_puertas}, Combustible: {self._tipo_combustible}"

# Subclase Moto
class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    def mostrar_info(self):
        return super().mostrar_info() + f", Cilindrada: {self._cilindrada}, Tipo Motor: {self._tipo_motor}"

# Código principal
if __name__ == "__main__":
    # Crear lista de coches
    coches = [
        Coche("Toyota", "Corolla", 2022, 15000, 4, "Gasolina"),
        Coche("Ford", "Fiesta", 2021, 12000, 2, "Diesel")
    ]

    # Crear lista de motos
    motos = [
        Moto("Honda", "CBR500R", 2025, 8000, "500cc", "4T"),
        Moto("Yamaha", "FZ25", 2025, 7000, "250cc", "4T")
    ]

    # Mostrar coches
    print("COCHES:")
    for coche in coches:
        print(coche.mostrar_info())

    # Mostrar motos
    print("\nMOTOS:")
    for moto in motos:
        print(moto.mostrar_info())

    # Mostrar coches con más de 4 puertas
    print("\nCoche con más de 4 puertas:")
    for coche in coches:
        if coche.getNumPuertas() > 4:
            print(f"{coche.getMarca()} {coche.getModelo()} tiene más de 4 puertas.")
        else:
            print(f"{coche.getMarca()} {coche.getModelo()} no tiene más de 4 puertas.")

    # Mostrar vehículos del año 2025
    print("\nVehículos del año 2025:")
    for vehiculo in coches + motos:
        if vehiculo.getAnio() == 2025:
            print(vehiculo.mostrar_info())
