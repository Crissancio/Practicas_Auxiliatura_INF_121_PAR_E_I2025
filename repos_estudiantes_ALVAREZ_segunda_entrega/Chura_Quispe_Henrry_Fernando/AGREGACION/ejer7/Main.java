package estudiante_agregacion;

public class Main {

	public static void main(String[] args) {

		Universidad uni = new Universidad("Umsa");
		uni.agrgar(new Estudiante("Juan "," Informatica "," Segundo semestre"));
		uni.agrgar(new Estudiante("Mario "," Ingenieria "," Cuarto semestre"));
		uni.agrgar(new Estudiante("Julio "," Medicina "," quinto semestre"));
		uni.MostrarUni();
		
		
	}
	

}
