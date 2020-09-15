package userinterface;

import Core.conta;
import Core.contaEspecial;

public class banco {
	public static void main(String[] args) {
		
		conta c1;
		
		c1 = new conta("Professor Isidro", "111.222.333-44", 1234);
		
		System.out.println(c1.getNumeroConta()+":"+c1.getNomeTitular()+"("+c1.getCpf()+") R$"+c1.getSaldo());
		c1.creditar(1000);
		System.out.println(c1.getNumeroConta()+":"+c1.getNomeTitular()+"("+c1.getCpf()+") R$"+c1.getSaldo());
		
		if (c1.debitar(2000)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c1.getNumeroConta()+":"+c1.getNomeTitular()+"("+c1.getCpf()+") R$"+c1.getSaldo());
		
		System.out.println();
		contaEspecial c2;
		c2 = new contaEspecial("Jose das Couves","222.333.444-55",9876, 500.0f);
		
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		c2.creditar(1000);
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		if (c2.debitar(800)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		
		if (c2.debitar(500)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		
	}

}