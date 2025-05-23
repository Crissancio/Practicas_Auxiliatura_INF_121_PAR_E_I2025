/*
3. Definir las clases:
Persona <ci, nombre, apellido, celular, fecha_Nac>
Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
Docente (heredado de persona) <nit, profesión, especialidad>
a) Diseñar el diagrama UML de las clases anteriores.
b) Implementa las clases con sus constructores, datos por defecto y 
mostrar.
c) Mostrar los estudiantes mayores de 25 años.
d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo 
masculino y es el mayor de todos.
e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
 */
public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[10];
        Docente[] docentes = new Docente[10];
        int contEst = 0;
        int contDoc = 0;
        estudiantes[contEst++] = new Estudiante("1234567", "Juan", "Perez", "77712345","15/05/1995", "123456789", "10/01/2020", 8);
        estudiantes[contEst++] = new Estudiante("7654321", "Maria", "Gomez", "77754321","20/08/2000", "987654321", "15/01/2021", 6);
        estudiantes[contEst++] = new Estudiante("1122334", "Carlos", "Perez", "77711223","10/03/1998", "112233445", "20/01/2019", 10);
        docentes[contDoc++] = new Docente("4455667", "Pedro", "Gomez", "77744556","05/12/1980", "Masculino", "4455667-0", "Ingeniero", "Sistemas");
        docentes[contDoc++] = new Docente("7788990", "Ana", "Lopez", "77777889","12/07/1975", "Femenino", "7788990-1", "Licenciada", "Educación");
        docentes[contDoc++] = new Docente("3344556", "Luis", "Perez", "77733445","25/09/1970", "Masculino", "3344556-2", "Ingeniero", "Electrónica");
        System.out.println("Estudiantes: ");
        for (int i = 0; i < contEst; i++) {
            estudiantes[i].mostrar();
        }
        System.out.println("\n Docentes ");
        for (int i = 0; i < contDoc; i++) {
            docentes[i].mostrar();
        }
        // c)
        Estudiante.calcularEdadMayora25(estudiantes, contEst);
        // d)
        Docente.mostrarDocenteIngenieroMasculinoYMayorqueTodos(docentes, contDoc);
        //e)
        Estudiante.mostrarestudiantesMismoApellido(estudiantes, contEst, docentes, contDoc);
    }
}