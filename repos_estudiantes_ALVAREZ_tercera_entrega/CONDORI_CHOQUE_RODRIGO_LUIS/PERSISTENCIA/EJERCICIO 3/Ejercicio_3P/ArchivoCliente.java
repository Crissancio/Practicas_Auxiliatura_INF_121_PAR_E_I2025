package Ejercicio_3P;
import java.util.ArrayList;

public class ArchivoCliente {
 String nomA;
 private ArrayList<Cliente> clientes = new ArrayList<>();

 public void guardarCliente(Cliente c) {
     clientes.add(c);
 }

 public Cliente buscarCliente(int id) {
     for (Cliente c : clientes) {
         if (c.id == id) return c;
     }
     return null;
 }

 public Cliente buscarCelularCliente(int tel) {
     for (Cliente c : clientes) {
         if (c.telefono == tel) return c;
     }
     return null;
 }
}

