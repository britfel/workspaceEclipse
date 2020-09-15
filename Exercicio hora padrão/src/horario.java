
public class horario {
	public static void main(String[] args) {
		hora t = new hora();
		t.sethora(8, 2, 5);
		
		System.out.println(t.exibirHoraUniversal());
		
		t.sethora(22, 5, 48);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		System.out.println();
	}

}
