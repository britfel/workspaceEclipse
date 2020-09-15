
public class UebiMotors {
	public static void main(String arg[]) {
		Carro c1, c2, c3;
				
		c1 = new Carro();
		c2 = new Carro();
		c3 = new Carro();
		
		c1.ano = 1986;
		c1.combustivel = "Gasolina";
		c1.cor = "azul";
		c1.finalPlaca = 8;
		c1.marca = "Fiat";
		c1.modelo = "147 abarth";
		c1.preco = 75000;
		
		c2.ano = 1978;
		c2.combustivel = "Alcool";
		c2.cor = "preto";
		c2.finalPlaca = 2;
		c2.marca = "Volks";
		c2.modelo = "Fuscão sport";
		c2.preco = 95000;
		
		c3.ano = 1982;
		c3.combustivel = "Alcool";
		c3.cor = "bege";
		c3.finalPlaca = 4;
		c3.marca = "Forde";
		c3.modelo = "Delrey Ghia";
		c3.preco = 75000;
		
		c1.exibirAnuncio();
		float impostoC1 = c1.calcularIPVA();
		System.out.println("VALOR DO IPVA = "+impostoC1);
		c2.exibirAnuncio();
		float impostoC2 = c2.calcularIPVA();
		System.out.println("VALOR DO IPVA = "+impostoC2);
		c3.exibirAnuncio();
		float impostoC3 = c3.calcularIPVA();
		System.out.println("VALOR DO IPVA = "+impostoC3);
		
		
	}

}
