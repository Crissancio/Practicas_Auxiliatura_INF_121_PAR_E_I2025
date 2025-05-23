package minecraft;

public class MinecraftBloques {
	 public static void main(String[] args) {
	     BloqueCofre cofre1 = new BloqueCofre(27, 15);
	     BloqueCofre cofre2 = new BloqueCofre(54, 20);
	     
	     BloqueTnt tnt1 = new BloqueTnt(100);
	     BloqueTnt tnt2 = new BloqueTnt(200);
	     
	     BloqueHorno horno1 = new BloqueHorno("Rojo", 5);
	     BloqueHorno horno2 = new BloqueHorno("Negro", 10);

	     cofre1.accion();
	     cofre2.accion();
	     tnt1.accion();
	     tnt2.accion();
	     horno1.accion();
	     horno2.accion();
	     
	     cofre1.colocar("suelo");
	     tnt1.colocar("pared");
	     horno1.colocar("suelo");

	     cofre1.romper();
	     tnt1.romper();
	     horno1.romper();
	 }
	}