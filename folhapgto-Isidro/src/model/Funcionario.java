package model;

public abstract class Funcionario {
	protected String nome;
	protected int    numRegistro;
	public Funcionario(String nome, int numRegistro) {
		super();
		this.nome = nome;
		this.numRegistro = numRegistro;
	}
	
	public abstract float calcularSalario();
	
	public String toString() {
		return "Funcionario: "+nome+" ("+numRegistro+")";
	}

}
