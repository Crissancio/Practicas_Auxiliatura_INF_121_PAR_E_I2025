// a) codificar la clase con getters y setters
class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, double precio_base, int n, String t) {
        super(marca, modelo, año, precio_base);
        this.num_puertas = n;
        this.tipo_combustible = t;
    }
    public int getNumPuertas() {
        return num_puertas;
    }

    public void setNumPuertas(int n) {
        this.num_puertas = n;
    }

    public String getTipoCombustible() {
        return tipo_combustible;
    }

    public void setTipoCombustible(String t) {
        this.tipo_combustible = t;
    }
    @Override
    public void mostrar_Info() {
        super.mostrar_Info();
        System.out.println("Número de puertas: " + num_puertas);
        System.out.println("Tipo de combustible: " + tipo_combustible);
    }
    
    public static void mostrarCochemas4puertas(Coche[] c, int x){
           for (int i = 0; i < x; i++) {
            if (c[i].getNumPuertas() > 4) {
                c[i].mostrar_Info();
            }
        }
    }
    public static void cocheactual2025(Coche[] c, int y){
             for (int i = 0; i < y; i++) {
            if (c[i].getAño() >= 2021) {
                c[i].mostrar_Info();
            }
        }
    }
}
