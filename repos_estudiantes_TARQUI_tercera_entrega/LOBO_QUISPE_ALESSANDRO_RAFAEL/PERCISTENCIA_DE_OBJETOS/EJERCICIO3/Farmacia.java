import java.io.Serializable;

class Farmacia implements Serializable {
    private String nombreFarmacia;
    private int sucursal;
    private String director;
    private int cantMedicamentos;
    private Medicamento[] m = new Medicamento[100];

    public Farmacia() {
        this("", 0, "", 0);
    }

    public Farmacia(String nombreFarmacia, int sucursal, String director, int cantMedicamentos) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.director = director;
        this.cantMedicamentos = cantMedicamentos;
    }

    public void leer() {
        // Implementar lectura de datos si es necesario
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + 
                         ", Sucursal: " + sucursal + 
                         ", Director: " + director + 
                         ", Medicamentos: " + cantMedicamentos);
    }

    public String getDirection() {
        return director;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void mostrarMedicamentos(String tipo) {
        for (int i = 0; i < cantMedicamentos; i++) {
            if (m[i] != null && m[i].getTipo().equalsIgnoreCase(tipo)) {
                m[i].mostrar();
            }
        }
    }

    public Medicamento buscaMedicamento(String nombreMed) {
        for (int i = 0; i < cantMedicamentos; i++) {
            if (m[i] != null && m[i].getNombre().equalsIgnoreCase(nombreMed)) {
                return m[i];
            }
        }
        return null;
    }

    public void agregarMedicamento(Medicamento med) {
        if (cantMedicamentos < 100) {
            m[cantMedicamentos] = med;
            cantMedicamentos++;
        }
    }

	public int getCantMedicamentos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getMedicamento(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
