
public class Gerente extends Funcionario {
	
	private double bonificacao;
	private int senha;

	public Gerente(String nome, int matricula, double salario, double bonificacao, int senha) {
		super(nome, matricula, salario);
		this.bonificacao = bonificacao;
		this.senha = senha;
	}

	///* M�TODOS DE NEG�CIO */
	public double getBonificacao() {
			double salarioComBonificacao = this.salario * this.bonificacao;
			
		return salarioComBonificacao;
	} //

	public double salarioTotal() {
		double salarioTotal = this.salario + this.getBonificacao();
		
		return salarioTotal;
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Detalhes do Gerente: ");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Salario: " + this.salario);
		System.out.println("Salario com bonificacao: " + this.salarioTotal());	
		System.out.println("---\n");		
	}
	
}
