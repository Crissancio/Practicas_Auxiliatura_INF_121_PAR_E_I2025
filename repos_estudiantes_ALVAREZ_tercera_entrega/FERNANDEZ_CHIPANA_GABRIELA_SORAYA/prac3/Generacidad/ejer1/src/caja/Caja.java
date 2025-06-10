/*Crea una clase genérica Caja<T> para guardar algún tipo de objeto
a) Agrega métodos guardar() y obtener()
b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
c) Muestra el contenido de las cajas*/
package caja;
class Caja<T> {
    private T objeto;

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }
}

