import java.time.LocalDate;
import java.util.List;

class EventoUniversitario
{
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;

    Sala sala;
    List<Actividad> actividadEvento;

    private static int cantidadEventos = 0;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito)
    {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;

        cantidadEventos++;
    }
    public EventoUniversitario(EventoUniversitario otro)
    {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala;
        this.actividadEvento = otro.actividadEvento;

        cantidadEventos++;
    }
    public void mostrarDatos()
    {
        System.out.println("====== Mostrando datos de evento ======");
        String strEsGratis = "No";

        System.out.println("Id del evento: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo base: " + costoBase + "$");

        if(gratuito)
        {
            strEsGratis = "Sí";
        }
        System.out.println("¿Es gratuito?: " + strEsGratis);
        System.out.println("=======================================");
    }
    public void asignarSala(Sala sala)
    {
        this.sala = sala;
    }
    public void crearActividad(int id, String titulo, int cupoMax, int cupoMin)
    {
        actividadEvento.add(new Actividad(id, titulo, cupoMax, cupoMin));
    }
    public int getCantidadEventos()
    {
        return cantidadEventos;
    }
}

class Sala
{
    private int id;
    private String nombre;
}

class Actividad
{
    private int id;
    private String titulo;
    private int cupoMaximo;
    public final int CUPO_MINIMO;

    List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo, int cupoMinimo)
    {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        CUPO_MINIMO = cupoMinimo;
    }
    public Inscripcion Inscribir(Estudiante estudiante)
    {
        inscripciones.add(new Inscripcion(LocalDate.now(), "Inscripto", estudiante, this));
        return inscripciones.getLast();
    }
    public void mostrarInscripciones()
    {
        System.out.println("Hay un total de " + inscripciones.size() + " inscripciones");
    }
}

class Inscripcion
{
    private LocalDate fecha;
    private String estado;
    final Estudiante est;
    final Actividad act;

    public Inscripcion(LocalDate fecha, String estado, Estudiante est, Actividad act)
    {
        this.fecha = fecha;
        this.estado = estado;
        this.est = est;
        this.act = act;
    }
}

class Estudiante
{
    private String legajo;
    private String nombre;
}