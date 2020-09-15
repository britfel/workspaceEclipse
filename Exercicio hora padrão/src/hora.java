
public class hora {
	private int hora;
	private int minu;
	private int segu;
	
	public hora(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	public hora(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}
	public hora(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}
	public hora() {
		this.hora = 0;
		this.minu = 0;
		this.segu = 0;
	}

	public void sethora(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	/* os próximos 2 métodos são considerados "SOBRECARGA" do método setTime
	 * o que significa a sobrecarga?
	 * 		ter vários métodos com o mesmo nome, porém com diferentes listas de parâmetros
	 * 		o que muda? basicamente a quantidade e o tipo de parâmetro
	 */
	public void sethora(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}
	public void sethora(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}
	
	
	public String exibirHoraUniversal() {
		String horaUni;
		horaUni = formataNumero(hora) + ":" + formataNumero(minu) + ":" + formataNumero(segu);
		return horaUni;
	}
	
	/* posso ter métodos PRIVATE? SIM! É comum? Relativamente
	 * por que eu teria Métodos Private? Por exemplo, neste caso, para formatar um número
	 * que tem utilidade APENAS dentro da classe Time, outras classes não tem acesso a ele
	 */
	private String formataNumero(int numero) {
		if (numero < 10) {
			return "0"+numero;
		}
		else {
			return ""+numero;
		}
	}
	
	public String exibirHoraPadrao() {
		String horaPadrao;
		String sufixo; // esse cara assume o AM ou PM
		
		if (hora == 0) {
			horaPadrao = "12";
			sufixo     = "AM";
		}
		else if (hora == 12) {
			horaPadrao = "12";
			sufixo     = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaPadrao = formataNumero(hora);
			sufixo     = "AM";
		}
		else {
			horaPadrao = formataNumero(hora-12);
			sufixo     = "PM";
		}
		horaPadrao = horaPadrao +":" + formataNumero(minu)+":"+formataNumero(segu)+sufixo;
		return horaPadrao;
	}

}