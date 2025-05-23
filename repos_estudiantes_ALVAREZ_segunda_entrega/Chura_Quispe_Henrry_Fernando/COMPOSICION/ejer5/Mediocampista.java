package futbol_composicion;

public class Mediocampista extends Jugador {
	private int pases;
	
	public Mediocampista(int pases,String nombre, int numero,String posicion) {
		super(nombre,numero,posicion);
		this.pases=pases;
	}
	public int getPases() {
		return pases;
	}
	public void setPases(int pases) {
		this.pases=pases;
	}
	@Override
    public void mostrarinf() {
        super.mostrarinf();
        System.out.println("la cantidad de pases que realizo fueron = " + pases);
	}
}
