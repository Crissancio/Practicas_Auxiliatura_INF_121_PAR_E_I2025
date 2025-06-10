class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        print(f"  Nombre: {self.nombre}, Número: {self.numero}, Posición: {self.posicion}", end="")

    # Getters
    def get_nombre(self):
        return self.nombre

    def get_numero(self):
        return self.numero

    def get_posicion(self):
        return self.posicion

    # Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_numero(self, numero):
        self.numero = numero

    def set_posicion(self, posicion):
        self.posicion = posicion


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad: {self.habilidad_especial}")

    # Getter
    def get_habilidad_especial(self):
        return self.habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad: {self.habilidad_especial}")

    # Getter
    def get_habilidad_especial(self):
        return self.habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad: {self.habilidad_especial}")

    # Getter
    def get_habilidad_especial(self):
        return self.habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad: {self.habilidad_especial}")

    # Getter
    def get_habilidad_especial(self):
        return self.habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial


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
            jugador.mostrar_info()

    # Getter
    def get_nombre(self):
        return self.nombre

    def get_jugadores(self):
        return self.jugadores

    # Setter
    def set_nombre(self, nombre):
        self.nombre = nombre


# b) Crear un equipo y agregar varios jugadores de diferentes tipos
equipo1 = Equipo("BARCELONA")
equipo1.agregar_jugador(Portero("ter Stegen", 1, "Atajadas"))
equipo1.agregar_jugador(Defensa("Pau Cubarsí", 2, "Marcaje"))
equipo1.agregar_jugador(Defensa("Alejandro Balde", 3, "Anticipación"))
equipo1.agregar_jugador(Mediocampista("Pedri González", 8, "Pases"))
equipo1.agregar_jugador(Mediocampista("Frenkie de Jong", 21, "Asistencias"))
equipo1.agregar_jugador(Delantero("Raphinha", 11, "Goles"))
equipo1.agregar_jugador(Delantero("Lamine Yamal", 19, "Regates"))

# c) Mostrar la información del equipo y sus jugadores
equipo1.mostrar_equipo()