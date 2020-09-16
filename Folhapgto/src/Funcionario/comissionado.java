package Funcionario;

public class comissionado extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	

	public comissionado(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao) {
			super(nome, numeroRegistro);
			this.salarioBase = salarioBase;
			this.adicionalFuncao = adicionalFuncao;
			
			
		}

	public float salarioBruto() {
			return salarioBase + salarioBase * adicionalFuncao/100;
		}

	@Override
	public void tipofunc() {
		System.out.println("Eu sou comissionado " + "\n" + "Nome: " + super.Nome + "\n" + "NumRegistro: "
				+ super.numeroRegistro + "\n" + "Salário: " + salarioBruto());

	}
	

}


