/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Administrador
 */
public class Oficina {
    private int nroSillas,nroEscritorios, nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }
    //b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar(){
        System.out.println("Nro Sillas: "+nroSillas);
        System.out.println("Nro Escritorios: "+nroEscritorios);
        System.out.println("Nro Estanterias: "+nroEstanterias);
    }
    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
    public int cantidadMuebles(int nroEstanterias) {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}
