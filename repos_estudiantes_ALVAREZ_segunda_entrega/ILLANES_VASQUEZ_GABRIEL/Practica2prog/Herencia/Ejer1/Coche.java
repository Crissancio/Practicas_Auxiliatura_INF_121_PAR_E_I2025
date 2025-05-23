
package Ejercicio1;

public class Coche extends Vehiculo{
    private int  numPuerta;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, int precio_base, int numPuerta, String gasolina) {
        super(marca, modelo, año, precio_base);
        this.numPuerta=numPuerta;
        this.tipo_combustible=tipo_combustible;
    }

    
    
    public void mostrar_info(){
        super.mostra_info();
        System.err.println("numPuerta: "+numPuerta+ "\n tipo_combustible: "+tipo_combustible);
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
    public void masPuertas(){
        if(numPuerta >= 4){
            System.out.println("el coche: " + getModelo() + "tiene masa de cuatro puertas");
        }
    }
    
    public void mostrarActual(){
        if(getAño() >= 2025){
            System.out.println("el auto: " +getModelo()+ "es mas actual" );
        }
    }
    
}
