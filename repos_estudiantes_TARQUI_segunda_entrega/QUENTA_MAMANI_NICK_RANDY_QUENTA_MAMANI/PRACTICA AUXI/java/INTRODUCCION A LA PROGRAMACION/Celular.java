// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
//a) Crea un método para instalar una nueva aplicación
//b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
//de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
//más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
//un 1% cada 10 minutos de uso)
//c) Muestra el porcentaje de batería restante
//d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el
//mensaje de celular apagado

public class Celular {
    private int espacio;
    private int bateria;

    public Celular(int espacio, int bateria) {
        this.espacio = espacio;
        this.bateria = bateria;
    }

    public void instalarAplicacion(int tamano) {
        if (espacio >= tamano) {
            espacio -= tamano;
            System.out.println("Aplicación instalada, Espacio restante: " + espacio + " MB.");
        } else {
            System.out.println("No hay suficiente espacio para instalar la aplicacion.");
        }
    }

    public void usarAplicacion(int consumo) {
        if (bateria >= consumo) {
            bateria -= consumo;
            System.out.println("Aplicacion usada, Batería restante: " + bateria + "%.");
        } else {
            System.out.println("La batería no es suficiente, Celular apagado.");
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular(1024, 100);


        celular.instalarAplicacion(700);
        celular.instalarAplicacion(600);


        celular.usarAplicacion(90);
        celular.usarAplicacion(90);
    }
}
