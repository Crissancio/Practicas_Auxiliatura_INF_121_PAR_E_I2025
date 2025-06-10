package Ej7;

public class Main {
    public static void main(String[] args) {
        Celular miCelular = new Celular();

        miCelular.instalarAplicacion("WhatsApp", 90);
        miCelular.instalarAplicacion("Instagram", 150);
        miCelular.instalarAplicacion("Call of Duty", 300);

        miCelular.usarAplicacion("Instagram", 20); // debería consumir 4%
        miCelular.mostrarBateria();

        miCelular.usarAplicacion("Call of Duty", 60); // debería consumir 30%
        miCelular.mostrarBateria();

        miCelular.usarAplicacion("WhatsApp", 1000); // consumo hasta apagar el cel

        miCelular.usarAplicacion("Instagram", 10); // ya está apagado
    }
}
