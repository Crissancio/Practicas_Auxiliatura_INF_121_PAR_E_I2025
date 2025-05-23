
class Bloque:
    def accion(self):
        print("Este bloque no tiene una acción definida.")
    # colocar debe ser un metodo de cada clase
    def colocar(self, orientacion="suelo"):
        print(f"Bloque colocado en el {orientacion}.")
    
    def romper(self):
        print("Este bloque no se puede romper.")


class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    
    def accion(self):
        print(f"¡Abriendo cofre {self.tipo}! Contiene {self.capacidad} espacios. 📦")
    
    def romper(self):
        print(f"¡Cuidado! Romper este cofre {self.tipo} puede soltar sus items. 💥")

class BloqueTnt(Bloque):
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño
    
    def accion(self):
        print(f"¡La TNT {self.tipo} explotará en 3 segundos! 💣")
    
    def romper(self):
        print(f"¡BOOM! La TNT {self.tipo} causó {self.daño} de daño. 💥")

class BloqueHorno(Bloque):
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
    
    def accion(self):
        print(f"¡Horno {self.color} listo para cocinar {self.capacidadComida} alimentos! 🔥")
    
    def romper(self):
        print(f"¡El horno {self.color} se rompió y soltó carbón! 🪵")


# a) 2 bloques de cada tipo
cofre1 = BloqueCofre(27, 10, "común")
cofre2 = BloqueCofre(54, 20, "épico")
tnt1 = BloqueTnt("normal", 5)
tnt2 = BloqueTnt("mega", 10)
horno1 = BloqueHorno("negro", 3)
horno2 = BloqueHorno("blanco", 6)


# b) Sobrescritura de accion()
print("\n=== Acciones de los bloques ===")
cofre1.accion()  
tnt1.accion()    
horno1.accion()  

# c) Sobrecarga de colocar()
print("\n=== Colocar bloques ===")
cofre1.colocar("suelo")  
tnt1.colocar("pared")   

# d) Sobrescritura de romper()
print("\n=== Romper bloques ===")
cofre2.romper()  
tnt2.romper()    
horno2.romper()  