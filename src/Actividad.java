import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 0;

    private List<Inscripcion> listaInscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;

        this.listaInscripciones = new ArrayList<>();
    }

    public Inscripcion inscribir(Estudiante estudiante) {
        Inscripcion ins = new Inscripcion(LocalDate.now(), "Inscripto", estudiante, this);
        listaInscripciones.add(ins);

        return ins;
    }

    public void mostrarInscripciones() {
        System.out.println("Hay un total de " + listaInscripciones.size() + " inscripciones"); // <------------- terminar
    }
}
