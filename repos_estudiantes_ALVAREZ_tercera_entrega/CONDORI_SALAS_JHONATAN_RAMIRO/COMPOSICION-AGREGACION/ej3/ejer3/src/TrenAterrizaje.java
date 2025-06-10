public class TrenAterrizaje {
    private String tipo;
    public TrenAterrizaje(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void mostrarInfo() {
        System.out.println("Tren de Aterrizaje: Tipo " + tipo);
    }
}