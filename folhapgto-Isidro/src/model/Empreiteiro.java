package model;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(String nome, int numRegistro, float valorEmpreita) {
		super(nome, numRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		return valorEmpreita;
	}
	
	public String toString() {
		return "Empreiteiro: "+super.nome+" ("+super.numRegistro+")";
	}
}