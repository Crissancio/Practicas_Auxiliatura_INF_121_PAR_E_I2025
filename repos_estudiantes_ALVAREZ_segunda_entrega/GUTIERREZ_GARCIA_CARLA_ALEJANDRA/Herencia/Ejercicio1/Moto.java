package HERENCIA.Ejercicio1;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipo_moto;

    public Moto(String m, String mo, int a, float pb, String tm, int c) {
        super(m, mo, a, pb);
        this.tipo_moto = tm;
        this.cilindrada = c;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipo_moto() {
        return tipo_moto;
    }

    public void setCilindrada(int c) {
        this.cilindrada = c;
    }

    public void setTipo_moto(String tm) {
        this.tipo_moto = tm;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Tipo de Moto: " + this.tipo_moto + ", Cilindrada: " + this.cilindrada);
    }

    @Override
    public void mostrar_actual(int x) {
        if (getAño() == x) {
            super.mostrar_info();
        }
    }

}
