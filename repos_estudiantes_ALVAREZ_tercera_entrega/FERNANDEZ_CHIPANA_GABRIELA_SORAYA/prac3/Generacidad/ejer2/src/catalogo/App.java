/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalogo;
public class App {
    public static void main(String[] args) {
   Catalogo<String> libros = new Catalogo<>();
libros.agregar("El Quijote");
libros.agregar("Cien Años de Soledad");
System.out.println(libros.buscar("El Quijote")); // true
libros.mostrar();

}

    
}