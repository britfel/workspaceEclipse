package Funcionario;

public class horista extends Funcionario {

	private int horastrab;
	private float valorhora;



public horista(String nome, int numeroRegistro, int horastrab, float valorhora) {
		super(nome, numeroRegistro);
		this.horastrab = horastrab;
		this.valorhora = valorhora;
	}



	public float salarioBruto() {
		return valorhora * horastrab;
	}

	@Override
	public void tipofunc() {
		System.out.println("Eu sou horista " + "\n" + "Nome: " + super.Nome + "\n" + "NumRegistro: "
				+ super.numeroRegistro + "\n" + "Salário: " + salarioBruto());

	}

}
