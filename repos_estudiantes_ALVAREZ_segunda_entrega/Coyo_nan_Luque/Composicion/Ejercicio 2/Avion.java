class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public String mostrarAvion() {
        StringBuilder info = new StringBuilder();
        info.append("Avión: ").append(modelo).append("\n");
        info.append("Fabricante: ").append(fabricante).append("\n");
        info.append("Partes:\n");
        
        for (Parte parte : partes) {
            info.append("- ").append(parte.mostrarInfo()).append("\n");
        }
        
        return info.toString();
    }
}