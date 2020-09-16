package Prova;

import javax.swing.JOptionPane;

import Questoes.Dica;
import Questoes.escolha;
import Questoes.simples;

public class Prova {
	public static void main(String[] args) {
		
	

		simples[] lista;
		lista = new simples[3];
		String resp;
		boolean resultado = false;

		lista[0] = new simples("Quanto vale 1+1?", "2");
		lista[1] = new Dica("que time comemora pinga??","Parece um coqueiro.", "Palmeiras");
		lista[2] = new escolha("Qual cachorro late??","Gato", "Cachorro", "Porco", "b");
						
		for (simples q : lista) {
			resp = JOptionPane.showInputDialog(q.apresentarQuestao());
			resultado = q.corrigir(resp);
		
			if (resultado) {
				JOptionPane.showMessageDialog(null,"ACERTOU!");
			} 
			else {
			JOptionPane.showMessageDialog(null, "ERROU");
			}
		}
		
		
		


	}



}
