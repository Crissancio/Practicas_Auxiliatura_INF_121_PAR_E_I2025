import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nomA;
    private List <Empleado> empleados;

    public ArchivoEmpleado(String nomA){
        this.nomA = nomA;
        this.empleados = new ArrayList<>();
        cargarArchivo();
    }

    public void crearArchivo(){
        empleados.clear();
        guardarArchivo();
    }

    //a)
    public void guardarEmpleado(Empleado e){
        empleados.add(e);
        guardarArchivo();
    }

    //b)
    public Empleado buscarEmpleado(String nombre){
        for(Empleado e: empleados){
            if(e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(double salarioMin){
        for(Empleado e: empleados){
            if(e.getSalario() > salarioMin){
                return e;
            }
        }
        return null;
    }

    public void guardarArchivo(){
        try(PrintWriter pw = new PrintWriter(new FileWriter(nomA))){
            for(Empleado e : empleados){
                pw.println(e.toLinea());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void cargarArchivo(){
        empleados.clear();
        File archivo = new File(nomA);
        if(!archivo.exists()) return;

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine()) != null){
                Empleado e = Empleado.desdeLinea(linea);
                empleados.add(e);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
