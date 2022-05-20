package Hash;


public class Main {

	public static void main(String[] args) {
		Hash hash = new Hash(4);
		hash.inserir(new Contato(2,"Rosemberg", "999999999"));
		hash.inserir(new Contato(25,"Lucas", "78978937889"));
		hash.inserir(new Contato(4, "Alex", "46367236276"));
		hash.inserir(new Contato(12, "Hudson", "78748783843"));
		hash.inserir(new Contato(3, "Hudson", "78748783843"));
		
		System.out.println(hash);

	}

}
