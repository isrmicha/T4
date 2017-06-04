package principal;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario){
		try {
			if(nome.length() > 40 || salario < 350){
				if(nome.length() > 40){
					throw new IllegalArgumentException("Nome muito grande!");
				}
				if(salario < 350){
					throw new ViolacaoCltException("Salário baixo");
				}
			}else{
				this.nome = nome;
				this.salario = salario;
			}
		}catch(ViolacaoCltException e){
			e.getMessage();
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.getMessage();
			e.printStackTrace();
		}		
	}
	
	//Getter e Setters
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
		this.salario = salario;
	}
	
}
