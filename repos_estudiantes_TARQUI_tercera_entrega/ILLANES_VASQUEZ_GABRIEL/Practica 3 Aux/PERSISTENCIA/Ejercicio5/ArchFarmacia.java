package Ejercicio5;

import java.io.*;
import java.util.ArrayList;

public class ArchFarmacia {
    private String na;

    public ArchFarmacia(String na) {
        this.na = "C:/Users/Diego/Desktop/mis_farmacias/" + na + ".txt";
        new File("C:/Users/Diego/Desktop/mis_farmacias/").mkdirs();
    }

    public void crearArchivo(ArrayList<Farmacia> lista) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(na));
        for (Farmacia f : lista) {
            bw.write(f.getDatos());
        }
        bw.close();
    }

    public void leerYMostrar() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(na));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }

    public void mostrarMedicamentosTosSucursal(int suc) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(na));
        String linea;
        boolean mostrar = false;

        while ((linea = br.readLine()) != null) {
            if (linea.equals("###")) {
                mostrar = false;
            } else if (linea.contains(";")) {
                int s = Integer.parseInt(linea.split(";")[0]);
                mostrar = (s == suc);
            } else if (mostrar && linea.contains(",")) {
                String[] datos = linea.split(",");
                if (datos[1].equalsIgnoreCase("Tos")) {
                    System.out.println("Medicamento para la tos: " + datos[0]);
                }
            }
        }
        br.close();
    }

    public void mostrarSucursalesConMedicamento(String nombreMed) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(na));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Diego/Desktop/mis_farmacias/encontradas.txt"));
        String linea;
        String sucursal = "", direccion = "";
        boolean dentro = false;

        while ((linea = br.readLine()) != null) {
            if (linea.equals("###")) {
                dentro = false;
            } else if (linea.contains(";")) {
                sucursal = linea.split(";")[0];
                direccion = linea.split(";")[1];
                dentro = true;
            } else if (dentro && linea.contains(",")) {
                if (linea.split(",")[0].equalsIgnoreCase(nombreMed)) {
                    String salida = "Sucursal: " + sucursal + ", Dirección: " + direccion;
                    System.out.println(salida);
                    bw.write(salida + "\n");
                    dentro = false;
                }
            }
        }
        br.close();
        bw.close();
    }
}
