public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;
    
    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }
//B
    public void mostrar(){
        System.out.println("Oficina: ");
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterias: " + nroEstanterias);
    }
//C
    public int cantidadMuebles(){
        return this.nroSillas + this.nroEscritorios + this.nroEstanterias;
    }
}
