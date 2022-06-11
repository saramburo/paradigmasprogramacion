public class Jugador {
/*
Tiene 3 vidas
		Tiene que escoger tema
		Tiene que escoger respuesta
		El jugador pierde vidas al responder
		Puede cambiar preguntas 2 veces.
		Gana medallas
		Pierde todas las vidas al finalizar el tiempo
		No puede tener vidas menores a 0
		pierde el juego con 0 vidas
*/
    private int vidas;
    private String nombre;
    private int medallas;
    private int score;
    private String tema;



    // Metodo default constructor para un jugador cuando inicia el juego
    public Jugador(){
        this(3,"",0,0,"");
    }
    // Metodo constructor del jugador
    public Jugador( int vidas, String nombre, int medallas, String tema){
        this.vidas=vidas;
        this.nombre=nombre;
        this.medallas=medallas;
        this.score=score;
        this.tema=tema;
    }


    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }
    // Retorna la cantidad de vidas que tiene el jugador en el momento, para que aparezca en la interfaz gráfica
    public int getVidas() {
        return vidas;
    }
    // Retorna el nombre del jugador, para que aparezca en la interfaz gráfica
    public String getNombre() {
        return nombre;
    }
   // Retorna la cantidad de medallas que tiene el jugador en el momento, para que aparezca en la interfaz gráfica
    public int getMedallas() {
        return medallas;
    }


}
