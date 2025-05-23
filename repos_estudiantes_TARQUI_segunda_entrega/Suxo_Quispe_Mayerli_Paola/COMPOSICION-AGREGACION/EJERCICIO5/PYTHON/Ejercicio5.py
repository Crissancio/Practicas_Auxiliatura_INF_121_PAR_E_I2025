class Jugador:
    def __init__(self, nombre="Sin Nombre", numero=0, posicion="Sin Posición"):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_numero(self):
        return self._numero

    def get_posicion(self):
        return self._posicion

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_numero(self, numero):
        self._numero = numero

    def set_posicion(self, posicion):
        self._posicion = posicion

    def mostrar_info(self):
        print(f"  Nombre: {self._nombre}, Número: {self._numero}, Posición: {self._posicion}", end="")

class Portero(Jugador):
    def __init__(self, nombre="Sin Nombre", numero=0, posicion="Portero", habilidad_especial="Atajadas"):
        super().__init__(nombre, numero, posicion)
        self._habilidad_especial = habilidad_especial

    # Getter
    def get_habilidad_especial(self):
        return self._habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad Especial: {self._habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre="Sin Nombre", numero=0, posicion="Defensa", habilidad_especial="Marcaje"):
        super().__init__(nombre, numero, posicion)
        self._habilidad_especial = habilidad_especial

    # Getter
    def get_habilidad_especial(self):
        return self._habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad Especial: {self._habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre="Sin Nombre", numero=0, posicion="Mediocampista", habilidad_especial="Pases"):
        super().__init__(nombre, numero, posicion)
        self._habilidad_especial = habilidad_especial

    # Getter
    def get_habilidad_especial(self):
        return self._habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad Especial: {self._habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre="Sin Nombre", numero=0, posicion="Delantero", habilidad_especial="Goles"):
        super().__init__(nombre, numero, posicion)
        self._habilidad_especial = habilidad_especial

    # Getter
    def get_habilidad_especial(self):
        return self._habilidad_especial

    # Setter
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f", Habilidad Especial: {self._habilidad_especial}")

class Equipo:
    def __init__(self, nombre="Sin Nombre"):
        self._nombre = nombre
        self._jugadores = []

    # Getter
    def get_nombre(self):
        return self._nombre

    def get_jugadores(self):
        return self._jugadores

    # Setter
    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_jugador(self, jugador):
        if isinstance(jugador, Jugador):
            self._jugadores.append(jugador)
        else:
            print("Error: Solo se pueden agregar objetos de tipo Jugador.")

    def mostrar_equipo(self):
        print(f"Equipo: {self._nombre}")
        print("Jugadores:")
        for jugador in self._jugadores:
            jugador.mostrar_info()

# b) Crea un equipo y agrega varios jugadores de diferentes tipos.
mi_equipo = Equipo(nombre="Los Invencibles")

portero1 = Portero(nombre="Manuel Neuer", numero=1)
defensa1 = Defensa(nombre="Virgil van Dijk", numero=4)
defensa2 = Defensa(nombre="Sergio Ramos", numero=15, habilidad_especial="Anticipación")
mediocampista1 = Mediocampista(nombre="Kevin De Bruyne", numero=17)
mediocampista2 = Mediocampista(nombre="Luka Modrić", numero=10, habilidad_especial="Visión de Juego")
delantero1 = Delantero(nombre="Erling Haaland", numero=9)
delantero2 = Delantero(nombre="Kylian Mbappé", numero=7, habilidad_especial="Velocidad")

mi_equipo.agregar_jugador(portero1)
mi_equipo.agregar_jugador(defensa1)
mi_equipo.agregar_jugador(defensa2)
mi_equipo.agregar_jugador(mediocampista1)
mi_equipo.agregar_jugador(mediocampista2)
mi_equipo.agregar_jugador(delantero1)
mi_equipo.agregar_jugador(delantero2)

# Intentando agregar un objeto de tipo incorrecto (esto mostrará el error)
# mi_equipo.agregar_jugador("Esto no es un jugador")

# c) Muestra la información del equipo y sus jugadores.
print("\n--- Información del Equipo ---")
mi_equipo.mostrar_equipo()
