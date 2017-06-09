package funcexc;

public class Funcionario {

	private int matricula;
	private String nome;
	private double salario;
	static int matriculas = 0;

	public Funcionario(String nome, double salario) throws ViolacaoCltException,ViolacaoCltException,AumentoAbsurdoException {
		
			if (nome.length() > 40 || salario < 350) {
				if (nome.length() > 40) {
					throw new IllegalArgumentException("Nome muito grande!");
				}else{
					throw new ViolacaoCltException("Sal�rio abaixo do m�nimo");
				}
			} else {
				this.nome = nome;
				this.salario = salario;
				this.matricula = ++Funcionario.matriculas;
			}		
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
        
        public int retUm(){ return 1;}

	public void setSalario(double salario) {
	
			if (salario < 350)
				throw new ViolacaoCltException("Sal�rio abaixo do m�nimo");
			if (salario > (1.1 * this.salario))
				throw new AumentoAbsurdoException("Aumento acima de 10% !");
		
	}
}
