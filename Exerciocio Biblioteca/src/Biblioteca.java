
public class Biblioteca{
	public static void main(String[] args) {
		Livro l1, l2, l3;
		
		l1 = new Livro("E01", "Pessoa, Fernando", 1986, "Poesia",false);
		l2 = new Livro("E05", "Rosa, Guimarães", 1970, "Poesia",true);
		l3 = new Livro("E05", "Cervantes, Miguel de", 1989, "Ficção",false);
		
		System.out.println("-------> Biblioteca Nacional ....");
		l1.imprimir();
		l2.imprimir();
		l3.imprimir();
		
		
	}
		
		

}
