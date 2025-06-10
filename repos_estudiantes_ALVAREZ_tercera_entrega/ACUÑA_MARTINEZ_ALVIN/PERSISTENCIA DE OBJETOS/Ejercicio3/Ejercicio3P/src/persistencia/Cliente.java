package persistencia;

//a)
import java.util.ArrayList;

class Cliente {
 int id;
 String nombre;
 int telefono;

 public Cliente(int id, String nombre, int telefono) {
     this.id = id;
     this.nombre = nombre;
     this.telefono = telefono;
 }

 @Override
 public String toString() {
     return "ID: " + id + ", Nombre: " + nombre + ", Telefono: " + telefono;
 }
}

//a)
class ArchivoCliente {
 String nomA;
 ArrayList<Cliente> clientes;

 public ArchivoCliente(String nomA) {
     this.nomA = nomA;
     this.clientes = new ArrayList<>();
 }

 public void crearArchivo() {
     clientes = new ArrayList<>();
 }

 public void guardaCliente(Cliente c) {
     clientes.add(c);
 }

 // b)
 public Cliente buscarCliente(int c) {
     for (Cliente cliente : clientes) {
         if (cliente.id == c) {
             return cliente;
         }
     }
     return null;
 }

 // c)
 public String buscarCelularCliente(int c) {
     Cliente cliente = buscarCliente(c);
     if (cliente != null) {
         return "Datos del Cliente: " + cliente + ", Celular: " + cliente.telefono;
     } else {
         return "Cliente no encontrado.";
     }
 }
}
