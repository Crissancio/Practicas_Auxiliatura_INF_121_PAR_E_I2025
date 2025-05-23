import java.util.ArrayList;

public class Carrito {
    public int nroProductos;
    public ArrayList<Producto> productos;

    public Carrito() {
        this.nroProductos = 0;
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        this.nroProductos++;
    }

    public boolean esMenos10Productos(){
            if(this.nroProductos > 10){
                System.out.println("El carrito tene que tener menos de 11 productos");
                return false;
            }else{
                return true;
            }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------Carrito---------------\n");
        sb.append("Número de productos: ").append(nroProductos).append("\n");
        for (Producto producto : productos) {
            sb.append(producto.toString());
        }
        return sb.toString();
    }
    public int getNroProductos() {
        return nroProductos;
    }
    public void setNroProductos(int nroProductos) {
        this.nroProductos = nroProductos;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
}
