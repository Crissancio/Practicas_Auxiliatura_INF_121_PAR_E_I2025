public class Oficina {
    private int nroSillas;
    private int nroEscritorio;
    private int nroEstanteria;

    public Oficina(int nroSillas, int nroEscritorio, int nroEstanteria) {
        this.nroSillas = nroSillas;
        this.nroEscritorio = nroEscritorio;
        this.nroEstanteria = nroEstanteria;
    }
    public String mostrar(){
        return String.format("sillas:%d escritorios: %d estanteria:%d",this.nroSillas,this.nroEscritorio,this.nroEstanteria);
    }
    public int cantidadMuebles(){
        int s=this.nroEscritorio+this.nroSillas+this.nroEstanteria;
        return s;
    }
}
