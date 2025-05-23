/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9agreg;

/**
 *
 * @author CINTHIA
 */
public class Ejercicio9Agreg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p1=new Producto("Leched",12);
        Producto p2=new Producto("Carne",69);
        Producto p3=new Producto("caja",526);
        Producto p4=new Producto("Manteca",3);
        Producto p5=new Producto("Cereal",9);
        Producto p6=new Producto("Arroz",19);
        Producto p7=new Producto("Vino",45);
        Producto p8=new Producto("Cerdo",36);
        Producto p9=new Producto("Lescado",17);
        Producto p10=new Producto("Pan",165);
        Producto p11=new Producto("Soda",48);
        Producto p12=new Producto("Fruta",23);
        CarritoCompra c1=new CarritoCompra();
        CarritoCompra c2=new CarritoCompra();
        c1.agregarPro(p1);
        c1.agregarPro(p2);
        c1.agregarPro(p3);
        c1.agregarPro(p4);
        c1.agregarPro(p5);
        c1.agregarPro(p6);
        c2.agregarPro(p7);
        c2.agregarPro(p8);
        c2.agregarPro(p9);
        c2.agregarPro(p10);
        c2.agregarPro(p11);
        c2.agregarPro(p12);
        c1.mostrarCar();
        c2.mostrarCar();
                
    }
    
}
