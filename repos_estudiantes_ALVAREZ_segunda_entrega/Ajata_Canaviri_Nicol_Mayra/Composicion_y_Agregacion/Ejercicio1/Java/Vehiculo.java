package Composicion_y_Agregacion.Ejercicio1.Java;


public class Vehiculo { 
    private String marca, modelo;
    private int año, precio_base;

public Vehiculo (String ma, String mo, int a, int p) {
    this.marca = ma;
    this.modelo = mo;
    this.año = a;
    this.precio_base = p;
}

public void mostrar_info() {
    System.out.println("La marca es:"+ marca);
    System.out.println("El modelo es:" + modelo); 
    System.out.println("El año es: " + año); 
    System.out.println("El precio base es:" + precio_base);

}

String getModelo() { return modelo; } 
String getMarca() { return marca; }

void mod2025() {
    if (año == 2025) {
        System.out.println("-"+ marca + "" + modelo + "es del año 2025.");
        }
    }
}
