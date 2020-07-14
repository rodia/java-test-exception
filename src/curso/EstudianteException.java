package curso;

public class EstudianteException extends Exception {
    private final Estudiante estudiante;

    public EstudianteException(String message, Estudiante estudiante) {
        super(message);
        this.estudiante = estudiante;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public String getEstudiante() {
        return estudiante.getName();
    }
}
