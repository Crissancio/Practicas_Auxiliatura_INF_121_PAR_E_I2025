package vehiculos;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------COCHE-----------------------");
		
		
		List<Coche> coches = new ArrayList<>();
		coches.add(new Coche(4,"premium","toyota","GP201200",2025,32));
		coches.add(new Coche(5 , "premium","Porsche","GP201200",2023,45));
		
		for(Coche co :coches) {
			co.mostrarInf();
			
		}
	
		System.out.println("----------------------el que tiene mayor puertas-----------------------");
		for(Coche coc:coches) {
			if(coc.getNumDePuertas()>4) {
				coc.mostrarInf();
				System.out.println();
			}
		}
		
		System.out.println("----------------------MOTO-----------------------");
		
		List<Moto> motos = new ArrayList<>();
		
		motos.add(new Moto(2,"motor de gasolina ","Susuki"," AP29345",2025,2345));
		motos.add(new Moto(4,"motor de gasolina ","Ninja","APS9876",2020,1111));
		
		for(Moto mo :motos) {
			mo.mostrarInf();	
		}
		
		System.out.println("-------------------coches actuales 2025--------");
		for(Coche coc: coches) {
			if(coc.getAnio() >= 2025) {
				coc.mostrarInf();
			}
		}
		System.out.println("-------------------motos actuales 2025--------");
		for(Moto mo: motos) {
			if(mo.getAnio() >= 2025) {
				mo.mostrarInf();
			}
		}
		
		
	}
	
}
	
	
