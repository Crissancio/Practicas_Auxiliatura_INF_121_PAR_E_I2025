# DIAGRAMA INCOMPLETO
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        return f"{self.nombre} - N° {self.numero} - Posición: {self.posicion}"

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self.habilidad_especial}"

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self.habilidad_especial}"

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self.habilidad_especial}"

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self.habilidad_especial}"

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f" Equipo: {self.nombre}")
        print(" Jugadores:")
        for jugador in self.jugadores:
            print(" ", jugador.mostrar_info())


print("Noemí Chino Blanco")

equipo = Equipo("Bolivar ")

equipo.agregar_jugador(Portero("Juan", 1, "control"))
equipo.agregar_jugador(Defensa("Leonardo zambala", 4, "Remate"))
equipo.agregar_jugador(Mediocampista("mesi", 8, "Pases precisos"))
equipo.agregar_jugador(Delantero("Ramiro Vaca", 10, "Goleador "))

equipo.mostrar_equipo()
