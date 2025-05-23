from Equipo import Equipo
from Portero import Portero
from Defensa import Defensa
from Mediocampista import Mediocampista
from Delantero import Delantero

equipo = Equipo("Tigres FC")

equipo.agregar_jugador(Portero("Carlos", 1, "Atajadas"))
equipo.agregar_jugador(Defensa("Luis", 4, "Marcaje"))
equipo.agregar_jugador(Mediocampista("Jorge", 8, "Pases"))
equipo.agregar_jugador(Delantero("Miguel", 10, "Goles"))

equipo.mostrar_equipo()