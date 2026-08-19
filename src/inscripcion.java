import java.time.LocalDate;

class inscripcion {
    private LocalDate fecha;
    private String estado;
    private final Estudiante est;
    private final Actividad act;

    public inscripcion(LocalDate fecha, String estado, Estudiante est, Actividad act) {
        this.fecha = fecha;
        this.estado = estado;
        this.est = est;
        this.act = act;
    }
}
