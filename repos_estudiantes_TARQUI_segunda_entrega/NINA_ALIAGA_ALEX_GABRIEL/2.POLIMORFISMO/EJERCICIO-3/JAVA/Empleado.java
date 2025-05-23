class Empleado {
    protected String nombre;
    protected int sueldoMes;

    public Empleado(String nombre, int sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public double sueldoTotal() {
        return sueldoMes;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Sueldo Mensual: " + sueldoMes);
    }
}