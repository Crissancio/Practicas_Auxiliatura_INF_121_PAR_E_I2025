class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso
    
    def mostrar_info(self):
        print(f"Parte: {self.nombre}")
        print(f"Peso: {self.peso} kg")

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
    
    def agregar_parte(self, parte):
        self.partes.append(parte)
    
    def mostrar_avion(self):
        print("=== Avión ===")
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("\n=== Partes del avión ===")
        
        peso_total = 0
        for parte in self.partes:
            parte.mostrar_info()
            peso_total += parte.peso
            print("-------------------")
        
        print(f"Peso total del avión: {peso_total} kg")

if __name__ == "__main__":
    boeing747 = Avion("747", "Boeing")
    
    # Crear partes específicas para este avión
    boeing747.agregar_parte(Parte("Motor izquierdo", 4500))
    boeing747.agregar_parte(Parte("Motor derecho", 4500))
    boeing747.agregar_parte(Parte("Ala izquierda", 12000))
    boeing747.agregar_parte(Parte("Ala derecha", 12000))
    boeing747.agregar_parte(Parte("Tren de aterrizaje", 8000))
    boeing747.agregar_parte(Parte("Fuselaje principal", 30000))
    
    boeing747.mostrar_avion()