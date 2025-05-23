class Jugador:
    def __init__(self, nombre, numero, posicion, habilidad_especial):
        self.__nombre = nombre
        self.__numero = numero
        self.__posicion = posicion
        self.__habilidad_especial = habilidad_especial
    def mostrar_info(self):
        print(f"Nombre: {self.__nombre}, numero: {self.__numero}, posicion: {self.__posicion}")

    def getNombre(self):
        return self.__nombre
    def setNombre(self, nombre):
        self.__nombre=nombre
    def getNumero(self):
        return self.__numero
    def get_habilidad_especial(self):
        return self.__habilidad_especial
    def setNumero(self, numero):
        self.__numero = numero
    def getPosicion(self):
        return self.__posicion
    def setPosicion(self, posicion):
        self.__posicion = posicion
    def set_habilidad_especial(self, habilidad):
        self.__habilidad_especial = habilidad
    
class Portero(Jugador):
    def __init__(self ,  nombre, numero, habilidad_especial="Ataja"):
        super().__init__(nombre, numero, "Portero", habilidad_especial)

class Defensa(Jugador):
    def __init__(self ,  nombre, numero, habilidad_especial="Marcaje"):
        super().__init__(nombre, numero, "Defensa", habilidad_especial)

class Mediocampista(Jugador):
    def __init__(self,  nombre, numero, habilidad_especial="Pases"):
        super().__init__(nombre, numero, "Madiocampista",habilidad_especial )
    
class Delantero(Jugador):
    def __init__(self,nombre,numero, habilidad_especial="Goles"):
        super().__init__(nombre,numero,"Delantero", habilidad_especial)

class Equipo:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__jugadores = []
    
    def getNombre(self):
        return self.__nombre
    def setNombre(self, nombre):
        self.__nombre = nombre

    def agregar_jugador(self, jugador):
        self.__jugadores.append(jugador)
    
    def mostrar_equipo(self):
        print(f"Nombre del equipo{self.__nombre}")
        print("Jugadores")
        for jugador in self.__jugadores:
            jugador.mostrar_info()

equipo1 = Equipo("Los Invencibles")

equipo1.agregar_jugador(Portero("Carlos Pérez", 1))
equipo1.agregar_jugador(Defensa("pols Torres", 4))
equipo1.agregar_jugador(Defensa("Rom Gómez", 5))
equipo1.agregar_jugador(Mediocampista("Juan Rivera", 8))
equipo1.agregar_jugador(Mediocampista("Pedro Lopez", 10))
equipo1.agregar_jugador(Delantero("Miguel Terceros", 9))
equipo1.mostrar_equipo()

