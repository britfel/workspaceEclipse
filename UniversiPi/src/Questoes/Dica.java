package Questoes;

public class Dica extends simples{
	private String dica;
	
	
	public Dica(String enunciado, String dica, String resposta) {
		super (enunciado, resposta);
		this.dica = dica;
	
	}
	
	public String apresentarQuestao() {
		return "Questao:"+enunciado+"Dica: "+dica ;
	}
	
		
	public boolean corrigir(String respAluno) {
		return this.resposta.equalsIgnoreCase(respAluno);
	}

}