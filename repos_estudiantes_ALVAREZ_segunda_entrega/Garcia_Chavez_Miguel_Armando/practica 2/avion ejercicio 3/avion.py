class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso
    
    def mostrar_info(self):
        return f"Parte: {self.nombre}, Peso: {self.peso} kg"

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []  
        
    def agregar_parte(self, parte):
        self.partes.append(parte)
    
    def mostrar_avion(self):
        print(f"Avion: {self.modelo} - Fabricante: {self.fabricante}")
        print("Partes:")
        for parte in self.partes:
            print(f"- {parte.mostrar_info()}")

avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(Parte("Ala izquierda", 1500))
avion.agregar_parte(Parte("Ala derecha", 1500))
avion.agregar_parte(Parte("Motor 1", 2000))
avion.agregar_parte(Parte("Tren de aterrizaje", 3000))
avion.mostrar_avion()