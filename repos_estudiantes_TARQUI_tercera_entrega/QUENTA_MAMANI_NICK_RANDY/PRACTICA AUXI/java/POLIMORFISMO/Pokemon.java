// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//10. Se desarrolla un Pokedex donde se usarán las siguientes clases:
//a) Crea e instancia al menos 2 pokemones de cada tipo.
//b) Sobrescribe atacar() en PokemonAgua, PokemonFuego y PokemonPlanta,
//haciendo que el ataque varíe según el tipo de Pokémon.
//c) Sobrecarga atacar() en PokemonFuego para permitir ataques con y sin nombre
//específico (por ejemplo, atacar() usa un ataque por defecto, mientras que
//atacar(String ataque) permite especificar uno).
//d) Sobrecarga recibirAtaque(int daño) y recibirAtaque() en la clase Pokemon y
//sobrescríbelo en las subclases para reducir puntos de vida según el tipo de
//ataque recibido(si es el primero, reduces los puntos de vida ingresados, y si es
//el segundo reduces solo 5 puntos de vida).





public class Pokemon {
    protected String nombre;
    protected int puntosDeVida;
    protected int nivel;

    public Pokemon(String nombre, int puntosDeVida, int nivel) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nombre + " usa un ataque básico.");
    }

    public void recibirAtaque(int daño) {
        puntosDeVida -= daño;
        System.out.println(nombre + " recibió " + daño + " puntos de daño. Puntos de vida restantes: " + puntosDeVida);
    }

    public void recibirAtaque() {
        puntosDeVida -= 5;
        System.out.println(nombre + " recibió 5 puntos de daño. Puntos de vida restantes: " + puntosDeVida);
    }

    public static class PokemonAgua extends Pokemon {
        public PokemonAgua(String nombre, int puntosDeVida, int nivel) {
            super(nombre, puntosDeVida, nivel);
        }

        public void atacar() {
            System.out.println(nombre + " usa Pistola Agua.");
        }

        public void recibirAtaque(int daño) {
            puntosDeVida -= daño / 2; // Resistente a fuego
            System.out.println(nombre + " recibió " + (daño / 2) + " puntos de daño (resistente). Puntos de vida restantes: " + puntosDeVida);
        }
    }

    public static class PokemonFuego extends Pokemon {
        public PokemonFuego(String nombre, int puntosDeVida, int nivel) {
            super(nombre, puntosDeVida, nivel);
        }

        public void atacar() {
            System.out.println(nombre + " usa Llamarada.");
        }

        public void atacar(String ataque) {
            System.out.println(nombre + " usa " + ataque + ".");
        }

        public void recibirAtaque(int daño) {
            puntosDeVida -= daño * 2; // Vulnerable a agua
            System.out.println(nombre + " recibió " + (daño * 2) + " puntos de daño (vulnerable). Puntos de vida restantes: " + puntosDeVida);
        }
    }

    public static class PokemonPlanta extends Pokemon {
        public PokemonPlanta(String nombre, int puntosDeVida, int nivel) {
            super(nombre, puntosDeVida, nivel);
        }

        public void atacar() {
            System.out.println(nombre + " usa Hoja Afilada.");
        }

        public void recibirAtaque(int daño) {
            puntosDeVida -= daño; // Sin modificadores
            System.out.println(nombre + " recibió " + daño + " puntos de daño. Puntos de vida restantes: " + puntosDeVida);
        }
    }

    public static void main(String[] args) {
        PokemonAgua agua1 = new PokemonAgua("Squirtle", 100, 5);
        PokemonAgua agua2 = new PokemonAgua("Totodile", 90, 6);
        PokemonFuego fuego1 = new PokemonFuego("Charmander", 80, 5);
        PokemonFuego fuego2 = new PokemonFuego("Cyndaquil", 85, 6);
        PokemonPlanta planta1 = new PokemonPlanta("Bulbasaur", 95, 5);
        PokemonPlanta planta2 = new PokemonPlanta("Chikorita", 100, 6);

        System.out.println("Acciones de los Pokémon:");
        agua1.atacar();
        fuego1.atacar("Lanzallamas");
        planta1.atacar();

        System.out.println("\nRecibir ataques:");
        agua1.recibirAtaque(20);
        fuego1.recibirAtaque(30);
        planta2.recibirAtaque();
    }
}
