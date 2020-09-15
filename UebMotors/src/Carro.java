// definir arq(classe), as caracteristicas de um carro
public class Carro {
	String marca;
	String modelo;
	int ano;
	int finalPlaca;
	String cor;
	String combustivel;
	float preco;	
	
	// definir os metodos ou funcionalidades da classe
	void exibirAnuncio() {
		System.out.println("*** oferta ***");
		System.out.println(marca+"/"+modelo);
		System.out.println("ano: "+ano + " Final da placa:"+finalPlaca);
		System.out.println("Cor:"+cor);
		System.out.println("Preço: "+preco);
		System.out.println("**********************");
	
	}
	
	float calcularIPVA() {
		float ipva;
		ipva = preco * 0.3f;
		return ipva;
	}
	
	}


