
import javax.swing.JOptionPane;

public class Prova {
	public static void main(String[] args) {
		//Scanner teclado = new Scanner(System.in);

		Questões lista[];
		lista = new Questões[5];
		String resp;
		boolean resultado;

		lista[0] = new Questões("Quanto vale 1+1?", "2");
		lista[1] = new Questões("Qual a formula da água?", "H2O");
		lista[2] = new Questões("Qual a cor do cavalo Branco de Napoleao?", "Marrom");
		lista[3] = new Questões("Quem ganhou o Sub 20 da 2a divisão do Paulista 2019", "XV de Jaú");
		lista[4] = new Questões("Quem descobriu o Brasa?", "PA Cabral");

		for (Questões q : lista) {

			//System.out.println(q.apresentarQuestao());
			// vou ler a resposta do usuario
			//resp = teclado.nextLine();
			
			resp = JOptionPane.showInputDialog(q.apresentarQuestao());
			resultado = q.corrigir(resp);
			if (resultado) {
				JOptionPane.showMessageDialog(null,"ACERTOU!");
				//System.out.println("ACERTOU - parabéns");
			} else {
				JOptionPane.showMessageDialog(null, "ERROU");
				//System.out.println("ERRRROOOOUUUWWW - Lembre do Faustão falando...");
			}

		}
		//teclado.close();
	}
}
