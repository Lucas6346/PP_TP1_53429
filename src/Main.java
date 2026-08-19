class Main
{
    public static void main(String[] args)
    {
        EventoUniversitario evento1 = new EventoUniversitario("1", "Taller de Robótica", 1200, false);

        EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
        copiaEvento1.mostrarDatos();

        EventoUniversitario evento2 = new EventoUniversitario("2", "Curso X", 0, true);
        evento2.mostrarDatos();

        System.out.println("Cantidad de eventos creados: " + copiaEvento1.getCantidadEventos());
    }
}
