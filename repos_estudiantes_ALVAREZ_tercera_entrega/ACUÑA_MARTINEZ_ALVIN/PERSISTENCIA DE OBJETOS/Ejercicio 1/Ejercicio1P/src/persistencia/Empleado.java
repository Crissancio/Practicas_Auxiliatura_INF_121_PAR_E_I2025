package persistencia;

//Clase Empleado
class Empleado {
 String nombre;
 int edad;
 float salario;

 Empleado(String nombre, int edad, float salario) {
     this.nombre = nombre;
     this.edad = edad;
     this.salario = salario;
 }
}

//Clase ArchivoEmpleado
class ArchivoEmpleado {
 String nomA;
 Empleado[] empleados = new Empleado[100];
 int contador = 0;

 ArchivoEmpleado(String nomA) {
     this.nomA = nomA;
 }

 // a)
 void guardarEmpleado(Empleado e) {
     empleados[contador] = e;
     contador++;
 }

 // b)
 Empleado buscaEmpleado(String n) {
     for (int i = 0; i < contador; i++) {
         if (empleados[i].nombre.equals(n)) {
             return empleados[i];
         }
     }
     return null;
 }

 // c)
 Empleado mayorSalario(float sueldo) {
     for (int i = 0; i < contador; i++) {
         if (empleados[i].salario > sueldo) {
             return empleados[i];
         }
     }
     return null;
 }
}


