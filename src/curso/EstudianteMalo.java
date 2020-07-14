package curso;

import jdk.jshell.spi.ExecutionControl;

public class EstudianteMalo extends Estudiante {
    public EstudianteMalo(String name) {
        super(name);
    }

    @Override
    public void estudiar() throws EstudianteException {
        throw new EstudianteException(getName() + " no estudió para el examen", this);
    }
}
