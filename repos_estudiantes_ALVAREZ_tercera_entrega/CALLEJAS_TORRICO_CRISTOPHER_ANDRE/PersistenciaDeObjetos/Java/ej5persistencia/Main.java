package ej5persistencia;

public class Main {
    public static void main(String[] args) {
        ArchivoFarmacias archivo = new ArchivoFarmacias("farmacias.json");

        Sucursal s1 = new Sucursal(1, "Prado");
        s1.agregarMedicamento(new Medicamento("Golpex", "dolor"));
        s1.agregarMedicamento(new Medicamento("clorferinamina", "picazon"));

        Sucursal s2 = new Sucursal(2, "Miraflores");
        s2.agregarMedicamento(new Medicamento("ibuprofeno", "tos"));
        s2.agregarMedicamento(new Medicamento("medicasp", "cabello"));

        archivo.guardarSucursal(s1);
        archivo.guardarSucursal(s2);

        archivo.mostrarTodasLasSucursales();

        System.out.println("Medicamentos para la tos en sucursal 2:");
        for (Medicamento m : archivo.mostrarMedicamentosTos(2)) {
            System.out.println(m);
        }

        System.out.println("Sucursales con Golpex:");
        for (String info : archivo.buscarSucursalPorMedicamento("Golpex")) {
            System.out.println(info);
        }
    }
}
