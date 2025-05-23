package Agregacion1;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estu1 = new Estudiante("Carlo", "inf", 3);
		Estudiante estu2 = new Estudiante("Pedro", "Derecho", 8);
		Estudiante estu3 = new Estudiante("Robe","Fisica",1);
		Estudiante estu4 = new Estudiante("Sofia", "Psicologia", 5);
		Estudiante estu5 = new Estudiante("Carla","Biologia",7);
		
		Universidad uni1 = new Universidad("UMSA");
		
		uni1.agregar_estudiante(estu1);
		uni1.agregar_estudiante(estu2);
		uni1.agregar_estudiante(estu3);
		uni1.agregar_estudiante(estu4);
		uni1.agregar_estudiante(estu5);
		
		uni1.mostrar_universidad();
		
	}

}
