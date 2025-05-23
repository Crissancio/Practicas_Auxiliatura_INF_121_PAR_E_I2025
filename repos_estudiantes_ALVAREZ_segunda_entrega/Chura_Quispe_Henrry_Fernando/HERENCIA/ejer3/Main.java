package personas;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {

		System.out.println("--------------------Estudiante-----------------------");
		List<Estudiante> est=new ArrayList<>();
		est.add(new Estudiante(12345,2025,"4to semestre",1234567,"Juan","Rodriguez",1234567,1850));
		est.add(new Estudiante(1234,2024,"5to semestre",12345,"Roberto","Jaramillo",1234,2005));
		
		est.add(new Estudiante(2222,2025,"6to semestre",1234567,"Lorenzo","Chura",1234567,2020));
		est.add(new Estudiante(3344,2024,"5to semestre",12345,"Aldo","Poma",1234,2005));
		est.add(new Estudiante(5435,2021,"3to semestre",1235453,"Lucho","Gonzales",1234567,1991));
		est.add(new Estudiante(4353,2020,"7to semestre",5453345,"Ryan","Grcia",1234,1934));
		
		for(Estudiante estu :est) {
			estu.mostrarInfoEstudiante();
		}
		
		System.out.println("----------------------------docente-------------------------------------");
		
		
		List<Docente>doc=new ArrayList<>();
		
		doc.add(new Docente(1234,"Ingeniero","agronomo",12345,"mauricio","sanchez",123456,1995));
		doc.add(new Docente(5433,"lic","petrolero",12345,"Julio","Jaramillo",123456,2000));
		
		doc.add(new Docente(7654,"Ingeniero","Civil",64345,"Gonzales","sanchez",123456,2002));
		doc.add(new Docente(4576,"Doctorado","informatica",143645,"Julio","Poma",123456,2000));
		doc.add(new Docente(8754,"Ingeniero","Quimico",65445,"mauricio","Mauricio",123456,1985));
		doc.add(new Docente(9864,"Magister","Psicologia",23445,"Julio","Chura",123456,2005));
		
		for(Docente doce :doc) {
			doce.mostrarInfoDocente();
		}
		
		System.out.println("---------------------------Estudiantes mayores de 25 años-------------------------");
		for(Estudiante estu :est) {
			if(estu.getFecha_nac()<=2000) {
				estu.mostrarInfoEstudiante();
			}	
		}
		System.out.println("\n--------------Docente mas viejo y profesion ingeniero---------------\n");
		Docente mayorIngeniero = null;
		for(Docente d :doc) {
			if(d.getProfecion().equalsIgnoreCase("Ingeniero")){
				if(mayorIngeniero == null || d.getFecha_nac()< mayorIngeniero.getFecha_nac()) {
					mayorIngeniero=d;
				}
			}
				
			}
		if(mayorIngeniero != null) {
			mayorIngeniero.mostrarInfoDocente();
		}else {
			System.out.println("no hay ingenieros en la lista");
		}
		
        System.out.println("\n-------------------- PERSONAS CON EL MISMO APELLIDO --------------------");
		for (Estudiante estu:est) {
			for(Docente doce:doc) {
				if(estu.getApellido().equalsIgnoreCase(doce.getApellido())) {
					System.out.println("tienen el mismo apellido");
					estu.mostrarInfoEstudiante();
					doce.mostrarInfoDocente();
				}
			}
		}
	}
	

}
