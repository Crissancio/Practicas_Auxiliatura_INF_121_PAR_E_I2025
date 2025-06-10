public class Practica_3 {

    public static void main(String[] args) {
        Caja<String> cajaS= new Caja<>();
    Caja<Integer> cajaM =new Caja<>();
        cajaM.guardar(12345);
        cajaS.guardar( "pablito clavo un clavito");
        cajaM.mostrar();
        cajaS.mostrar();
    }
}

