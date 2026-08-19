import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 0;

    private List<inscripcion> listaInscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;

        this.listaInscripciones = new ArrayList<>();
    }

    public inscripcion inscribir(Estudiante estudiante) {
        listaInscripciones.add(new inscripcion(LocalDate.now(), "Inscripto", estudiante, this));
        return listaInscripciones.getLast();
    }

    public void mostrarInscripciones() {
        System.out.println("Hay un total de " + listaInscripciones.size() + " inscripciones"); // <------------- terminar
    }
}
