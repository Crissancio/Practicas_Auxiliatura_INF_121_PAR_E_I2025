package ejem5;

class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double extra = horasExtras * 50;
        return super.calcularSalario() + extra;
    }

    // Getters y Setters
    public String getLenguajeProgramacion() { 
    	return lenguajeProgramacion; 
    	}
    public void setLenguajeProgramacion(String lenguajeProgramacion) { 
    	this.lenguajeProgramacion = lenguajeProgramacion; 
    }

    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }
}