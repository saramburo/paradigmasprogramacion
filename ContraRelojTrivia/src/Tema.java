/*emas: John
		Tiene límite de tiempo
		Son 12 preguntas por tema
		Categoría especial con preguntas mixtas
		Tiene texto
		Tiene medallas

 */

public class Tema {
    private int Qpreguntas;
    private String categorias;
    private String texto;
    private int Qmedallas;




    public Tema(){
        this(12,"","",1);
    }
    public Tema(int preguntas, String categoría, String texto, int Qmedallas){
        this.Qpreguntas=Qpreguntas;
        this.categorias=categoría;
        this.texto=texto;
        this.Qmedallas=Qmedallas;

    }


    public void setQpreguntas(int qpreguntas) {
        Qpreguntas = qpreguntas;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setQmedallas(int qmedallas) {
        Qmedallas = qmedallas;
    }

    public int getQpreguntas() {
        return Qpreguntas;
    }

    public String getCategorias() {
        return categorias;
    }

    public String getTexto() {
        return texto;
    }

    public int getQmedallas() {
        return Qmedallas;
    }

}
