
public class Folhapgto {
	public static void main(String[] args) {

		Funcionario lista[]; // declarei uma LISTA (Vetor, ARRAY) de Empregados;

		// preciso definir o tamanho dela
		lista = new Funcionario[10]; // defini agora que tenho uma lista de 10 referências a empregados
		// é como se eu tivesse lista0, lista1, lista2, lista3,..., lista9

		// criar cada um dos objetos
		lista[0] = new Funcionario("Isidro", "Professor", 2000);
		lista[1] = new Funcionario("Jose", "Vendedor", 1500);
		lista[2] = new Funcionario("Pedro", "Coordenador", 2500);
		lista[3] = new Funcionario("Vera", "Diretora", 3000);
		lista[4] = new Funcionario("Claudete", "Inspetora", 1800);
		lista[5] = new Funcionario("Vicente", "Motorista", 2000);
		lista[6] = new Funcionario("Paulo", "Contador", 2300);
		lista[7] = new Funcionario("Ana", "Advogada", 3500);
		lista[8] = new Funcionario("Caique", "Programador", 2700);
		lista[9] = new Funcionario("Priscilla", "Designer", 2000);

		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.println(
					lista[posicao].getNome() + "/" + lista[posicao].getCargo() + "  R$ " + lista[posicao].getSalario() + " - Imposto: "+ lista[posicao].calcimposto() + " - Sal. Líquido: " + lista[posicao].calcsalario());
		}

	}

}
