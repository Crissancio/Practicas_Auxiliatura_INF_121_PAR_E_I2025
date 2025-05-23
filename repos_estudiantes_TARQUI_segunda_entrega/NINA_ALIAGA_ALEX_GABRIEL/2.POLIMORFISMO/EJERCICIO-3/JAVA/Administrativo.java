class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, int sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cargo: " + cargo);
    }

    public static void mostrarEmpleadosConSueldo(Empleado[] empleados, int sueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.sueldoMes == sueldo) {
                empleado.mostrarInformacion();
            }
        }
    }
}