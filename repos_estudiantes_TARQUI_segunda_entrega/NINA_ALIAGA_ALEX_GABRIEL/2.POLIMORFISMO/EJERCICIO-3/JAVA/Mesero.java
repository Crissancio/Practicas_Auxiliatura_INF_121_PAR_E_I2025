class Mesero extends Empleado {
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    @Override
    public double sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas Extra: " + horasExtra + ", Sueldo por Hora: " + sueldoHora + ", Propina: " + propina);
    }
}