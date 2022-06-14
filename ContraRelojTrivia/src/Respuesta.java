import java.util.*;
public class Respuesta {

    public String respuesta;

     public boolean esCorrecta;

    public Respuesta(String respuesta, boolean esCorrecta) {
        this.respuesta = respuesta;
        this.esCorrecta = esCorrecta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public boolean esCorrecta() {
        return this.esCorrecta;
    }
}
