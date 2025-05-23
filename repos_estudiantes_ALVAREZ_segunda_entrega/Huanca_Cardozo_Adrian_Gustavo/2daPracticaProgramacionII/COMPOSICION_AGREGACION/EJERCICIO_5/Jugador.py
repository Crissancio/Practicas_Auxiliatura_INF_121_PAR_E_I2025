class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_numero(self):
        return self.numero

    def set_numero(self, numero):
        self.numero = numero

    def get_posicion(self):
        return self.posicion

    def set_posicion(self, posicion):
        self.posicion = posicion

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Número:", self.numero)
        print("Posición:", self.posicion)


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print("Habilidad especial:", self.habilidad_especial)


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print("Habilidad especial:", self.habilidad_especial)


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print("Habilidad especial:", self.habilidad_especial)


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print("Habilidad especial:", self.habilidad_especial)


class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print("Equipo:", self.nombre)
        print("Jugadores:")
        for j in self.jugadores:
            j.mostrar_info()
            print("------")

    def destruir_equipo(self):
        self.nombre = "EQUIPO DESTRUIDO"
        for j in self.jugadores:
            j.nombre = "Jugador destruido"
            j.numero = "-"
            j.posicion = "-"
            if hasattr(j, "habilidad_especial"):
                j.habilidad_especial = "-"


portero = Portero("Juan Pérez", 1, "Atajadas")
defensa1 = Defensa("Carlos Ruiz", 3, "Marcaje")
defensa2 = Defensa("Luis Gómez", 4, "Bloqueo")
mediocampista = Mediocampista("Andrés López", 8, "Pases")
delantero = Delantero("Miguel Torres", 10, "Goles")

equipo = Equipo("Los Titanes")
equipo.agregar_jugador(portero)
equipo.agregar_jugador(defensa1)
equipo.agregar_jugador(defensa2)
equipo.agregar_jugador(mediocampista)
equipo.agregar_jugador(delantero)

print("Equipo antes de ser destruido:")
equipo.mostrar_equipo()

equipo.destruir_equipo()

print("\nEquipo después de ser destruido:")
equipo.mostrar_equipo()
