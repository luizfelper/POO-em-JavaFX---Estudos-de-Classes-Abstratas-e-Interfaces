
public class App {

	public static void main(String[] args) {
		Funcionario Funcionario12345 = new Funcionario("Luiz Felipe", 12345, 1100);
		Funcionario12345.mostrarDetalhes();
		
		Gerente GerenteMarcos = new Gerente("Gerente Marcos", 678910, 2200, 0.10, 123456); //nome, mat., salario, bonificacao, senha
	
		GerenteMarcos.mostrarDetalhes();
		
	}

}
