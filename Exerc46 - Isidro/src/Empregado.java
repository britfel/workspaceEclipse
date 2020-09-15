

public class Empregado {
	// atributos
	private String nome;
	private String cargo;
	private double salario;
	
	// vamos criar um m�todo construtor
	// o cabe�alho dele � diferente dos demais
	public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
	}

	// vou entao criar m�todos para acessar esses atributos
	// 1 m�todo para modificar o valor (ex: eu posso criar rotinas de valida��o)
	// 1 m�todo para consultar o valor (ex: formatar o salario com 2 digitos)

	// "atribuir" em ingl�s = set
	// "consultar" em ingl�s = get
	
	// this.nome refere-se ao atributo NOME, equanto que NOME refere-se ao Par�metro passado
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void imprimir() {
		System.out.println("Nome   : " + nome);
		System.out.println("Cargo  : " + cargo);
		System.out.printf("Salario: R$ %.2f\n", salario);
		System.out.printf("Imposto: R$ %.2f\n", calcularImposto());
	}

	/*
	 * todo m�todo tem o seguinte cabe�alho (assinatura)
	 * 
	 * TIPO_RETORNO nomeMetodo (LISTA_PARAMETROS_DE_ENTRADA) TIPO NOME, TIPO NOME2,
	 * TIPO NOME, ...
	 */
	// o intuito deste m�todo � modificar o valor do atributo SALARIO
	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

	public double calcularImposto() {
		/*
		 * salario <= 2000 --> 0 salario >2000 <= 4500 --> 10% salario > 4500 ---> 1200
		 * 
		 */
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 4500.0) {
			imposto = salario * 0.1;
		} else {
			imposto = 1200.0;
		}
		return imposto;

	}

}