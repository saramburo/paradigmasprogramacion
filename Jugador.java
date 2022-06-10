public class Jugador {
/*
Tiene 3 vidas
		Tiene que escoger tema
		Tiene que escoger respuesta
		El jugador pierde vidas al responder
		Puede cambiar preguntas 2 veces.
		Gana medallas
*/
    private int vidas;
    private String nombre;
    private int medallas;


    // Metodo default constructor para un jugador cuando inicia el juego
    public Jugador(){
        this(3,"",0);
    }
    // Metodo constructor del jugador
    public Jugador( int vidas, String nombre, int medallas){
        this.vidas=vidas;
        this.nombre=nombre;
        this.medallas=medallas;
    }


    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
