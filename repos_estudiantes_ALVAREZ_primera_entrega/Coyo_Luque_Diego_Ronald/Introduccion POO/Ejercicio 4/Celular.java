// 7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
// a) Crea un método para instalar una nueva aplicación
// b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
// de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
// más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
// un 1% cada 10 minutos de uso)
// c) Muestra el porcentaje de batería restante
// d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el
// mensaje de celular apagado

package Uno;

public class Celular {
    private int aplicaciones;
    private int espacio;
    private int bateria;

    public Celular() {
        this.aplicaciones = 20;
        this.espacio = 1024;
        this.bateria = 100;
    }

    // LAS APLICACIONES SE DEBEN ALMACENAR EN ALGUNA ESTRUCTURA DE DATOS
    public void instalar(String nombreApp, int tamaño) {
        if (aplicaciones <= 0) {
            System.out.println("No se pueden instalar más aplicaciones.");
            return;
        }

        if (espacio < tamaño) {
            System.out.println("No hay espacio para instalar " + nombreApp);
            return;
        }

        aplicaciones = aplicaciones - 1;
        espacio = espacio - tamaño;
        
        System.out.println(nombreApp + " (" + tamaño + "MB) se instalo. ");
    }

    public void usarApp(String nombreApp, int tamaño, int minutosUso) {
        if (bateria <= 0) {
            System.out.println("Celular apagado.");
            return;
        }

        int consumo;
        if (tamaño > 250) {
            consumo = (minutosUso / 10) * 5;
        } else if (tamaño > 100) {
            consumo = (minutosUso / 10) * 2;
        } else {
            consumo = (minutosUso / 10) * 1;
        }

        bateria = bateria - consumo;
        if (bateria < 0) {
            bateria = 0;
        }

        System.out.println(nombreApp + " se uso / Tiempo: " + minutosUso + " min / Uso de bateria: " + consumo + "%");

    }

    public void mostrarBateria() {
        if (bateria <= 0) {
            System.out.println("Celular apagado.");
        } else {
            System.out.println("Bateria restante: " + bateria + "%");
        }
    }

    public static void main(String[] args) {
        Celular cel = new Celular();

        cel.instalar("WhatsApp", 300); 
        cel.instalar("Tik Tok", 600);
        cel.instalar("Spotify", 150); 
    
        cel.usarApp("WhatsApp", 300, 45);
        cel.usarApp("Tik Tok", 600, 160);

        cel.mostrarBateria();
    }
}


