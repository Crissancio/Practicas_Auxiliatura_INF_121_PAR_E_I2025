#a)
class Jugador:
    def __init__(self,nombre, numero,posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
    
    def __str__(self):
        return f'-------------Jugador-------------- \n Nombre: {self.nombre} \n  Numero:{self.numero} \n  Posicion: {self.posicion} \n'
    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
    def getNumero(self):
        return self.numero
    def setNumero(self,numero):
        self.numero = numero
    def getPosicion(self):
        return self.posicion
    def setPosicion(self,posicion):
        self.posicion = posicion

class Portero(Jugador):
    def __init__(self,nombre, numero, posicion, habildad_especiial):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = habildad_especiial
    
    def __str__(self):
        return f'-------------Portero--------------\n Nombre: {self.nombre} \n  Numero:{self.numero} \n  Posicion: {self.posicion} \n Habilidad especial: {self.habilidad_especial} \n'
    
    def getHabilidadEspecial(self):
        return self.habilidad_especial
    def setHabilidadEspecial(self,habilidad_especial):
        self.habilidad_especial = habilidad_especial
    
class Defensa(Jugador):
    def __init__(self, nombre, numero, posicion, habilidad_especial):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = habilidad_especial
        
    def __str__(self):
        return f'-------------Defensa-------------- \n Nombre: {self.nombre} \n Numero:{self.numero} \n Posicion: {self.posicion}\n Habilidad especial: {self.habilidad_especial} \n'
    
    def getHabilidadEspecial(self):
        return self.habilidad_especial
    def setHabilidadEspecial(self,habilidad_especial):
        self.habilidad_especial = habilidad_especial
    
class Mediocampista(Jugador):
    def __init__(self, nombre, numero, posicion, habilidad_especial):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = habilidad_especial
        
    def __str__(self):
        return f'-------------Mediocampista-------------- \n Nombre: {self.nombre},\n Numero:{self.numero}\n Posicion: {self.posicion}\n Habilidad especial: {self.habilidad_especial} \n'

    def getHabilidadEspecial(self):
        return self.habilidad_especial
    def setHabilidadEspecial(self,habilidad_especial):
        self.habilidad_especial = habilidad_especial

class Delantero(Jugador):
    def __init__(self, nombre, numero, posicion, habilidad_especial):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = habilidad_especial
        
    def __str__(self):
        return f'-------------Delantero-------------- \n Nombre: {self.nombre}\n Numero:{self.numero},\n Posicion: {self.posicion}\n Habilidad especial: {self.habilidad_especial} \n'

    def getHabilidadEspecial(self):
        return self.habilidad_especial
    def setHabilidadEspecial(self,habilidad_especial):
        self.habilidad_especial = habilidad_especial

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []
    
    def agregar_jugador(self, nombre, numero, posicion, habilidad_especial):
        if posicion == "Portero":
            self.jugadores.append(Portero(nombre, numero, posicion, habilidad_especial))
        elif posicion == "Defensa":
            self.jugadores.append(Defensa(nombre, numero, posicion, habilidad_especial))
        elif posicion == "Mediocampista":
            self.jugadores.append(Mediocampista(nombre, numero, posicion, habilidad_especial))
        elif posicion == "Delantero":
            self.jugadores.append(Delantero(nombre, numero, posicion, habilidad_especial))
        
    def __str__(self):
            print( "---------------------------Equipo------------------------- \n")
            cad = ""
            for jugador in self.jugadores:
                cad += str(jugador)
            return f"Equipo: {self.nombre} \n Jugadores:\n{cad} \n"
    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
    def getJugadores(self):
        return self.jugadores
    def setJugadores(self,jugadores):
        self.jugadores = jugadores
#b) 
barcelona = Equipo("Barcelona")
barcelona.agregar_jugador("Ter Stegen", 1, "Portero", "Paradas")
barcelona.agregar_jugador("Pique", 3, "Defensa", "Marcaje")
barcelona.agregar_jugador("Busquets", 5, "Mediocampista", "Pase largo")
barcelona.agregar_jugador("Messi", 10, "Delantero", "Gol")

real_madrid = Equipo("Real Madrid")
real_madrid.agregar_jugador("Courtois", 1, "Portero", "Paradas")
real_madrid.agregar_jugador("Ramos", 4, "Defensa", "Cabeza")
real_madrid.agregar_jugador("Modric", 10, "Mediocampista", "Pase corto")
real_madrid.agregar_jugador("Cristiano Ronaldo", 7, "Delantero", "Regate")
#c)
print(barcelona)
print(real_madrid)