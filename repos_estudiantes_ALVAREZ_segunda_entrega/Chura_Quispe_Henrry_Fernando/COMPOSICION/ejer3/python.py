class Parte:
    def __init__(self, nombre: str, peso: str):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"🔩 Parte: {self.nombre} | Peso: {self.peso}")

class Avion:
    def __init__(self, modelo: str, fabricante: str):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []  

    def agregar_parte(self, nombre: str, peso: str):
        parte = Parte(nombre, peso)  
        self.partes.append(parte)
        print(f"✅ Parte agregada: {nombre}")

    def mostrar_info_avion(self):
        print(f"\n✈️ Avión: {self.modelo} | Fabricante: {self.fabricante}")
        if not self.partes:
            print("❌ No hay partes en el avión.")
            return
        
        print("---------------------------------")
        for parte in self.partes:
            parte.mostrar_info()
        print("---------------------------------")


if __name__ == "__main__":
    avion = Avion("Avon X200", "Elon Musk Aerospace")

    avion.agregar_parte("Ala", "50kg")
    avion.agregar_parte("Rueda", "90kg")
    avion.agregar_parte("Motor", "250kg")
    avion.agregar_parte("Tren de Aterrizaje", "70kg")

    avion.mostrar_info_avion() 
