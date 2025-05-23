'''
TEMA COMPOSICION

----------------EJERCICIO 5----------------


Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
compuesto por jugadores, y si el equipo se destruye, los jugadores también se
destruyen. Además, los jugadores pueden ser de diferentes tipos (portero,
defensa, mediocampista, delantero).
Clase Padre: Jugador&lt;nombre, número, posición&gt;
Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de
Jugador)
Atributos adicionales: habilidad_especial (ej: &quot;Atajadas&quot;, &quot;Marcaje&quot;, &quot;Pases&quot;,
&quot;Goles&quot;)
Clase: Equipo&lt;nombre, jugadores (lista de objetos de tipo Jugador)&gt;
Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del
equipo y la información de todos los jugadores)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un equipo y agrega varios jugadores de diferentes tipos.
c) Muestra la información del equipo y sus jugadores.
'''
from Equipo import Equipo
from Portero import Portero
from Defensa import Defensa
from Mediocampista import Mediocampista
from Delantero import Delantero

#B)
equipo = Equipo("Real Madrid")
equipo.agregar_jugador(Portero("Luisito Comunica", 1, "Atajadas"))
equipo.agregar_jugador(Defensa("Pepe Guapo", 4, "Marcaje"))
equipo.agregar_jugador(Mediocampista("Chavo", 8, "Pases"))
equipo.agregar_jugador(Delantero("Mbappe", 9, "Goles"))

#C)
equipo.mostrar_equipo()