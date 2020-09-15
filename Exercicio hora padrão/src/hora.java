
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
	/* os pr�ximos 2 m�todos s�o considerados "SOBRECARGA" do m�todo setTime
	 * o que significa a sobrecarga?
	 * 		ter v�rios m�todos com o mesmo nome, por�m com diferentes listas de par�metros
	 * 		o que muda? basicamente a quantidade e o tipo de par�metro
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
	
	/* posso ter m�todos PRIVATE? SIM! � comum? Relativamente
	 * por que eu teria M�todos Private? Por exemplo, neste caso, para formatar um n�mero
	 * que tem utilidade APENAS dentro da classe Time, outras classes n�o tem acesso a ele
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