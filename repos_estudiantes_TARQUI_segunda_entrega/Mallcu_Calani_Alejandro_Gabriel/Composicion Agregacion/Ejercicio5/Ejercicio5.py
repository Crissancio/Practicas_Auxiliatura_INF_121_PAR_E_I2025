class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        return f"{self.nombre} (#{self.numero}) - {self.posicion}"

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" | Habilidad: {self.habilidad_especial}"

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" | Habilidad: {self.habilidad_especial}"

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" | Habilidad: {self.habilidad_especial}"

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" | Habilidad: {self.habilidad_especial}"

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        print("Jugadores:")
        for jugador in self.jugadores:
            print(" - " + jugador.mostrar_info())

# Ejemplo
equipo = Equipo("Los Tigres")
equipo.agregar_jugador(Portero("Carlos", 1, "Atajadas"))
equipo.agregar_jugador(Defensa("Luis", 4, "Marcaje"))
equipo.agregar_jugador(Mediocampista("Pedro", 8, "Pases"))
equipo.agregar_jugador(Delantero("Juan", 9, "Goles"))

equipo.mostrar_equipo()
