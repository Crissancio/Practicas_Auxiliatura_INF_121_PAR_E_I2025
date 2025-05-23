class Bloque:
    def accion(self):
        raise NotImplementedError("Este método debe ser sobrescrito en las subclases")
    
    def colocar(self, orientacion):
        raise NotImplementedError("Este método debe ser sobrescrito en las subclases")
    
    def romper(self):
        raise NotImplementedError("Este método debe ser sobrescrito en las subclases")


class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    
    def accion(self):
        print(f"Abriendo el {self.tipo} con capacidad {self.capacidad} y resistencia {self.resistencia}.")
    
    def colocar(self, orientacion):
        print(f"Colocando el {self.tipo} en orientación {orientacion}.")
        
    def romper(self):
        print(f"Rompiendo el {self.tipo}. Puede caer objetos en su interior.")


class BloqueTnt(Bloque):
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño
    
    def accion(self):
        print(f"Activando el {self.tipo}. Daño causado: {self.daño}.")
    
    def colocar(self, orientacion):
        print(f"Colocando el {self.tipo} en orientación {orientacion}.")
        
    def romper(self):
        print(f"Rompiendo el {self.tipo}. ¡Boom! Causando {self.daño} de daño.")


class BloqueHorno(Bloque):
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
    
    def accion(self):
        print(f"Usando el horno de color {self.color} con capacidad de comida {self.capacidadComida}.")
    
    def colocar(self, orientacion):
        print(f"Colocando el horno de color {self.color} en orientación {orientacion}.")
        
    def romper(self):
        print(f"Rompiendo el horno de color {self.color}. Puede caer comida y cenizas.")


bloque_cofre1 = BloqueCofre(capacidad=27, resistencia=5, tipo="Cofre de Madera")
bloque_cofre2 = BloqueCofre(capacidad=36, resistencia=10, tipo="Cofre de Hierro")

bloque_tnt1 = BloqueTnt(tipo="TNT Normal", daño=4)
bloque_tnt2 = BloqueTnt(tipo="TNT Mejorado", daño=8)

bloque_horno1 = BloqueHorno(color="Negro", capacidadComida=6)
bloque_horno2 = BloqueHorno(color="Gris", capacidadComida=8)

bloque_cofre1.accion()
bloque_cofre2.accion()
bloque_tnt1.accion()
bloque_tnt2.accion()
bloque_horno1.accion()
bloque_horno2.accion()

bloque_cofre1.colocar("suelo")
bloque_tnt1.colocar("pared")
bloque_horno1.colocar("suelo")

bloque_cofre1.romper()
bloque_tnt1.romper()
bloque_horno1.romper()
