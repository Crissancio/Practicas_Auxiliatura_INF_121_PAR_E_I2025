package Persistencia.Ejer3.codigo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoCliente {
    private String nomA;
    ArrayList<Cliente> clientes;

    public ArchivoCliente(String n){
        this.nomA = n;
        this.clientes = new ArrayList<>();
    }
     public void crearArchivo() {
        try {
            File archivo = new File(nomA);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo.");
            e.printStackTrace();
        }
    }
    public void guardarCliente(Cliente c){
        clientes.add(c);
    }
    public void buscarCliente(int c){
        for(Cliente cli : clientes){
            if(cli.getId() == c){
                System.out.println("Cliente encontrado: " + cli);
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }
    public void buscarCelular(int c){
        for(Cliente cli : clientes){
            if(cli.getTelefono() == c){
                System.out.println("Cliente encontrado: " + cli);
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

}
