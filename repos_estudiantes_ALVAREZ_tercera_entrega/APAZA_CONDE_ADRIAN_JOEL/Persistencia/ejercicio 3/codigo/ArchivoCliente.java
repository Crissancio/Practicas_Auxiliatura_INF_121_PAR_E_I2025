/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer3.per;

/**
 *
 * @author Adrian
 */
// a) Implementar el diagrama de clases.
import java.io.*;

public class ArchivoCliente {
    public String nomA;

    public ArchivoCliente(String n) {
        this.nomA = n;
    }

    public void crearArchivo() {
        try {
            File archivo = new File(nomA);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("se produjo un error al crear el archivo.");
        }
    }

    public void guardaCliente(Cliente c) {
        try {
            FileWriter fw = new FileWriter(nomA, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(c.toString());
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println("error al guardar al cliente");
        }
    }
// b) Implementar buscarCliente(int c) a traves del id.
    public Cliente buscarCliente(int c) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomA));
            String linea;
            while ((linea = br.readLine()) != null) {
                Cliente cli = Cliente.desdeCadena(linea);
                if (cli.id == c) {
                    br.close();
                    return cli;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("no se encontro al cliente");
        }
        return null;
    }
// c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular. 
    public Cliente buscarCelularCliente(int c) {
        return buscarCliente(c);
    }
}

