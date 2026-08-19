import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;

    private Sala sala;
    private List<Actividad> listaActividades;

    private static int cantidadEventos = 0;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;

        this.listaActividades = new ArrayList<>();

        cantidadEventos++;
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala;

        this.listaActividades = new ArrayList<>(otro.listaActividades);

        cantidadEventos++;
    }

    public void mostrarDatos() {
        System.out.println("====== Mostrando datos de evento ======");
        String strEsGratis = "No";

        System.out.println("Id del evento: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo base: " + costoBase + "$");

        if (gratuito) {
            strEsGratis = "Sí";
        }
        System.out.println("¿Es gratuito?: " + strEsGratis);

        System.out.println("----- Datos de la sala asignada: ");
        sala.mostrarDatosSala();
        System.out.println("-----");

        System.out.println("----- Actividades:");
        for(Actividad act : listaActividades)
        {
            act.mostrarDatosAct();
            System.out.println("---");
        }


        System.out.println("=======================================");
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupoMax) {
        listaActividades.add(new Actividad(id, titulo, cupoMax));
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
