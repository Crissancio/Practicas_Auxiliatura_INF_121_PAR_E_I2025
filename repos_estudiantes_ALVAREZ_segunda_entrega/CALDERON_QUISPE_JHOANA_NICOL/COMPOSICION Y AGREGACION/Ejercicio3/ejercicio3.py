class Jugador:
    def __init__(self, nombre , numero , posicion):
        self.nombre = nombre 
        self.numero = numero
        self.posicion = posicion 
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Numero: {self.numero}, Posicion: {self.posicion}")
    
    def getNombre(self):
        return self.nombre

    def getNumero(self):
        return self.numero

    def getPosicion(self):
        return self.posicion

    def setNombre(self, nombre):
        self.nombre = nombre

    def setNumero(self, numero):
        self.numero = numero

    def setPosicion(self, posicion):
        self.posicion = posicion

        
class Portero(Jugador):
    def __init__(self, nombre, numero, habilidadespecial):
        super().__init__(nombre, numero, "Portero")
        self.habilidadespecial = habilidadespecial
        
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidadespecial}")
        
class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidadespecial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidadespecial = habilidadespecial
        
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidadespecial}")    
        
class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidadespecial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidadespecial = habilidadespecial
        
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidadespecial}")
        
class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidadespecial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidadespecial = habilidadespecial
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidadespecial}")
        
class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Nombre del equipo: {self.nombre}")
        print("Jugadores del equipo:")
        for jugador in self.jugadores:
            jugador.mostrar_info()
            
    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre
        
equipo = Equipo("Las estrellitas")


equipo.agregar_jugador(Portero("Gus Ramos", 1, "Atajadas"))
equipo.agregar_jugador(Defensa("Cristofer Callejas", 4, "Marcaje"))
equipo.agregar_jugador(Mediocampista("Diego Hernan", 8, "Pases"))
equipo.agregar_jugador(Delantero("Jhoana Calderon", 10, "Goles"))

equipo.mostrar_equipo()