
package Compo3;

public class Main {
    public static void main(String[] args) {
        Avion a = new Avion("amazonas" ,"Airbus",5);
        
        Parte p = new Parte("ala", 34000);
        Parte p1 = new Parte("motor", 100);
        
        a.agregarParte(p);
        a.agregarParte(p1);
        
        a.mostrar();
        
    }
}
