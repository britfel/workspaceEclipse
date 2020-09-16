package ui;

import core.cartaoCashback;
import core.cartaoPrepago;

public class Cartao {
	public static void main(String[] args) {

		cartaoPrepago c1;

		c1 = new cartaoPrepago("Professor Isidro", "1111.2222.3333 4444", 10, 2024);

		c1.credito(5000);
		System.out.println(c1.getNomeTitular() + " - " + c1.getNumeroCartao() + " - " + c1.getMesValidade() + "/"
				+ c1.getMesValidade() + " - R$" + c1.getSaldo());
		c1.comprar(1000);
		System.out.println(c1.getNomeTitular() + " - " + c1.getNumeroCartao() + " - " + c1.getMesValidade() + "/"
				+ c1.getMesValidade() + " - R$" + c1.getSaldo());

		if (c1.comprar(2000)) {
			System.out.println("Debito efetuado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c1.getNomeTitular() + " - " + c1.getNumeroCartao() + " - " + c1.getMesValidade() + "/"
				+ c1.getMesValidade() + " - R$" + c1.getSaldo());

		System.out.println();

		cartaoCashback c2;
		c2 = new cartaoCashback("Jose das Couves", "2222.3333.4444.6655", 11, 2022, 0, 0);

		c2.credito(5000);
		System.out.println(c2.getNomeTitular() + " - " + c2.getNumeroCartao() + " - " + c2.getMesValidade() + "/"
				+ c2.getMesValidade() + " - R$" + c2.getSaldo() + "Tipo " + c2.getTipo());
		c2.comprar(1000);
		System.out.println("Compra efetuada com sucesso");
		System.out.println(c2.getNomeTitular() + " - " + c2.getNumeroCartao() + " - " + c2.getMesValidade() + "/"
				+ c2.getMesValidade() + " - R$" + c2.getSaldo() + "Tipo " + c2.getTipo());
		c2.comprar(800);
		System.out.println("Compra efetuada com sucesso");

	}
}