import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> pe = new ArrayList<>();
            pe.add(new Estudiante("130", "Mario", "López", "788888", LocalDate.of(1994, 6, 12), "M", "RU010", "2019", 10));
            pe.add(new Estudiante("131", "Sofía", "Ramírez", "699999", LocalDate.of(2002, 9, 22), "F", "RU011", "2023", 2));
            pe.add(new Docente("210", "Javier", "López", "511111", LocalDate.of(1975, 2, 17), "M", "NIT010", "Arquitecto", "Diseño"));
            pe.add(new Docente("211", "Elena", "Ramírez", "433333", LocalDate.of(1990, 12, 5), "F", "NIT011", "Bióloga", "Genética"));

        System.out.println("Estudiantes mayores de 25:");
        for (Persona p : pe) {
            if (p instanceof Estudiante && p.getEdad() > 25) {
                p.mostrar();
            }
        }
        System.out.println("\nDocente Ingeniero, masculino, mayor:");
        Docente mayor = null;
        for (Persona p : pe) {
            if (p instanceof Docente d && d.getProfesion().equals("Ingeniero") && d.getSexo().equals("M")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) mayor.mostrar();
        System.out.println("\nPersonas con el mismo apellido:");
        Map<String, List<Persona>> mapa = new HashMap<>();
        for (Persona p : pe) {
            mapa.putIfAbsent(p.getApellido(), new ArrayList<>());
            mapa.get(p.getApellido()).add(p);
        }
        for (var lista : mapa.values()) {
            if (lista.size() > 1) {
                for (Persona p : lista) p.mostrar();
            }
        }
    }
}
