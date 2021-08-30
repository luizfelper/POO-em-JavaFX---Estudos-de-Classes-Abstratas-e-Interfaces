
public class App {

	public static void main(String[] args) {
		Funcionario Funcionario12345 = new Funcionario("Luiz Felipe", 123652123, 1225, 1100);
		Funcionario12345.mostrarDetalhes();
		
		Gerente GerenteMarcos = new Gerente("Marcos", 0540053321, 678910, 2200, 0.10, 123456); //nome, cpf, matricula, salario, bonificacao, senha
		GerenteMarcos.autentica(1234567);
		
	}

}
