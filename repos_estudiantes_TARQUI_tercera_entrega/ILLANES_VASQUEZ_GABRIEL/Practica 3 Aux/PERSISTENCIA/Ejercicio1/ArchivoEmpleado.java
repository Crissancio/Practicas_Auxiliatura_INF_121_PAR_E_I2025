package Ejercicio1;

import java.io.*;

public class ArchivoEmpleado {
    private String rutaBase;

    public ArchivoEmpleado(String n) {
        this.rutaBase = "C:/Users/Diego/Desktop/mis_empleados/" + n + "/";
        crearArchivo();
    }

    private void crearArchivo() {
        File carpeta = new File(rutaBase);
        if (!carpeta.exists()) carpeta.mkdirs();
    }

    public void guardarEmpleado(Empleado e) throws IOException {
        File archivo = new File(rutaBase + "empleado_" + e.getNombre() + ".txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(e.getNombre() + "\n");
        bw.write(e.getEdad() + "\n");
        bw.write(e.getSalario() + "\n");
        bw.close();
    }

    public Empleado buscaEmpleado(String n) throws IOException {
        File archivo = new File(rutaBase + "empleado_" + n + ".txt");
        if (!archivo.exists()) return null;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String nombre = br.readLine();
        int edad = Integer.parseInt(br.readLine());
        float salario = Float.parseFloat(br.readLine());
        br.close();

        Empleado empleado = new Empleado(nombre, edad, salario);

        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaBase + "empleadoBuscado.txt"));
        bw.write(empleado.toString());
        bw.close();

        return empleado;
    }

    public Empleado mayorSalario(float s) throws IOException {
        File carpeta = new File(rutaBase);
        File[] archivos = carpeta.listFiles();
        if (archivos == null) return null;

        Empleado mayor = null;
        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().startsWith("empleado_")) {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String nombre = br.readLine();
                int edad = Integer.parseInt(br.readLine());
                float salario = Float.parseFloat(br.readLine());
                br.close();

                if (salario > s) {
                    mayor = new Empleado(nombre, edad, salario);
                }
            }
        }

        if (mayor != null) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaBase + "mayorSalario.txt"));
            bw.write(mayor.toString());
            bw.close();
        }

        return mayor;
    }
}
