public class Vehiculo {

    public String marca;
    public String modelo;
    public int año;
    public double precioBase;

    public Vehiculo(String marca, String modelo, int año, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioBase = precioBase;
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
 
    public double getPrecioBase() { 
        return precioBase; 
    }
    public void setPrecioBase(double precioBase) { 
        this.precioBase = precioBase; 
    }

    public String mostrarInfo() {
        return marca + " " + modelo + " - Año: " + año + " - Precio base: $" + precioBase;
    
}
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[] {
            new Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina"),
            new Coche("Ford", "Explorer", 2025, 35000, 5, "Hibrido"),
            new Moto("Yamaha", "MT-07", 2025, 7500, 689, "Bicilindrico"),
            new Moto("Honda", "CBR500R", 2021, 7000, 471, "Bicilindrico")
        };

        System.out.println("Informacion de vehiculos:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.mostrarInfo());
        }

        System.out.println("\nCoches con mas de 4 puertas:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche coche && coche.getNumPuertas() > 4) {
                System.out.println(coche.mostrarInfo());
            }
        }

        System.out.println("\nVehiculos del año 2025:");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                System.out.println(v.mostrarInfo());
            }
        }
    }
    
}