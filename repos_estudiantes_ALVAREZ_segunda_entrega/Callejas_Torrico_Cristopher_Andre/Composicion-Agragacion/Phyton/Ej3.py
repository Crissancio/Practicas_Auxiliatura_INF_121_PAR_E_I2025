class Parte:
    def __init__(self, nombre_parte, peso):
        self.nombre_parte = nombre_parte
        self.peso = peso

    def mostrar_info(self):
        return f"Parte: {self.nombre_parte} - Peso: {self.peso}"

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.componentes_avion = []

    def agregar_parte(self, parte):
        self.componentes_avion.append(parte)

    def mostrar_avion(self):
        print(f"Fabricante: {self.fabricante} - Modelo: {self.modelo}")
        print("------ Partes del avión ------")
        for parte in self.componentes_avion:
            print(parte.mostrar_info())

# Instancias y ejecución
avion = Avion("Gulfstream", "Boeing")
avion.agregar_parte(Parte("Alas", "50,000 kg"))
avion.agregar_parte(Parte("Fuselaje", "198,800 kg"))

avion.mostrar_avion()
