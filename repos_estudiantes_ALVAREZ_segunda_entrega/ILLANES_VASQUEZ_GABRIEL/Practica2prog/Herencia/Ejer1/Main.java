
package Ejercicio1;
//marca, modelo, año, precio_base
public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("toyota","2x2", 2025, 1200, 2, "gasolina");
        Moto m = new Moto("suzuki", "GQ españa", 2025, 1222, "4", "electrico");
        
        Coche c1 = new Coche("fiat","4x4", 2021, 1200, 5, "gasolina");
        Moto m1 = new Moto("piaggio", "GQ", 2021, 1222, "8", "electrico");
        
        Coche c3 = new Coche("ferrari","2x2", 2019, 1200, 6, "gasolina");
        Moto m3 = new Moto("kawasaki", "china", 2025, 1222, "9", "electrico");
    
        c.mostra_info();
        m.mostra_info();
        c1.mostra_info();
        m1.mostra_info();
        c3.mostra_info();
        m3.mostra_info();
        System.out.println("mas puertas");
        c.masPuertas();
        c1.masPuertas();
        c3.masPuertas();
        System.out.println("mas actual");
        c.mostrarActual();
        c1.mostrarActual();
        c3.mostrarActual();
        System.out.println("mas actual moto");
        m.mostrarActual();
        m1.mostrarActual();
        m3.mostrarActual();
    }
    
}
