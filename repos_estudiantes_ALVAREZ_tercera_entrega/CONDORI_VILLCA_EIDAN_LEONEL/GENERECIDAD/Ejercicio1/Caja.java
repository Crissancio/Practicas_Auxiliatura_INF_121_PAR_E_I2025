package Ejercicio1;

class Caja<T> {
	private T contenido;
	public void guardar(T algo) {
		this.contenido = algo;
		}
	public T obtener() {
		return contenido;
        }
}
