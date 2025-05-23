package futbol_composicion;

public class Defensa extends Jugador {
	private int marcajes;
	
	public Defensa(int marcajes,String nombre, int numero,String posicion) {
		super(nombre,numero,posicion);
		this.marcajes=marcajes;
	}
	public int getMarcajes() {
		return marcajes;
	}
	public void setMarcajes(int marcajes) {
		this.marcajes=marcajes;
	}
	@Override
    public void mostrarinf() {
        super.mostrarinf();
        System.out.println("los marcajes que realizo son  " + marcajes );
	}
}
