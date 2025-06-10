package PERSISTENCIA.Ejercicio5.Java;

public class Main {
    public static void main(String[] args) {
        GestorFarmacia gestor = new GestorFarmacia();

        Sucursal s1 = new Sucursal(1, "Av. Villazón #123");
        s1.agregarMedicamento(new Medicamento("Golpex", "tos"));
        s1.agregarMedicamento(new Medicamento("Ibuprofeno", "dolor"));

        Sucursal s2 = new Sucursal(2, "Calle Bueno #456");
        s2.agregarMedicamento(new Medicamento("Vitamina C", "inmunidad"));

        gestor.guardarSucursal(s1);
        gestor.guardarSucursal(s2);

        gestor.mostrarMedicamentosTos(1);
        gestor.mostrarSucursalesConGolpex();
    }
}
