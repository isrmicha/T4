package funcexc;

public class ViolacaoCltException extends IllegalArgumentException{
	
	public ViolacaoCltException(String msg){
		super(msg + "Art. 76 - Salário mínimo é a contraprestação mínima devida e paga diretamente pelo empregador a todo trabalhador,\n inclusive ao trabalhador rural, sem distinção de sexo, por dia normal de serviço,\n e capaz de satisfazer, em determinada época e região do País,\n as suas necessidades normais de alimentação, habitação, vestuário, higiene e transporte.");
	}
}
