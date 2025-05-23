/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9agreg;

import java.util.ArrayList;

/**
 *
 * @author CINTHIA
 */
public class CarritoCompra {
    private ArrayList<Producto> productos;
    public CarritoCompra(){
        productos= new ArrayList<>();
    }
    public void agregarPro(Producto prod){
        if(productos.size()<10){
            productos.add(prod);
            
        }
    }
    public void mostrarCar(){
        System.out.println("---Productios del Carrito ---");
        for(int i=0;i<productos.size();i++){
            productos.get(i).mostrar();
        }
    }
}
