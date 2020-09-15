
public class Livro {
	private String estante;
	private String autor;
	private int edicao;
	private String estilo;
	private boolean emprestado;
	
	public Livro(String estante, String autor, int edicao, String estilo, boolean emprestado) {
        this.estante = estante;
        this.autor = autor;
        this.edicao = edicao;
        this.estilo = estilo;
        this.emprestado = emprestado;
        
	}
	
	public String getestante() {
		return estante;
	}
	
	public void setestante(String estante) {
		this.estante = estante;
	}
	
	public String getautor() {
		return autor;
	}
	
	public void setautor(String autor) {
		this.autor = autor;
	}
	
	
	public int getedicao() {
		return edicao;
	}
	
	public void setedicao(int edicao) {
		this.edicao = edicao;
	}
	
	public String getestilo() {
		return estilo;
	}
	
	public void setestilo(String estilo) {
		this.estilo = estilo;
	}
	
	
	public void situacao() {
			if (emprestado == false) {
			System.out.println("Disponível");
		} else {
			System.out.println("Emprestado");
		} 
	}

	public void imprimir() {
		System.out.println("Estante  : " + estante);
		System.out.println("Autor   : " + autor);
		System.out.println("edicao  : " + edicao);
		System.out.println("Estilo  : " + estilo);
		situacao();
	}


}
