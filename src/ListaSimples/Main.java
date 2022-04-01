package ListaSimples;

public class Main {

	public static void main(String[] args) {
		
		Nodo elemento1 = new Nodo();
		
		elemento1.setDado(24);
		
		Nodo elemento2 = new Nodo();
		
		elemento2.setDado(12);
		
		elemento1.setProximo(elemento2);
		
		ListaSimples lista = new ListaSimples();
		
		lista.setPrimeiro(elemento1);
		
		System.out.println(lista.getPrimeiro().getDado());
		
		lista.adicionarNoInicio(34);
		
		System.out.println(lista.getPrimeiro().getDado());
		
		lista.adicionarNoFinal(35);
		
		System.out.println(lista.getSize());
		
	}

}
