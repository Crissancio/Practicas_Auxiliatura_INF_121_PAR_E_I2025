class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_peso(self):
        return self.peso
    
    def set_peso(self, peso):
        self.peso = peso
    
    def mostrar_info(self):
        return f"Parte: {self.nombre}, Peso: {self.peso} kg"


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
    
    def get_modelo(self):
        return self.modelo
    
    def set_modelo(self, modelo):
        self.modelo = modelo
    
    def get_fabricante(self):
        return self.fabricante
    
    def set_fabricante(self, fabricante):
        self.fabricante = fabricante
    
    def agregar_parte(self, parte):
        self.partes.append(parte)
    
    def mostrar_avion(self):
        info = f"Avion: {self.modelo}\nFabricante: {self.fabricante}\nPartes:"
        for parte in self.partes:
            info += f"\n- {parte.mostrar_info()}"
        return info


motor = Parte("Motor Turbofan", 1500)
ala_izquierda = Parte("Ala izquierda", 800)
ala_derecha = Parte("Ala derecha", 800)
tren_delantero = Parte("Tren de aterrizaje delantero", 300)
tren_trasero = Parte("Tren de aterrizaje trasero", 400)

Amazonas = Avion("Avion Amazonas", "Boeing")
Amazonas.agregar_parte(motor)
Amazonas.agregar_parte(ala_izquierda)
Amazonas.agregar_parte(ala_derecha)
Amazonas.agregar_parte(tren_delantero)
Amazonas.agregar_parte(tren_trasero)

print(Amazonas.mostrar_avion())