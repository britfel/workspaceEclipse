package Funcionario;

public class Empreiteiro extends Funcionario{
	private float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	
	public float salarioBruto() {
		return valorEmpreita;
	}

	@Override
	public void tipofunc() {
		System.out.println("Eu sou horista " + "\n" + "Nome: " + super.Nome + "\n" + "NumRegistro: "
				+ super.numeroRegistro + "\n" + "Salário: " + salarioBruto());

	}

}


