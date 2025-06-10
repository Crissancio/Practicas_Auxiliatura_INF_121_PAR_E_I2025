"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"10. Se desarrolla un Pokedex donde se usarán las siguientes clases:"

"a) Crea e instancia al menos 2 pokemones de cada tipo."
"b) Sobrescribe atacar() en PokemonAgua, PokemonFuego y PokemonPlanta,"
"haciendo que el ataque varíe según el tipo de Pokémon."
"c) Sobrecarga atacar() en PokemonFuego para permitir ataques con y sin nombre"
"específico (por ejemplo, atacar() usa un ataque por defecto, mientras que"
"atacar(String ataque) permite especificar uno)."
"d) Sobrecarga recibirAtaque(int daño) y recibirAtaque() en la clase Pokemon y"
"sobrescríbelo en las subclases para reducir puntos de vida según el tipo de"
"ataque recibido(si es el primero, reduces los puntos de vida ingresados, y si es"
"el segundo reduces solo 5 puntos de vida)."


class Pokemon:
    def __init__(self, nombre, puntos_de_vida, nivel):
        self.nombre = nombre
        self.puntos_de_vida = puntos_de_vida
        self.nivel = nivel

    def atacar(self):
        print(f"{self.nombre} usa un ataque básico.")

    def recibir_ataque(self, daño=None):
        if daño is None:
            self.puntos_de_vida -= 5
            print(f"{self.nombre} recibió 5 puntos de daño. Puntos de vida restantes: {self.puntos_de_vida}")
        else:
            self.puntos_de_vida -= daño
            print(f"{self.nombre} recibió {daño} puntos de daño. Puntos de vida restantes: {self.puntos_de_vida}")

class PokemonAgua(Pokemon):
    def atacar(self):
        print(f"{self.nombre} usa Pistola Agua.")

    def recibir_ataque(self, daño=None):
        if daño is None:
            self.puntos_de_vida -= 5
            print(f"{self.nombre} recibió 5 puntos de daño. Puntos de vida restantes: {self.puntos_de_vida}")
        else:
            reducido = daño // 2
            self.puntos_de_vida -= reducido
            print(f"{self.nombre} recibió {reducido} puntos de daño (resistente). Puntos de vida restantes: {self.puntos_de_vida}")

class PokemonFuego(Pokemon):
    def atacar(self):
        print(f"{self.nombre} usa Llamarada.")

    def atacar_especial(self, ataque):
        print(f"{self.nombre} usa {ataque}.")

    def recibir_ataque(self, daño=None):
        if daño is None:
            self.puntos_de_vida -= 5
            print(f"{self.nombre} recibió 5 puntos de daño. Puntos de vida restantes: {self.puntos_de_vida}")
        else:
            aumentado = daño * 2
            self.puntos_de_vida -= aumentado
            print(f"{self.nombre} recibió {aumentado} puntos de daño (vulnerable). Puntos de vida restantes: {self.puntos_de_vida}")

class PokemonPlanta(Pokemon):
    def atacar(self):
        print(f"{self.nombre} usa Hoja Afilada.")

    def recibir_ataque(self, daño=None):
        if daño is None:
            self.puntos_de_vida -= 5
            print(f"{self.nombre} recibió 5 puntos de daño. Puntos de vida restantes: {self.puntos_de_vida}")
        else:
            self.puntos_de_vida -= daño
            print(f"{self.nombre} recibió {daño} puntos de daño. Puntos de vida restantes: {self.puntos_de_vida}")

if __name__ == "__main__":
    agua1 = PokemonAgua("Squirtle", 100, 5)
    agua2 = PokemonAgua("Totodile", 90, 6)
    fuego1 = PokemonFuego("Charmander", 80, 5)
    fuego2 = PokemonFuego("Cyndaquil", 85, 6)
    planta1 = PokemonPlanta("Bulbasaur", 95, 5)
    planta2 = PokemonPlanta("Chikorita", 100, 6)

    agua1.atacar()
    fuego1.atacar_especial("Lanzallamas")
    planta1.atacar()

    agua1.recibir_ataque(20)
    fuego1.recibir_ataque(30)
    planta2.recibir_ataque()
