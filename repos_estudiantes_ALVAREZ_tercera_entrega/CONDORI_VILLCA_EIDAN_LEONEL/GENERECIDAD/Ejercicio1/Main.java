package Ejercicio1;
//1. Crea una clase genérica Caja&lt;T&gt; para guardar algún tipo de objeto
//a) Agrega métodos guardar() y obtener()
//b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
//c) Muestra el contenido de las cajas
public class Main {
	public static void main(String[] args) {
		Caja<String> cajaTexto = new Caja<>();
		Caja<Integer> cajaNumero = new Caja<>();
		cajaTexto.guardar("Hola mundo");
		cajaNumero.guardar(123);
        System.out.println("Caja de Texto: " + cajaTexto.obtener());System.out.println("Caja de Numero: " + cajaNumero.obtener());
}
}
