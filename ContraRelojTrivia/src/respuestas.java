
public class respuestas {
	
	 String pregunta; //Pregunta textual asociada
	    String contenido1; //Respuesta textual 1
	    String contenido2; //Respuesta textual 2
	    int rtanumero; //Número de la respuesta
	    char fov; //Falso o verdadero


 public respuestas(String pregunta, String contenido1, String contenido2, int rtanumero, char fov) {
	    this.pregunta = pregunta;
	    this.contenido1= contenido1;
	    this.contenido2= contenido2;
	    this.rtanumero= rtanumero;
	    this.fov= fov; 
			
		}

public respuestas () //sin parámetros
	{
	this.pregunta = "Escoja la pregunta por favor";
	this.contenido1= "Respuesta opcional 1";
	this.contenido2= "Respuesta opcional 2";
	this.rtanumero= 0;
	this.fov='V';
	}


	//Getters Permitir uso de datos externo

    public String getPregunta()
    {
    	return pregunta;
    }

	public String getContenido1()
	{
	    return contenido1;
	}

	public String getContenido2()
	{
	    return contenido2;
	}

	public int getRtanumero()
	{
	    return rtanumero;
	}

	public char getFov()
	{
	    return fov;
	} 

 //setters 
	
	public void setPregunta(String pregunta)
	{
		this.pregunta=pregunta;
	}
	
	public void setContenido1(String contenido1)
	{
		this.contenido1=contenido1;
	}
	
	public void setContenido2(String contenido2)
	{
		this.contenido2=contenido2;
	}
	
	public void setRtanumero(int rtanumero)
	{
		this.rtanumero=rtanumero;
	}
	
	public void setFov(char fov)
	{
		this.fov=fov;
	}
	
	//imprimir datos de la clase
	
	public void imprimmirRespuesta()
	{
	    System.out.println("-----DATOS DE RESPUESTA-----");
	    System.out.println("La pregunta es: " + this.getPregunta());
	    System.out.println("La respuesta 1 es: " + this.getContenido1());
	    System.out.println("La respuesta 2 es: " + this.getContenido2());
	    System.out.println("El número de la respuesta es: " + this.getRtanumero());
	    System.out.println("La respuesta es: " + this.getFov());
	    System.out.println("----------------------------");
	} 

}
