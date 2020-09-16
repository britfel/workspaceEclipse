package Funcionario;

public abstract class Funcionario {
	protected String Nome;
	protected int numeroRegistro;
	
	public Funcionario(String nome, int numeroRegistro) {
		super();
		Nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	public abstract void tipofunc();


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	

}
