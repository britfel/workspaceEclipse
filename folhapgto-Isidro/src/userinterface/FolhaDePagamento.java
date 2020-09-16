package userinterface;

import model.Celetista;
import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		Funcionario folha[] = new Funcionario[6];
		folha[0] = new Chefe("Josineidson",1001,2000.0f, 15.0f, 350.0f);
		folha[1] = new Comissionado("Adriana",1002, 1850.0f, 25.0f);
		folha[2] = new Horista("Carlos", 1003, 70.0f, 50);
		folha[3] = new Horista("Priscila", 1004, 75.0f, 35);
		folha[4] = new Empreiteiro("Emanuel",1005, 2750.0f);
		folha[5] = new Celetista("Mariana", 1006, 650.0f, 800.0f, 2500.0f);
		
		for (Funcionario f: folha) {
			
			
			System.out.println(f +"   Salario R$ "+f.calcularSalario());
		}
	}

}