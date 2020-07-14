import curso.*;

public class Main {
    public static void main(String[] args) {
        try (Examen ex = new Examen()) {
            Estudiante e = new EstudianteBueno("Juan");
            Estudiante f = new EstudianteMalo("Jose");
            e.estudiar();
            f.estudiar();
        } catch (EstudianteException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getEstudiante());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
