from medicamento import Medicamento
from farmacia import Farmacia
from archfarmacia import ArchFarmacia

if __name__ == "__main__":
    m1 = Medicamento(1, "Golpex", "tos", 10.5, 50)
    m2 = Medicamento(2, "Tapcin", "resfrio", 8.0, 40)
    m3 = Medicamento(3, "Bronquis", "tos", 12.0, 20)

    f1 = Farmacia("Farmacia NICOL", 1, "Ciudad Satelite")
    f1.agregarMedicamento(m1)
    f1.agregarMedicamento(m2)

    f2 = Farmacia("Farmacia RAFAEL", 2, "CALLE 11 A ")
    f2.agregarMedicamento(m3)

    arch = ArchFarmacia("farmacias_arch")
    arch.crearArchivo()
    arch.adicionar(f1)
    arch.adicionar(f2)

    arch.mostrarMedicamentosTos(1) 
    arch.buscarFarmaciasConMedicamento("Golpex") 
