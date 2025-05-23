
package Compo3;

public class Parte {
    private String nombre;
    private int peso;

    public Parte(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("al parte es " +nombre+ " su peso es " +peso+ "kg");
    }
}
