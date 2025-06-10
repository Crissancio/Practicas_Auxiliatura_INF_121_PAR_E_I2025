public class Libro {
    private String titulo;
    private String autor;
    public Libro(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    @Override
    public String toString(){
        return "Libro : "+titulo+" por "+autor;
    }
    @Override 
    public boolean equals(Object obj){
        if (this==obj)return true;
        if(!(obj instanceof Libro)) return false;
        Libro otro=(Libro)obj;
        return titulo.equals(otro.titulo)&& autor.equals(otro.autor);
    }
    
}
