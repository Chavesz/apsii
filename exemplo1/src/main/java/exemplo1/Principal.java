package exemplo1;

public class Principal {

	public static void main(String[] args) {
		
		Banco b3 = new Banco("Jose", "111", 10.0); // criar
		
		System.out.println(b3.getNome()); // mostrar
		b3.setNome ("Joaquim"); // atualizar
		System.out.println(b3.getNome()); // mostrar valor atualizado
	}
}
