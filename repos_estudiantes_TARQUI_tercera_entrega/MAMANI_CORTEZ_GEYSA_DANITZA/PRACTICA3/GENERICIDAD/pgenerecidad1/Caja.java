/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenerecidad1;

/**
 *
 * @author Administrador
 */
public class Caja <T>{
    private T contenido;
    
    public void guardar(T item) {
        this.contenido = item;
    }

    public T obtener() {
        return contenido;
    }
}
