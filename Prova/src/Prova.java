
import javax.swing.JOptionPane;

public class Prova {
	public static void main(String[] args) {
		

		Quest�es lista[];
		lista = new Quest�es[5];
		String resp;
		boolean resultado;

		lista[0] = new Quest�es("Quanto vale 1+1?", "2");
		lista[1] = new Quest�es("Qual a formula da �gua?", "H2O");
		lista[2] = new Quest�es("Qual a cor do cavalo Branco de Napoleao?", "Marrom");
		lista[3] = new Quest�es("Quem ganhou o Sub 20 da 2a divis�o do Paulista 2019", "XV de Ja�");
		lista[4] = new Quest�es("Quem descobriu o Brasa?", "PA Cabral");

		for (Quest�es q : lista) {
					
			resp = JOptionPane.showInputDialog(q.apresentarQuestao());
			resultado = q.corrigir(resp);
			if (resultado) {
				JOptionPane.showMessageDialog(null,"ACERTOU!");
				
			} else {
				JOptionPane.showMessageDialog(null, "ERROU");
				
			}

		}
	
	}
}
