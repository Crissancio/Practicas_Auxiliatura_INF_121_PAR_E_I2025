import java.io.*;
import java.util.ArrayList;

public class ArchivoCliente {
    private String nomA;
    private ArrayList<Cliente> clientes;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
        this.clientes = new ArrayList<>();
    }

    public void crearArchivo() throws IOException {
        File archivo = new File(nomA);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    public void guardarCliente(Cliente c) throws IOException {
        FileWriter fw = new FileWriter(nomA, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(c.getId() + "," + c.getNombre() + "," + c.getTelefono() + "\n");
        bw.close();
    }

    public Cliente buscarCliente(int id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nomA));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            if (Integer.parseInt(datos[0]) == id) {
                br.close();
                return new Cliente(id, datos[1], Integer.parseInt(datos[2]));
            }
        }
        br.close();
        return null;
    }

    public Cliente buscarCelularCliente(int telefono) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nomA));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            if (Integer.parseInt(datos[2]) == telefono) {
                br.close();
                return new Cliente(Integer.parseInt(datos[0]), datos[1], telefono);
            }
        }
        br.close();
        return null;
    }
}