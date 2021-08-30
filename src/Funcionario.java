
public class Funcionario extends Pessoa {
	
	int matricula;
	double salario;
	
	public Funcionario(String nome, int cpf, int matricula, double salario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String mostrarDetalhes() {
		String nome = this.nome;
		int matricula = this.getMatricula();
		double salario = this.salario;
		
		System.out.println(
				"Nome: " + nome +
				" | Matrícula: " + matricula + 
				" | Salário: " + salario
				);
		
		return toString();		
	}
	
}
