public class Juego {

    private Tema tema;
    private Jugador jugador;
    private Pregunta pregunta;

    public Juego(Tema tema, Jugador jugador, Pregunta pregunta) {
        this.tema = tema;
        this.jugador = jugador;
        this.pregunta = pregunta;
    }

    public void init(Jugador jugador1, Tema){
        this.jugador=jugador;

    }


}
