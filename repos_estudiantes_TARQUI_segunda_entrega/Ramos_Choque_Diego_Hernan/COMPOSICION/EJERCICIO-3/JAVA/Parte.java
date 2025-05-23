package composicion;

public class Parte {
	private String nombredelaparte;
	private String peso;
	public Parte(String nombredelaparte, String peso) {
		super();
		this.nombredelaparte = nombredelaparte;
		this.peso = peso;
	}
	public String getNombredelaparte() {
		return nombredelaparte;
	}
	public void setNombredelaparte(String nombredelaparte) {
		this.nombredelaparte = nombredelaparte;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String mostrarInfo() {
		return "Parte [nombredelaparte=" + nombredelaparte + ", peso=" + peso + "]";
	}
	

}
