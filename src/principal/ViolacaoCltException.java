package principal;

public class ViolacaoCltException extends IllegalArgumentException{
	
	public ViolacaoCltException(String msg){
		super(msg + "\nArt. 76 - Sal�rio m�nimo � a contrapresta��o m�nima devida e paga diretamente pelo empregador a todo trabalhador, \ninclusive ao trabalhador rural, sem distin��o de sexo, por dia normal de servi�o, e capaz de satisfazer, em determinada �poca e regi�o do Pa�s, \nas suas necessidades normais de alimenta��o, habita��o, vestu�rio, higiene e transporte.");
	}
}
