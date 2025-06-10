package Ejercicio3;

import java.io.*;

public class ArchivoCliente {
    private String rutaBase;

    public ArchivoCliente(String n) {
        this.rutaBase = "C:/Users/Diego/Desktop/mis_clientes/" + n + "/";
        crearArchivo();
    }

    private void crearArchivo() {
        File carpeta = new File(rutaBase);
        if (!carpeta.exists()) carpeta.mkdirs();
    }

    public void guardaCliente(Cliente c) throws IOException {
        File archivo = new File(rutaBase + "cliente_" + c.getId() + ".txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(c.getNombre() + "\n");
        bw.write(c.getId() + "\n");
        bw.write(c.getTelefono() + "\n");
        bw.close();
    }

    public Cliente buscarCliente(int c) throws IOException {
        File archivo = new File(rutaBase + "cliente_" + c + ".txt");
        if (!archivo.exists()) return null;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String nombre = br.readLine();
        int id = Integer.parseInt(br.readLine());
        int telefono = Integer.parseInt(br.readLine());
        br.close();

        Cliente cliente = new Cliente(nombre, id, telefono);

        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaBase + "clienteBuscado.txt"));
        bw.write(cliente.toString());
        bw.close();

        return cliente;
    }

    public Cliente buscarCelularCliente(int c) throws IOException {
        File carpeta = new File(rutaBase);
        File[] archivos = carpeta.listFiles();
        if (archivos == null) return null;

        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().startsWith("cliente_")) {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String nombre = br.readLine();
                int id = Integer.parseInt(br.readLine());
                int telefono = Integer.parseInt(br.readLine());
                br.close();

                if (telefono == c) {
                    Cliente cliente = new Cliente(nombre, id, telefono);

                    BufferedWriter bw = new BufferedWriter(new FileWriter(rutaBase + "celularBuscado.txt"));
                    bw.write(cliente.toString());
                    bw.close();

                    return cliente;
                }
            }
        }

        return null;
    }
}
