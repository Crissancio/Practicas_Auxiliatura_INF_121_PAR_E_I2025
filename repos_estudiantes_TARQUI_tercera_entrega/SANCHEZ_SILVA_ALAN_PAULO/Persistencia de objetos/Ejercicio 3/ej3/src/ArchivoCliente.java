
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nomA;
    private List <Cliente> clientes;

    public ArchivoCliente(String nomA){
        this.nomA = nomA;
        this.clientes = new ArrayList<>();
        cargarArchivo();
    }

    public void crearArchivo(){
        clientes.clear();
        guardarArchivo();
    }

    public void guardarCliente(Cliente c){
        this.clientes.add(c);
        guardarArchivo();
    }

    public Cliente buscarCliente(int id){
        for (Cliente c : this.clientes){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public Cliente buscarCelularCliente(int id){
            for (Cliente c : this.clientes){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    
    public void guardarArchivo(){
        try(PrintWriter writer = new PrintWriter(new FileWriter(nomA))){
            for ( Cliente c : this.clientes){
                writer.println(c.toLinea());
            }
            }catch (IOException e){
                System.out.println("Error al guardar el archivo: "+ e.getMessage());
            }
    }

    public void cargarArchivo(){
        this.clientes.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(nomA))){
            String linea;
            while((linea = reader.readLine()) != null){
                clientes.add(Cliente.desdeLinea(linea));
            }
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado "+ e.getMessage());
        }catch(IOException e ){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
 
}
