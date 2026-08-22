import java.util.ArrayList;
import java.util.List;

//FIXME ¿cambiar parametro de EventoUniversitario.getActividad(int i)?

public class App
{
    public static void main(String[] args)
    {
        //a) Estudiantes
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("53000", "Mateo"));
        listaEstudiantes.add(new Estudiante("53001", "Juan"));
        listaEstudiantes.add(new Estudiante("53002", "Pablo"));

        //b) Evento
        EventoUniversitario ev1 = new EventoUniversitario("0", "Evento de Sistemas", 5000, false);

        //c) Sala
        Sala sala1 = new Sala(0, "Sala Sistemas");
        ev1.asignarSala(sala1);

        //d) Actividades
        ev1.crearActividad(0, "Charla de sistemas", 50, "Charla", "Juan Perez");
        ev1.crearActividad(1, "Taller de Programación", 200, "Taller", true);

        //e) Inscribir estudiantes en la charla
        ev1.getActividad(0).inscribir(listaEstudiantes.get(0));
        ev1.getActividad(0).inscribir(listaEstudiantes.get(1));

        //e) Inscribir estudiantes en el taller
        ev1.getActividad(1).inscribir(listaEstudiantes.get(1));
        ev1.getActividad(1).inscribir(listaEstudiantes.get(2));

        // Mostrar resumen de datos del evento y total de eventos creados
        ev1.mostrarDatos();
        System.out.println("Total de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}
