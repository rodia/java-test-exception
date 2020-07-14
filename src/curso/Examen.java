package curso;

public class Examen implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Examen terminado");
    }
}
