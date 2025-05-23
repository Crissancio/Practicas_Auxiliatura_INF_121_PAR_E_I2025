class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        return f"{self.nombre} - Nro: {self.numero}, Posición: {self.posicion}"

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f", Habilidad: {self.habilidad_especial}"

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f", Habilidad: {self.habilidad_especial}"

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f", Habilidad: {self.habilidad_especial}"

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f", Habilidad: {self.habilidad_especial}"

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        print("Jugadores:")
        for j in self.jugadores:
            print("  -", j.mostrar_info())


# Crear equipo y jugadores 
equipo1 = Equipo("Barcelona FC")

equipo1.agregar_jugador(Portero("Carlos Pérez", 1, "Atajadas"))
equipo1.agregar_jugador(Defensa("Luis Mendoza", 4, "Marcaje"))
equipo1.agregar_jugador(Mediocampista("Daniel Rojas", 8, "Pases"))
equipo1.agregar_jugador(Delantero("Juan García", 10, "Goles"))

# Mostrar información
print("== Información del Equipo ==")
equipo1.mostrar_equipo()
