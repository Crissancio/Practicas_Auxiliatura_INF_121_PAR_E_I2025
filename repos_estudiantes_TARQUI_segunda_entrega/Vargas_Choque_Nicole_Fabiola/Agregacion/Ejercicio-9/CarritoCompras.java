import java.util.*;

public class CarritoCompras {
    private List<Producto> productos;
    
    public CarritoCompras()
    {
        this.productos=new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
     
    public void agregarProducto(Producto p)
    {
        productos.add(p);
    }
    
    public void mostrarCarrito()
    {
        System.out.println("----------------------------CARRITO-------------------");
        for(Producto p: productos)
        {
            p.mostrarInfo();
        }
    }
}

class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String n, double p)
    {
        this.nombre=n;
        this.precio=p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Precio: "+precio);
    }
}

class App {
    public static void main(String[] args) {
        
        Producto p1=new Producto("Sandia", 15.7);        
        Producto p2=new Producto("Cereal", 24.3);
        Producto p3=new Producto("Pollo", 30.2);
        Producto p4=new Producto("Oregano", 5.6);
        
        CarritoCompras c1=new CarritoCompras();
        
        c1.agregarProducto(p1);        
        c1.agregarProducto(p2);
        c1.agregarProducto(p3);
        c1.agregarProducto(p4);
        
        c1.mostrarCarrito();
    }
}