import java.util.*;

public class Vehiculo {
    private String marca, modelo;
    private int año;
    private double precio_base;
    
    public Vehiculo(String ma, String mo, int a, double p)
    {
        this.marca=ma;
        this.modelo=mo;
        this.año=a;
        this.precio_base=p;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
    
    public void mostrar_info()
    {
        System.out.println("Marca: "+marca+" "+" Modelo: "+modelo);
        System.out.println("Ano: "+año+" "+" Precio: "+precio_base);
    }
}

class Coche extends Vehiculo{
    public int num_Puertas;
    public String tipo_combustible;
    
    public Coche(double n, String t, String ma, String mo, int p, int nu)
    {
        super(ma, mo, p, n);
        this.num_Puertas=nu;
        this.tipo_combustible=t;
    }

    public int getNum_Puertas() {
        return num_Puertas;
    }

    public void setNum_Puertas(int num_Puertas) {
        this.num_Puertas = num_Puertas;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
    
    @Override
    public void mostrar_info()
    {
        super.mostrar_info();;
        System.out.println("Num Puertas: "+num_Puertas+" "+"Tipo combustible:"+tipo_combustible);
    }
}

class Moto extends Vehiculo{
    public double cilindrada;
    public String tipo_motor;
    
    public Moto(double c, String tm, String ma, String mo, int a, double p)
    {
        super(ma, mo, a, p);
        this.cilindrada=c;
        this.tipo_motor=tm;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    
    @Override
    public void mostrar_info()
    {
        super.mostrar_info();;
        System.out.println("Cilindrada: "+cilindrada);
        System.out.println("Tipo Motor: "+tipo_motor);
    }
}
class App {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Coche> coches=new ArrayList<>();
        ArrayList<Moto> motos=new ArrayList<>();
        
        Moto moto1=new Moto(689, "Bicilindrico en linea, 4 tiempos, refrigerado por liquido", "Yamaha", "MT-07", 2023, 8.199);        
        Moto moto2=new Moto(636, "4 cilindros en linea, 4 tiempos, refrigerado por liquido", "Kawasaki", "Ninja ZX-6R", 2025, 11.299);
        Moto moto3=new Moto(1254, "Boxer bicilindrico, 4 tiempos, refrigerado por aire/liquido", "BMW", "R 1250 GS", 2023, 17.995);
        
        Coche coche1=new Coche(24.000, "Gasolina", "Toyota", "Corolla SE", 2023, 4);        
        Coche coche2=new Coche(31.610, "Gasolina", "Honda", "CR-V EX", 2023, 5);
        Coche coche3=new Coche(38.990, "Electrico", "Tesla", "Model 3", 2025, 4);
        
        coches.add(coche1);        
        coches.add(coche2);
        coches.add(coche3);
        
        motos.add(moto1);        
        motos.add(moto2);
        motos.add(moto3);
         
        System.out.println("===COCHES===");
        for(Coche c: coches)
        {
            c.mostrar_info();
            System.out.println();
        }
        
        System.out.println("===MOTOS===");
        for(Moto m: motos)
        {
            m.mostrar_info();
            System.out.println();
        }
        
        System.out.println("=== COCHES CON MAS DE 4 PUERTAS ===");
        for (Coche c : coches) {
            if (c.getNum_Puertas() > 4) {
                c.mostrar_info();
                System.out.println();
            }
        }
        
        System.out.println("===VEHICULOS DEL ANO 2025===");
        for(Coche c: coches)
        {
            if(c.getAño()==2025)
            {
                c.mostrar_info();
                System.out.println();
            }
        }
        
        for(Moto m: motos)
        {
            if(m.getAño()==2025)
            {
                m.mostrar_info();
                System.out.println();
            }
        }
    }
}