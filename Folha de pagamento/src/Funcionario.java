public class Funcionario {
	private String Nome;
	private String Cargo;
	private Double Salario;

	
	
	public Funcionario(String nome, String cargo, int Salario) {
		this.Nome = nome;
		this.Cargo = cargo;
		this.Salario = (double) Salario;
	}

	
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		this.Nome = nome;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		this.Cargo = cargo;
	}


	public Double getSalario() {
		return Salario;
	}


	public void setSalario(Double salario) {
		this.Salario = salario;
	}


	public void exibirFuncionario() {
		System.out.println("**********************");
		System.out.println("Nome: " + Nome);
		System.out.println("Cargo: " + Cargo);
		System.out.println("Salário: " + Salario);
		System.out.println("Imposto: "+calcimposto());
		System.out.println("**********************");

	}

	public void aumentarSalario(double percentual) {
		Salario = Salario + (Salario * (percentual / 100));
	}

	public double calcimposto() {
		double imposto;
		if (Salario <= 2000) {
			imposto = 0;
		} else if ((Salario > 2000) && (Salario <= 4500)) {
			imposto = Salario * 0.10;
		} else {
			imposto = 1200;
			

		}
		return imposto;
	}
	
	public double calcsalario() {
		double novosalario, imposto;
		if (Salario <= 2000) {
			imposto = 0;
			novosalario = Salario;
		} else if ((Salario > 2000) && (Salario <= 4500)) {
			imposto = Salario * 0.10;
			novosalario = Salario - imposto;
		} else {
			imposto = 1200;
			novosalario = Salario - imposto;
			

		}
		return novosalario;
	}

}
