public class Quest�es {
	private String enunciado;
	private String resposta;
	
	public Quest�es(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta  = resposta;
	}
	
	public String apresentarQuestao() {
		return "Questao:"+enunciado;
	}
	
	public boolean corrigir(String respAluno) {
		
//		if (this.resposta.equals(respAluno)) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return this.resposta.equals(respAluno);
	}

}