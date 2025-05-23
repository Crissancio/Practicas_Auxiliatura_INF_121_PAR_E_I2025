class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Avión: " + modelo + " - Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            System.out.println("- " + parte.mostrarInfo());
        }
    }
}