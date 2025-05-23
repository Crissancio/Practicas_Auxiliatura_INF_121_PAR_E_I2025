class Parte:
    def __init__(self, nombre: str, peso: float):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"  - {self.nombre} | Peso: {self.peso} kg")

class Avion:
    def __init__(self, modelo: str, fabricante: str):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []  # Lista de objetos Parte

    def agregar_parte(self, parte: Parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"\n✈️ Avión: {self.modelo} | Fabricante: {self.fabricante}")
        print("🔧 Partes:")
        for parte in self.partes:
            parte.mostrar_info()

# --- Ejemplo de uso ---
if __name__ == "__main__":
    # Crear un avión
    avion_boeing = Avion("747", "Boeing")

    # Crear partes y agregarlas al avión (composición)
    avion_boeing.agregar_parte(Parte("Motor Principal", 1500.5))
    avion_boeing.agregar_parte(Parte("Ala Derecha", 800.0))
    avion_boeing.agregar_parte(Parte("Tren de Aterrizaje", 1200.75))

    # Mostrar información
    avion_boeing.mostrar_avion()