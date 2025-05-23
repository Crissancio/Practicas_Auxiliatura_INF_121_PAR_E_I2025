// a) codificar la clase con getters y setters
class Moto extends Vehiculo {
    private int cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, double precio_base, int c, String t) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = c;
        this.tipo_motor = t;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int c) {
        this.cilindrada = c;
    }

    public String getTipoMotor() {
        return tipo_motor;
    }

    public void setTipoMotor(String t) {
        this.tipo_motor = t;
    }
    @Override
    public void mostrar_Info() {
        super.mostrar_Info();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de motor: " + tipo_motor);
         }
    public static void motoactual2025(Moto[] m, int c){
             for (int i = 0; i < c; i++) {
            if (m[i].getAño() >= 2021) {
                m[i].mostrar_Info();
            }
        }
    }
}

