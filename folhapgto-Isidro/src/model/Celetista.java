package model;

public class Celetista extends Funcionario {
	private float valeTransporte;
	private float valeAlimentacao;
	private float salarioBase;
	public Celetista(String nome, int numRegistro, float valeTransporte, float valeAlimentacao, float salarioBase) {
		super(nome, numRegistro);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;
		this.salarioBase = salarioBase;
	}
	@Override
	public float calcularSalario() {
		return salarioBase + valeAlimentacao + valeTransporte;
	}
	
	public String toString() {
		return "Celetista: "+super.nome+" ("+super.numRegistro+")";
	}
	
	

}
