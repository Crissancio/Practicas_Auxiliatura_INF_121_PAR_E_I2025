/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
5. Ejercicio 5 : Persistencia
a) Crear, leer y mostrar un Archivo de Farmacias.
b) Mostrar los medicamentos para la tos, de la Sucursal numero X.
c) Mostrar el numero de sucursal y su direccion que tiene el medicamento "Golpex".
*/
package p3.ejer5.per;

public class P3Ejer5Per {
    public static void main(String[] args) {
        // a)
        ArchFarmacia arch = new ArchFarmacia("farmacias.txt");
        arch.crearArchivo();
        Farmacia f1 = new Farmacia();
        f1.nombreFarmacia = "Primera farmacia ";
        f1.sucursal = 1;
        f1.direccion = "Calle plan 51";
        f1.nroMedicamentos = 2;
        f1.m[0] = new Medicamento("Golpex", 1, "Tos", 25.5);
        f1.m[1] = new Medicamento("Refrianex", 2, "Resfrio", 18.0);
        arch.adicionar(f1);

        Farmacia f2 = new Farmacia();
        f2.nombreFarmacia = "Segunda farmacia";
        f2.sucursal = 2;
        f2.direccion = "Av. Juana Azurdui";
        f2.nroMedicamentos = 1;
        f2.m[0] = new Medicamento("Antiflu", 3, "Tos", 12.0);
        arch.adicionar(f2);

        // b) 
        System.out.println("Los medicamentos para la tos son:");
        arch.mostrarMedicamentosTosSucursalX(1);

        // c) 
        System.out.println("Las sucursales con Golpex:");
        arch.mostrarSucursalDireccionConMedicamento("Golpex");
    }
}
