package principal;

public class Funcionario {

	private int matricula;
	private String nome;
	private double salario;
	static int matriculas = 0;

	public Funcionario(String nome, double salario) {
		try {
			if (nome.length() > 40 || salario < 350) {
				if (nome.length() > 40) {
					throw new IllegalArgumentException("Nome muito grande!");
				}
				if (salario < 350) {
					throw new ViolacaoCltException("Salário abaixo do mínimo");
				}
			} else {
				this.nome = nome;
				this.salario = salario;
				this.matricula = ++Funcionario.matriculas;
			}
		} catch (ViolacaoCltException e) {
			e.getMessage();
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.getMessage();
			e.printStackTrace();
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

	public void setSalario(double salario) {
		if(salario>0){
			try{
				if(salario>1.1*(this.salario)){
					throw new AumentoAbsurdoException("Aumento acima de 10% !");
				}
			} 
			catch (AumentoAbsurdoException e) {
			e.getMessage();
			e.printStackTrace();
		}	
		
		
	}
	
	}
}
