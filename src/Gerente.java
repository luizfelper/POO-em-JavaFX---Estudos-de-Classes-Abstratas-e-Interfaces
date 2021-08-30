
public class Gerente extends Funcionario {
	
	double bonificacao;
	int senha;
	
	public Gerente(String nome, int cpf, int matricula, double salario, double bonificacao, int senha) {
		super(nome, cpf, matricula, salario);
		this.bonificacao = bonificacao;
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}


	///* METODOS DE NEGÓCIOS */
	public double getBonificacao() {
			double salarioComBonificacao = this.salario * this.bonificacao;
			
		return salarioComBonificacao;
	} //

	public double salarioTotal() {
		double salarioTotal = this.salario + this.getBonificacao();
		
		return salarioTotal;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String autentica(int senha) {
		if (this.senha == senha) {
			
			String nomeGerente = this.getNome();
			int matricula = this.getMatricula();
			double salario = this.salario;
			double salarioTotal = this.salarioTotal();
			
			
			System.out.println("Gerente: " + nomeGerente +
					" | Matrícula: "+ matricula +
					" | Salário: " + salario +
					" | Salário total: " + salarioTotal);
			
			return toString();
			
		} else {
			System.out.println("Não deu certo!");
			return toString();
		}
	}
}
