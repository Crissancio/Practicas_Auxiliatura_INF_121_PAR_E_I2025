package ejer;

class Celular {
	int espacio = 1024;
	int bateria = 100;
	int cantidadApp = 0;
	public void nuevaApp(String nombre, int tamaño) {
		cantidadApp += 1;
		espacio -= tamaño;
		if(cantidadApp > 20) {
			System.err.println("Espacio de aplicaciones llenas!!");
		} if(espacio < 1) {
			System.err.println("Espacio lleno!!!");
		}else {
			// las aplicaciones y su informacion no se alamacenan en ningun lugar
			// solo se muestran en la consola
			System.out.println(nombre + " instalado. espacio disponible: "+espacio);
		}
		return;
	}
	public void App(String nombre,int tamaño) {
		// se debe buscar una aplicacion ya instalada y tenerminar su uso por la informacion introducida
		if (tamaño > 100 && tamaño < 250) {
			bateria -=2;
		} if(tamaño > 250) {
			bateria -=5;
		} else {
			bateria -=1;
		}
		if (bateria < 1) {
			bateria = 0;
			System.err.println("CELULAR APAGADO");
		}
		return;
	}
	public void mostrarBateria() {
		System.out.println("Bateria: "+bateria);
		return;
	}
	public static void main(String[] args) {
		Celular x = new Celular();
		x.nuevaApp("foco", 295);
		x.App("foco",295);
		x.mostrarBateria();
		x.App("foco",295);
		x.mostrarBateria();
		x.App("foco",295);
		x.mostrarBateria();
		x.nuevaApp("wes", 79);
		x.App("wes",79);
		x.mostrarBateria();
		x.nuevaApp("qys", 159);
		x.App("qys",159);
		x.mostrarBateria();
		
	}
}
