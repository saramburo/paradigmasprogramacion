import java.util.*;
public class Juego {

    private final List<Pregunta> preguntas;
    private int aciertos;
    private int errores;// ¿Alguien sabe el antónimo de acierto en este contexto? yo no


    public Juego() {
        this.preguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta p) {
        this.preguntas.add(p);
    }

    public void preguntar() {
        int numero = 1;
        for (Pregunta p : this.preguntas) {
            boolean acierta = p.preguntar(numero);
            numero++;
            if (acierta) {
                System.out.println("Correcto");
                this.aciertos++;
            } else {
                System.out.println("Incorrecto");
                this.errores++;
            }
        }
    }





}
