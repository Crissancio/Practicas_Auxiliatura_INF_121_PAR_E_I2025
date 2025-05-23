class Cocinero extends Empleado {
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public double sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas Extra: " + horasExtra + ", Sueldo por Hora: " + sueldoHora);
    }
}