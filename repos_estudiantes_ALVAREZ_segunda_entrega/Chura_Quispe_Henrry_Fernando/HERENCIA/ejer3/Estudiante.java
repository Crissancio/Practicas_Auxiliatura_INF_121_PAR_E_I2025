package personas;

public class Estudiante extends Persona{
	private int ru;
	private int fecha_ingreso;
	private String semestre;
	
	public Estudiante(int ru, int fecha_ingreso, String semestre,
			int ci, String nombre,
			String apellido, int celular,int fecha_nac) {
		super(ci,nombre,apellido,celular,fecha_nac);
		this.ru=ru;
		this.fecha_ingreso=fecha_ingreso;
		this.semestre=semestre;
	}
	public int getRu() {
		return ru;
	}
	public void setRu(int ru) {
		this.ru=ru;
	}
	public  int getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void  setFecha_ingreso(int fecha_ingreso) {
		this.fecha_ingreso=fecha_ingreso;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre=semestre;
	}
	public void mostrarInfoEstudiante() {
	System.out.printf("\nESTUDIANTE: \n-RU: %d\n-Fecha de Ingreso: %d\n-Semestre %s\n",ru,fecha_ingreso,semestre);
	super.mostrarInfoPersona();
	}
	

}
