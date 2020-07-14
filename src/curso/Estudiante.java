package curso;

public abstract class Estudiante {
    private final String name;

    public Estudiante(String name) {
        this.name = name;
    }

    public abstract void estudiar() throws EstudianteException;

    public String getName() {
        return name;
    }
}
