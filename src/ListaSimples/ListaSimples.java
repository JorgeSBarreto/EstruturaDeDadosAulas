package ListaSimples;

public class ListaSimples {
	
	private Nodo primeiro;
	
	public Nodo getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Nodo primeiro) {
		this.primeiro = primeiro;
	}
	
	
	public void adicionarNoInicio(float valor) {
		
		Nodo novoNodo = new Nodo();
		novoNodo.setDado(valor);
		
		
		novoNodo.setProximo(this.getPrimeiro());
		
		this.setPrimeiro(novoNodo);
	}
	
	public void adicionarNoFinal(float valor) {
		Nodo novoNodo = new Nodo();
		novoNodo.setDado(valor);
		
		if (this.getPrimeiro()==null) {
			this.setPrimeiro(novoNodo);
		} else {
		
			Nodo nodoFinal = this.getPrimeiro();
		
			while (nodoFinal.getProximo()!=null) {
				nodoFinal = nodoFinal.getProximo();
				}
			
			nodoFinal.setProximo(novoNodo);
			}
	}
	
	void removerPrimeiroElemento(){ 
	      Nodo nodo = this.getPrimeiro();
	      if (nodo != null) 
	    	 this.setPrimeiro(nodo.getProximo());  
	    }
		

}
