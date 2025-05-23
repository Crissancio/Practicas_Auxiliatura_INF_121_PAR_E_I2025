class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
    
    def mostrar_info(self):
        return f"Jugador: {self.nombre}, Número: {self.numero}, Posición: {self.posicion}"

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial="Atajadas"):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial
    
    def mostrar_info(self):
        return f"{super().mostrar_info()}, Habilidad: {self.habilidad_especial}"

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial="Marcaje"):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial
    
    def mostrar_info(self):
        return f"{super().mostrar_info()}, Habilidad: {self.habilidad_especial}"

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []  # Lista de objetos Jugador
    
    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)
    
    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        print("Jugadores:")
        for jugador in self.jugadores:
            print(f"- {jugador.mostrar_info()}")


equipo = Equipo("Los Tigres")
equipo.agregar_jugador(Portero("Rodigo suares", 1))
equipo.agregar_jugador(Defensa("Carlos Casassa", 4))
equipo.agregar_jugador(Jugador("Rodrigo Martínez", 10, "Delantero"))
equipo.mostrar_equipo()