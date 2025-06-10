public class Cliente {
    private int id, telefono;
    private String nombre;

    public Cliente(int id, String nombre, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String toLinea(){
        return id + "|" + nombre + "|" + telefono;
    }

    public static Cliente desdeLinea(String linea){
        String [] partes = linea.split("\\|");
        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        int telefono = Integer.parseInt(partes[2]);
        return new Cliente(id, nombre, telefono);
    }

@Override
    public String toString(){
        return "ID" + id +"\nNombre: " + nombre + "\nTelefono: " + telefono;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
