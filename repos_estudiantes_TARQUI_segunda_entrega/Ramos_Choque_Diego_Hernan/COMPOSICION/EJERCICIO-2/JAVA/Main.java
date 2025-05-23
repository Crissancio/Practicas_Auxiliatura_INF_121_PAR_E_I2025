package composicion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computadora acer = new Computadora("Acer","L012KPX");
		acer.agregarComponente("RAM", "8GB");
		acer.agregarComponente("Disco Duro", "100TB");
		acer.mostrar_info();
		

	}

}
