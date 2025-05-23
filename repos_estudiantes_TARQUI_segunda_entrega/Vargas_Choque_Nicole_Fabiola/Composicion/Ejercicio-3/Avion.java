import java.util.*;

class Avión {
    private String modelo, fabricante;
    private List<Parte> partes;
    
    public Avión(String m, String f)
    {
        this.modelo=m;
        this.fabricante=f;
        this.partes=new ArrayList<>();
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

    public List<Parte> getPartes() {
        return partes;
    }

    public void setPartes(List<Parte> partes) {
        this.partes = partes;
    }
    
    public void agregarParte(Parte p)
    {
        partes.add(p);
    }
    
    public void mostrarAvión()
    {
        System.out.println("------------------------AVION---------------------");
        System.out.println("Modelo: "+modelo+" "+"Fabricante: "+fabricante);
        System.out.println("Partes del avion: ");
        for(Parte p: partes)
        {
            p.mostrarInfo();
        }
    }
}

class Parte {
    private String nombre;
    private double peso;
    
    public Parte(String n, double p)
    {
        this.nombre=n;
        this.peso=p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Peso: "+peso);
    }
}

class App {
    public static void main(String[] args) {
        
        Avión a1=new Avión("Boeing 747", "Boeing");
        
        Parte p1=new Parte("Motor", 3500);        
        Parte p2=new Parte("Alas", 8000);
        Parte p3=new Parte("Tren de Aterrizaje", 1200);
        Parte p4=new Parte("Cabina", 1500);
        
        a1.agregarParte(p1);        
        a1.agregarParte(p2);
        a1.agregarParte(p3);
        a1.agregarParte(p4);
        
        a1.mostrarAvión();
    }
}