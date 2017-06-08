package principal;

public class ViolacaoCltException extends IllegalArgumentException{
	
	public ViolacaoCltException(String msg){
		super(msg + "\nArt. 76 - Salário mínimo é a contraprestação mínima devida e paga diretamente pelo empregador a todo trabalhador, \ninclusive ao trabalhador rural, sem distinção de sexo, por dia normal de serviço, e capaz de satisfazer, em determinada época e região do País, \nas suas necessidades normais de alimentação, habitação, vestuário, higiene e transporte.");
	}
}
