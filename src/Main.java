class EventoUniversitario
{
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
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

        cantidadEventos++;
    }
    public void MostrarDatos()
    {
        System.out.println("====== Mostrando datos de evento ======");
        String strEsGratis = "No";

        System.out.println("Id del evento: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Costo base: " + costoBase);

        if(gratuito)
        {
            strEsGratis = "Sí";
        }
        System.out.println("¿Es gratuito?: " + strEsGratis);
        System.out.println("=======================================");
    }
    public int getCantidadEventos()
    {
        return cantidadEventos;
    }
}

class Main
{
    public static void main(String[] args)
    {
        EventoUniversitario evento1 = new EventoUniversitario("1", "Taller de Robótica", 1200, false);
        EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);

        copiaEvento1.MostrarDatos();
        System.out.println("Cantidad de eventos creados: " + copiaEvento1.getCantidadEventos());
    }
}
