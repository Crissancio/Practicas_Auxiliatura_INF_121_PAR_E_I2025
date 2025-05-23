public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.instalarAplicacion("WhatsApp", 150);
        celular.instalarAplicacion("Instagram", 300);
        celular.usarAplicacion("WhatsApp", 30);
        celular.mostrarBateria();
        celular.usarAplicacion("Instagram", 20);
        celular.mostrarBateria();
    }
}
