package Folhapgto;

import Funcionario.Empreiteiro;
import Funcionario.Funcionario;
import Funcionario.chefe;
import Funcionario.clt;
import Funcionario.comissionado;
import Funcionario.horista;

public class folha {
	public static void main(String[] args) {

		Funcionario f1, c1, t1, h1, e1;

		f1 = new chefe("João da Silva", 1234, 5000.0f, 5, 600.0f);
		c1 = new comissionado("Jose da Silva", 1235, 2000.0f, 10);
		t1 = new clt("Marcia da Silva", 1236, 1500, 200, 150);
		h1 = new horista("Roberto Souza", 1237, 140, 20f);
		e1 = new Empreiteiro("Bruno Dias", 1238, 5000);

		System.out.println("***********************");
		f1.tipofunc();
		System.out.println("***********************");
		c1.tipofunc();
		System.out.println("***********************");
		t1.tipofunc();
		System.out.println("***********************");
		h1.tipofunc();
		System.out.println("***********************");
		e1.tipofunc();
		System.out.println("***********************");

		/*
		 * Funcionario folha[] = new Funcionario[2]; folha[0] = new
		 * chefe("João da Silva", 1234, 5000.0f, 10, 600.0f); folha[1] = new
		 * comissionado("Jose da Silva", 1235, 1000.0f, 10);
		 * 
		 * for (Funcionario f: folha) { System.out.println(f.);
		 */

	}

}
