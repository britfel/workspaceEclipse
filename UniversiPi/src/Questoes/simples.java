package Questoes;

public class simples {
	protected String enunciado;
	protected String resposta;
	
	public simples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta  = resposta;
	}
	
	public String apresentarQuestao() {
		return "Questao:"+enunciado;
	}
	
	public boolean corrigir(String respAluno) {
		return this.resposta.equalsIgnoreCase(respAluno);
	}

}