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

    public void inscribir(Estudiante estudiante) {
        Inscripcion ins = new Inscripcion(LocalDate.now(), "Inscripto", estudiante, this);
        listaInscripciones.add(ins);
    }

    public void mostrarInscripciones() {
        System.out.println("====== Mostrando Datos de las Inscripciones ======");
        System.out.println("Hay un total de " + listaInscripciones.size() + " inscripciones");
        System.out.println("-----");
        for(Inscripcion ins : listaInscripciones)
        {
            ins.mostrarDatosInscripcion();
            System.out.println("-----");
        }
        System.out.println("==================================================");
    }

    public void mostrarDatosAct() {
        System.out.println("Id: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Cupo máximo: " + cupoMaximo);
    }
}
