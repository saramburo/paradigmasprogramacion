public class Tema {
	/*emas: Juan
	Tiene limite de tiempo
	Son 12 preguntas por tema
	Categoría especial con preguntas mixtas
	tiene texto
	tiene medallas
*/


private  int  Qpreguntas ;
private String Tema ;
private  String  descripcionTema ;
private int Qmedallas;




 public Tema (){
    this( 12 , "" , "" , 1 );
}
public  Tema ( int  preguntas , String  Tema , String  descripcionTema , int  Qmedallas ){
    this.Qpreguntas = Qpreguntas;
    this.Tema = Tema ;
    this.descripcionTema = descripcionTema;
    this.Qmedallas = Qmedallas;

}


public  void  setQpreguntas ( int  qpreguntas ) {
    Qpreguntas = qpreguntas ;
}

public  void  setTema ( String tema ) {
    this.Tema = Tema ;
}

public  void  setDescripcionTema ( String  descripcionTema ) {
    this.descripcionTema = descripcionTema ;
}

public  void  setQmedallas ( int  qmedallas ) {
    Qmedallas = qmedallas ;
}

public  int  getQpreguntas () {
    return  Qpreguntas ;
}

 public String getTema () {
    return  Tema ;
}

public  String  getDescripcionTema () {
    return  descripcionTema ;
}

public  int  getQmedallas () {
    return  Qmedallas ;
}

public  void  cambiarTema (){

}

}


