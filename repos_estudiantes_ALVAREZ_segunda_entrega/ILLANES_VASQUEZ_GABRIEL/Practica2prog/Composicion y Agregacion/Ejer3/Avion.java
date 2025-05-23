
package Compo3;

public class Avion {
    private String modelo, fabricante;
    private Parte[] partes;
    private int cantidad;

    public Avion(String modelo, String fabricante, int cantidad) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cantidad = 0;
        this.partes= new Parte [cantidad];
    }
    
    public void agregarParte(Parte p){
        if (cantidad< partes.length){
            partes[cantidad++]=p;
            
        }
        
    }
    
    public void mostrar(){
        
        System.out.println("el modelo " +modelo+ " fabricante " +fabricante);
        for (int i=0; i<cantidad;i++){
                partes[i].mostrarInfo();
        }
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

  
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
