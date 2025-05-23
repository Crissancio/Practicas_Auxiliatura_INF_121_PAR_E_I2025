class Bloque:
    def colocar(self, orientacion):
        print(f"Bloque colocado en la orientación: {orientacion}")
class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    def accionar(self):
        print(f"Se abre el cofre de tipo '{self.tipo}' con capacidad {self.capacidad} y resistencia {self.resistencia}.")
    def romper(self):
        print(f"¡Cofre '{self.tipo}' roto! Podrías perder los objetos almacenados.")
class BloqueTnt(Bloque):
    def __init__(self, tipo, danio):
        self.tipo = tipo
        self.danio = danio
    def accionar(self):
        print(f"¡TNT '{self.tipo}' encendida! ¡Aléjate!")
    def romper(self):
        print(f"¡BOOM! La TNT '{self.tipo}' explotó causando {self.danio} de daño.")
class BloqueHorno(Bloque):
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
    def accionar(self):
        print(f"Horno de color {self.color} encendido. Cocinando {self.capacidadComida} unidades de comida.")
    def romper(self):
        print(f"¡Horno {self.color} destruido! Se perdió la comida.")
bloques = [
    BloqueCofre(100, 50, "Madera"),
    BloqueCofre(200, 70, "Hierro"),
    BloqueTnt("Explosiva", 300),
    BloqueTnt("Mega", 500),
    BloqueHorno("Rojo", 10),
    BloqueHorno("Negro", 20)
]
for bloque in bloques:
    print("----------------")
    bloque.colocar("en el suelo")
    bloque.accionar()
    bloque.romper()
