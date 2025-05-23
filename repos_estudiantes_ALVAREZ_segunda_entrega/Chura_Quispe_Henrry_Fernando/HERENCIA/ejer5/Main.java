package empleados;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------------------gerente----------------------------");
		List<Gerente> ger = new ArrayList<>();
		
		ger.add(new Gerente("Ventas", 2000, "Juan", "Sánchez", 5000, 20));
		ger.add(new Gerente("Constructora", 2344, "Maria", "Carmen", 4500, 15));

		for(Gerente g :ger) {
			g.mostrarinf();
			
		}
		 
		System.out.println("-----------------------------------desarrollador------------------");
		
		List<Desarrollador> des=new ArrayList<>();
		
		des.add(new Desarrollador("Python",23,"Ramiro","Perez",3000,10));
		des.add(new Desarrollador("Java",24,"Hank","Power",3200,40));
		for(Desarrollador d :des) {
			d.mostrarinf();	
		}
		System.out.println("---------bono mayor a 100------------");
		for(Gerente ge :ger) {
			if(ge.getBono_gerencial()>1000) {
				ge.mostrarinf();
			}
		}
		System.out.println("-------------------Desarrolladores que trabajan +10hr extras --------------");
		for(Desarrollador desa :des) {
			if(desa.getHoras_extras()>10) {
				desa.mostrarinf();
			}
		}
	}

}
