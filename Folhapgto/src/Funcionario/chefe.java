package Funcionario;

public class chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	
	public chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno; 
		
	}
	
	
	public float salarioBruto() {
		return salarioBase + salarioBase*adicionalFuncao/100+beneficioTerno;
	}


	@Override
	public void tipofunc() {
		System.out.println("Eu sou chefe né "+"\n"+"Nome: "+super.Nome +"\n"+"NumRegistro: "+super.numeroRegistro+"\n"+"Salário: "+salarioBruto());
		
	}
	
	

}
