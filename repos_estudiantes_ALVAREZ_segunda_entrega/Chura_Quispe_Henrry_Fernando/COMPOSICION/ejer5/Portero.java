package futbol_composicion;

public class Portero extends Jugador {
	private int atajadas;
	
	public Portero(int atajadas,String nombre, int numero,String posicion) {
		super(nombre,numero,posicion);
		this.atajadas=atajadas;
	}
	public int getAtajada() {
		return atajadas;
	}
	public void setAtajadas(int atajadas) {
		this.atajadas=atajadas;
	}
	
	@Override
    public void mostrarinf() {
        super.mostrarinf();
        System.out.println("las cantidades de atajadas que realizo fue " + atajadas);
	}
}
