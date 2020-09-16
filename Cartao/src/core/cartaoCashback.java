package core;

public class cartaoCashback extends cartaoPrepago {
	private int tipo;

	public cartaoCashback(String nomeTitular, String numeroCartao, int mesValidade, int anoValidade, double saldo,
			int tipo) {
		super(nomeTitular, numeroCartao, mesValidade, anoValidade);
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			switch (this.tipo) {
			case 0:
				super.saldo += valor * 0.08;
				break;
			case 1:
				super.saldo += valor * 0.05;
				break;
			case 2:
				super.saldo += valor * 0.02;
				break;
			}
			return true;
		}

		else {
			return false;
		}
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
