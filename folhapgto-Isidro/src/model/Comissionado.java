package model;

public class Comissionado extends Funcionario{
	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, int numRegistro, float salarioBase, float comissao) {
		super(nome, numRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario() {
		return salarioBase + salarioBase * comissao / 100;
	}
	
	public String toString() {
		return "Comissionado: "+super.nome+" ("+super.numRegistro+")";
	}

	
	
	

}