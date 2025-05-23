
class Jugador:
    def __init__(self, nombre: str, numero: int, posicion: str, habilidad_especial: str):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"⚽ Jugador: {self.nombre} | Número: {self.numero} | Posición: {self.posicion} | Habilidad: {self.habilidad_especial}")


class Portero(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Portero", "Atajadas")

class Defensa(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Defensa", "Marcaje")

class Mediocampista(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Mediocampista", "Pases")

class Delantero(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Delantero", "Goles")

class Equipo:
    def __init__(self, nombre: str):
        self.nombre = nombre
        self.jugadores = []  

    def agregar_jugador(self, nombre: str, numero: int, tipo: str):
        if tipo.lower() == "portero":
            jugador = Portero(nombre, numero)
        elif tipo.lower() == "defensa":
            jugador = Defensa(nombre, numero)
        elif tipo.lower() == "mediocampista":
            jugador = Mediocampista(nombre, numero)
        elif tipo.lower() == "delantero":
            jugador = Delantero(nombre, numero)
        else:
            print(f"❌ Tipo de jugador '{tipo}' no válido.")
            return
        
        self.jugadores.append(jugador)
        print(f"✅ Jugador agregado: {nombre} ({tipo})")

    def mostrar_equipo(self):
        print(f"\n🏆 Equipo: {self.nombre}")
        if not self.jugadores:
            print("❌ No hay jugadores en el equipo.")
            return
        
        print("---------------------------------")
        for jugador in self.jugadores:
            jugador.mostrar_info()
            print("---------------------------------")


if __name__ == "__main__":
    equipo = Equipo("Bolívar")


    equipo.agregar_jugador("Dibu Martínez", 1, "Portero")
    equipo.agregar_jugador("Virgil van Dijk", 4, "Defensa")
    equipo.agregar_jugador("Luka Modric", 10, "Mediocampista")
    equipo.agregar_jugador("Mbappé", 7, "Delantero")

    equipo.mostrar_equipo()  
