package HERENCIA.Ejercicio1;

public class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String m, String mo, int a, float pb, int np, String tc) {
        super(m, mo, a, pb);
        this.num_puertas = np;
        this.tipo_combustible = tc;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setNum_puertas(int np) {
        this.num_puertas = np;
    }

    public void setTipo_combustible(String tc) {
        this.tipo_combustible = tc;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Num Puertas: " + this.num_puertas + "Tipo Combustible: " + this.tipo_combustible);

    }

    public void mostrar_puertas() {
        if (this.num_puertas > 4) {
            super.mostrar_info();
        }
    }

    @Override
    public void mostrar_actual(int x) {
        if (getAño() == x) {
            super.mostrar_info();
        }
    }

}
