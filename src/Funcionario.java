
public class Funcionario {

	private String nome;
	private int matricula;
	protected double salario;
	
	public Funcionario (String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	public void mostrarDetalhes() {
		System.out.println("Detalhes do Funcion�rio: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Salario: " + this.salario);	
		System.out.println("---\n");		
	}

	
}
