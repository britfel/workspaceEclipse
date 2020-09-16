package Questoes;

public class escolha extends simples{
	private String a;
	private String b;
	private String c;
	
	
	public escolha(String enunciado, String a, String b, String c, String resposta) {
		super (enunciado, resposta);
		this.a = a;
		this.b = b;
		this.c = c;
	
	}
	
	public String apresentarQuestao() {
		return "Questao:"+enunciado+"\n" + "A - :"+a+"\n" + "B - :"+b+"\n" + "C - :"+c;
		}
	
		
	public boolean corrigir(String respAluno) {
		return this.resposta.equalsIgnoreCase(respAluno);
	}

}