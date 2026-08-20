import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        //a) Lista de estudiantes
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("53000", "Mateo"));
        listaEstudiantes.add(new Estudiante("53001", "Juan"));
        listaEstudiantes.add(new Estudiante("53002", "Pablo"));
        listaEstudiantes.add(new Estudiante("53003", "Pedro"));
        listaEstudiantes.add(new Estudiante("53004", "Agustín"));

        //b) Eventos
        EventoUniversitario ev1 = new EventoUniversitario("0", "Evento de Sistemas", 5000, false);
        EventoUniversitario ev2 = new EventoUniversitario("1", "Evento de Electrónica", 0, true);

        //c) Asignar salas
        Sala sala1 = new Sala(0, "Sala Sistemas");
        Sala sala2 = new Sala(1, "SUM");
        ev1.asignarSala(sala1);
        ev2.asignarSala(sala2);

        //d) Crear actividades propias de cada evento
        ev1.crearActividad(0, "Taller de sistemas", 50);
        ev1.crearActividad(1, "Curso de Programación", 200);

        ev2.crearActividad(2, "Taller de cableado", 90);

        //e) Inscribir estudiantes a cada actividad
        for (int i = 0; i < 5; i++)
        {
            ev1.getActividad(0).inscribir(listaEstudiantes.get(i));
            ev1.getActividad(1).inscribir(listaEstudiantes.get(i));

            ev2.getActividad(0).inscribir(listaEstudiantes.get(i));
        }

        //f) Mostrar resumen de datos por cada evento
        ev1.mostrarDatos();
        ev1.getActividad(0).mostrarInscripciones();
        ev1.getActividad(1).mostrarInscripciones();

        ev2.mostrarDatos();
        ev2.getActividad(0).mostrarInscripciones();

        //g) Mostrar total de eventos creados
        System.out.println("Total de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}
