package curso;

public class EstudianteBueno extends Estudiante {
    public EstudianteBueno(String name) {
        super(name);
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando");
    }
}
