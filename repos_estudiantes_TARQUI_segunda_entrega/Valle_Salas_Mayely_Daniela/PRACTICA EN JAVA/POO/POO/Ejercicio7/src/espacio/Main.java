package espacio;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.instalarAplicacion(new Aplicacion("WhatsApp", 100));
        celular.instalarAplicacion(new Aplicacion("Facebook", 200));
        celular.instalarAplicacion(new Aplicacion("Juego", 300));

        celular.utilizarAplicacion("WhatsApp", 30); 
        celular.utilizarAplicacion("Facebook", 20); 
        celular.utilizarAplicacion("Juego", 50);
        
        System.out.println("Batería restante: " + celular.getBateriaRestante() + "%");
        
        celular.utilizarAplicacion("WhatsApp", 10);
    }
}