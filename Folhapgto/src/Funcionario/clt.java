package Funcionario;

public class clt extends Funcionario{
	private float salarioBase;
	private float Valetransporte;
	private float Valerefeicao;
	
	public clt(String nome, int numeroRegistro, float salarioBase, float valetransporte, float valerefeicao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		Valetransporte = valetransporte;
		Valerefeicao = valerefeicao;
	}

	public float salarioBruto() {
		return salarioBase + Valerefeicao +Valetransporte;
	}


	@Override
	public void tipofunc() {
		System.out.println("Eu sou CLT "+"\n"+"Nome: "+super.Nome +"\n"+"NumRegistro: "+super.numeroRegistro+"\n"+"Salário: "+salarioBruto());
		
	}
	
}
